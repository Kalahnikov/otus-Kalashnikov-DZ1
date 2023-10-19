package ru.otus.java.basic.dz1.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class PingServer {
    public static void main(String[] args) throws IOException {
        float calculate = 0;
        try (ServerSocket serverSocket = new ServerSocket(8087)) {
            Socket socket = serverSocket.accept();
            try (
                    DataInputStream in = new DataInputStream(socket.getInputStream());
                    DataOutputStream out = new DataOutputStream(socket.getOutputStream())
            ) {
                out.writeUTF("Онлайн калькулятор с операциями: +, -, *, /");
                out.writeUTF("Введите первое число");
                float a = in.readFloat();
                out.writeUTF("Введите второе число");
                float b = in.readFloat();
                out.writeUTF("Введите допустимую операцию");
                String operation = in.readUTF();

                switch (operation) {
                    case "+":
                        calculate = a + b;
                        break;
                    case "-":
                        calculate = a - b;
                        break;
                    case "*":
                        calculate = a * b;
                        break;
                    case "/":
                            calculate = a / b;
                        break;
                    default:
                        break;
                }
                out.writeUTF("Result: " + calculate);

            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
