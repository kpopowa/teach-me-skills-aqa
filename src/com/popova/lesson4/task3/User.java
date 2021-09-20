package com.popova.lesson4.task3;

public class User {

    public static class Address {
        private String country;
        private String city;

        public  Address (String country, String city){
            this.city = city;
            this.country = country;
        }

    }
    public static enum Gender {
        MALE, FEMALE, OTHER
    }

    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
    private  Address address;

    public User(String firstName, String  lastName, int age, Gender gender, Address address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.address = address;

    }

    public User (String firstName, String lastName, Address address){
        this(firstName, lastName, 10, Gender.FEMALE, address);
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public void increaseAge(int number) {
        age = age + number;
    }

    public void increaseAge (String number){
        increaseAge(Integer.parseInt(number));

    }

//    public int increaseAge (int number){
//
//
//    }

    @Deprecated
    public String getInfo(){
        return firstName + " " + lastName + " " + age + " " + gender + " " + address.country + " " + address.city;
    }


}
