package org.example;

public class Person {
    protected String name;
    private int age;
    private String email;

    public String getCSV() {
        return name + "," + age + "," + email;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        email = null;
    }
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void SayHi() {
        System.out.println("Hi! My name is " + name + "!");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name != null && !name.equals("George")) {
            this.name = name;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
