package org.example;

public class ArvRepetition {
    public void run() {
        System.out.println("Hello world!");
        Person person = new Person("Jim", 23, "23");
        person.setName(null);
        System.out.println(person.getName());

        Student student = new Student("Luke", 34, "1T", 4.5);
        System.out.println("Luke's Email: " + student.getEmail());

        Person person1 = new OfficeWorker("Greg", 54, "g@mail.com", 50000, "Google");

        Person[] personArray = new Person[] { person, student, person1 };

        for(int i = 0; i < personArray.length; i++) {
            personArray[i].SayHi();
            if (personArray[i] instanceof OfficeWorker) {
                OfficeWorker ow = (OfficeWorker)personArray[i];
                System.out.println("My pay is " + ow.getPay());
            }
        }
    }
}
