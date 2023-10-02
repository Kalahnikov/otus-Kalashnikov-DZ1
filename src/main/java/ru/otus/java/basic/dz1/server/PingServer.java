package ru.otus.java.basic.dz1.server;

import ru.otus.java.basic.dz1.client.PingClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

            byte[] res = calculate(readRequest(socket)).getBytes();

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
        while (true) {
            str = reader.readLine() + " ";
            if (str == null || str.trim().isEmpty()) {
                break;
            }
        }
        return str;
    }
    private static String calculate(String str){
        int calculate = 0;
        String [] splitstr = str.split(" ", 2);
        switch (splitstr[2]){
            case "+":
                calculate = Integer.parseInt(splitstr[0]) + Integer.parseInt(splitstr[1]);
                break;
            case "-":
                calculate = Integer.parseInt(splitstr[0]) - Integer.parseInt(splitstr[1]);
                break;
            case "*":
                calculate = Integer.parseInt(splitstr[0]) * Integer.parseInt(splitstr[1]);
                break;
            case "/":
                calculate = Integer.parseInt(splitstr[0]) / Integer.parseInt(splitstr[1]);
                break;
            default:
                break;
        }

        return Integer.toString(calculate);
    }
}
