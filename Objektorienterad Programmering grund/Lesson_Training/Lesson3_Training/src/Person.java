public class Person {
    public String name;
    public int age;
    public String adress;
    public Person(String name, int age, String adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }
    public String Introduce() {
        return "Namn: " + name + ", Ålder: " + age + ", Adress: " + adress;
    }
}
