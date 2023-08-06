package ru.otus.java.basic.homework4;

public class HomeWork4 {
    public static void main(String[] args) {
        User[] users = {
                new User("Иванов", "Иван", "Иванович", 1993, "i@mail.ru"),
                new User("Петров", "Юрий", "Юрьевич", 1994, "q@mail.ru"),
                new User("Сидоров", "Анедрей", "Андреевич", 1995, "w@mail.ru"),
                new User("Климов", "Василий", "Васильевич", 1956, "e@mail.ru"),
                new User("Никитин", "Петр", "Петрович", 1997, "t@mail.ru"),
                new User("Саров", "Александр", "Александрович", 1990, "y@mail.ru"),
                new User("Платов", "Михаил", "Михайлович", 1961, "u@mail.ru"),
                new User("Гордзий", "Сергей", "Сергеевич", 1994, "o@mail.ru"),
                new User("Сахаров", "Никита", "Никитович", 1973, "p@mail.ru"),
                new User("Васюрин", "Константин", "Константинович", 1998, "a@mail.ru")
        };
        for (int i = 0; i < users.length; i++) {
            if ((2023 - users[i].yearOfBirth > 40)) {
                users[i].info();
            }
        }

    }
}
