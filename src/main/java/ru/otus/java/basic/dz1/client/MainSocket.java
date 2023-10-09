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

        String operation = scanner.nextLine();

        byte[] bytesOperation = operation.getBytes();


        try (socket) {
            PingClient pingClient = new PingClient(socket.getInputStream(), socket.getOutputStream());
            pingClient.ping(bytesOperation);
            read(socket);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    private static void read(Socket socket) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str = reader.readLine();
        System.out.println(str);

    }

}
