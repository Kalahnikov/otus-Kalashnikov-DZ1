package ru.otus.java.basic.dz1.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainSocket {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8087);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа и одну из доступных мат. операций: +, -, *, /.");
        String one = scanner.nextLine();
        String two = scanner.nextLine();
        String operation = scanner.nextLine();
        byte[] bytesOne = one.getBytes();
        byte[] bytesTwo = two.getBytes();
        byte[] bytesOperation = operation.getBytes();


        try (socket) {
            PingClient pingClient = new PingClient(socket.getInputStream(), socket.getOutputStream());
            pingClient.ping(bytesOne);
            pingClient.ping(bytesTwo);
            pingClient.ping(bytesOperation);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        read(socket);

    }

    private static void read(Socket socket) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        while (true) {
            String str = reader.readLine();
            if (str == null || str.trim().isEmpty()) {
                break;
            }
            System.out.println(str);
        }
    }

}
