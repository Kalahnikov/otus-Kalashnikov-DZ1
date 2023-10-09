package ru.otus.java.basic.dz1.server;

import ru.otus.java.basic.dz1.client.PingClient;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class PingServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8087);
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            out.write("Введите два числа и одну из доступных мат. операций: +, -, *, /." + "\n");
            byte[] res = calculate(socket).getBytes();
            try (socket) {
                PingClient pingClient = new PingClient(socket.getInputStream(), socket.getOutputStream());
                pingClient.ping(res);
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private static String readRequest(Socket socket) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str;

        str = reader.readLine();

        return str;
    }

    private static String calculate(Socket socket) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str;

        str = reader.readLine();
        int calculate = 0;
        String[] splitter;
        splitter = str.split(" ");
        switch (splitter[2]) {
            case "+":
                calculate = Integer.parseInt(splitter[0]) + Integer.parseInt(splitter[1]);
                break;
            case "-":
                calculate = Integer.parseInt(splitter[0]) - Integer.parseInt(splitter[1]);
                break;
            case "*":
                calculate = Integer.parseInt(splitter[0]) * Integer.parseInt(splitter[1]);
                break;
            case "/":
                calculate = Integer.parseInt(splitter[0]) / Integer.parseInt(splitter[1]);
                break;
            default:
                break;
        }

        return Integer.toString(calculate);
    }

}
