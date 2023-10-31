package org.example;

public class Student extends Person{
    private String schoolClass;
    private double meanGrade;

    public Student(String name, int age, String schoolClass, double meanGrade) {
        super(name, age);
        this.schoolClass = schoolClass;
        this.meanGrade = meanGrade;
    }

    @Override
    public void SayHi() {
        System.out.println("Hej, jag är " + name + ", kan du rekommendera en lia-plats?");
    }


    public String getSchoolClass() {
        return schoolClass;
    }
    public void setSchoolClass(String schoolClass) {
        this.schoolClass = schoolClass;
    }
    public double getMeanGrade() {
        return meanGrade;
    }
    public void setMeanGrade(double meanGrade) {
        this.meanGrade = meanGrade;
    }
}
