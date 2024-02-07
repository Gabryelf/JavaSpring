package ru.geekbrain.example3sem3hometask.domain;

public class User {

    private String name;
    private int age;
    private String email;

    public User(String username, String email) {
    }

    public User() {

    }

    public User(String username, String email, int age) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
