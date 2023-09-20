package ru.otus.java.basic.dz1;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneApp {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook(new HashMap<>());
        phoneBook.addNomber("Иванов А. А.", "89346473242");
        phoneBook.addNomber("Петров А. А.", "89346473225");
        phoneBook.addNomber("Васюков А. А.", "89346473286");
        phoneBook.addNomber("Кротов А. А.", "89346473258");
        phoneBook.addNomber("Мамов А. А.", "89346473211");
        phoneBook.addNomber("Мамов А. А.", "89346473212");
        phoneBook.addNomber("Иванов А. А.", "89346473233");
        System.out.println(phoneBook);
        System.out.println(phoneBook.find("Иванов А. А."));
        System.out.println(phoneBook.containsPhoneNumber("89346473242"));
    }
}
