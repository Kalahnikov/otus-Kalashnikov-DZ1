package ru.otus.java.basic.dz1.client;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainSocket {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try (
                Socket socket = new Socket("localhost", 8087);
                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream())
        ) {
            System.out.println(in.readUTF());
            System.out.println(in.readUTF());
            float a = scanner.nextFloat();
            out.writeFloat(a);
            System.out.println(in.readUTF());
            float b = scanner.nextFloat();
            out.writeFloat(b);
            System.out.println(in.readUTF());
            String operation = scanner.next();
            out.writeUTF(operation);
            System.out.println(in.readUTF());
        }
    }
}



