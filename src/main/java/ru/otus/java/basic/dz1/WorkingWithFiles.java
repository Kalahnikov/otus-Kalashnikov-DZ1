package ru.otus.java.basic.dz1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkingWithFiles {

    public static void printFile(String fileName) {
        try (FileInputStream in = new FileInputStream(fileName)) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    public static void addTextToFile(String fileName) {
        Scanner scanner1 = new Scanner(System.in);
        String sc = scanner1.nextLine();

        try (FileOutputStream out = new FileOutputStream(fileName)) {
            byte[] buffer = sc.getBytes(StandardCharsets.UTF_8);
            out.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = null;
        List listOfFiles = new ArrayList<String>();
        listOfFiles.add("one");
        listOfFiles.add("two");
        listOfFiles.add("three");

        System.out.println("Выберите фаил с которым будете работать:");

        for (int i = 0; i < listOfFiles.size(); i++) {
            System.out.println(listOfFiles.get(i));
        }
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        switch (scan) {
            case "one":
                fileName = (String) listOfFiles.get(0) + ".txt";
                break;
            case "two":
                fileName = (String) listOfFiles.get(1) + ".txt";
                break;
            case "three":
                fileName = (String) listOfFiles.get(2) + ".txt";
                break;
            default:
                break;
        }

        printFile(fileName);
        addTextToFile(fileName);
    }
}