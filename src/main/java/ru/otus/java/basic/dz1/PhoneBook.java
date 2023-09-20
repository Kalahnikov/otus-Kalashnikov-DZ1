package ru.otus.java.basic.dz1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    HashMap<String, ArrayList<String>> phoneBook;

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBook +
                '}';
    }

    public PhoneBook(HashMap<String, ArrayList<String>> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public HashMap<String, ArrayList<String>> getPhoneBook() {
        return phoneBook;
    }

    public void addNomber(String name, String number) {
        if(phoneBook.containsKey(name)){
            phoneBook.get(name).add(number);

        }else {
            ArrayList<String> number1 = new ArrayList<>();
            number1.add(number);
            phoneBook.put(name, number1);
        }
    }

    public ArrayList<String> find(String name){
        return phoneBook.get(name);
    }

    public boolean containsPhoneNumber (String number){
        ArrayList<String> number1 = new ArrayList<>();
        for (ArrayList<String> listNumber: phoneBook.values()) {
            number1.addAll(listNumber);
        }
        return number1.contains(number);
    }
}

