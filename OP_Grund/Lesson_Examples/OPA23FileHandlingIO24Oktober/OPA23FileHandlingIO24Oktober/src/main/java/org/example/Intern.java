package org.example;

public class Intern extends OfficeWorker{
    public OfficeWorker mentor;

    public Intern(String name, int age, String email, int pay, String company) {
        super(name, age, email, pay, company);
    }
}
