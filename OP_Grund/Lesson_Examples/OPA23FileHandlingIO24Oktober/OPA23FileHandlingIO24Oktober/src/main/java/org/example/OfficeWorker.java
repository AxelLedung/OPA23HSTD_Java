package org.example;

public class OfficeWorker extends Person {
    private int pay;
    private String company;

    public OfficeWorker(String name, int age, String email, int pay, String company) {
        super(name, age, email);
        this.pay = pay;
        this.company = company;
    }

    @Override
    public void SayHi() {
        System.out.println("Hello, this is " + company + " " + name + ", how can I help you?");
    }

    public int getPay() {
        return pay;
    }
    public void setPay(int pay) {
        this.pay = pay;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
}
