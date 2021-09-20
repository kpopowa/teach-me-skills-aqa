package com.popova.lesson4.task3;

public class Main {
    public static void main(String[] args) {
        User.Address address = new User.Address("Belarus", "Minsk");
        User user = new User("kristina", "popowa", 27, User.Gender.FEMALE, address);

        System.out.println(user.getFullName());
        System.out.println(user.getInfo());
        user.increaseAge(1);
        System.out.println(user.getInfo());

        User user2 = new User ("kristina", "popowa", new User.Address("Belarus", "Borisov"));
        System.out.println(user2.getInfo());

        user2.increaseAge("27");

        com.popova.lesson4.task2.User user3 = new com.popova.lesson4.task2.User();
    }
}
