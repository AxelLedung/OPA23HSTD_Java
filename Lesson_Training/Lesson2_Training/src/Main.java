import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Övning 1
        //Tillåt användaren att skriva in ett nummer mellan 1 och 10. Ifall de gör som du säger, beröm
        //dem. Säg att de gjort fel annars.
        System.out.println("Skriv ett nummer mellan 1 och 10.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (Integer.parseInt(input) > 0 && Integer.parseInt(input) < 11) {
            System.out.println("Bra jobbat!");
        }
        else {
            System.out.println("Du måste skriva ett giltigt nummer mellan 1 och 10");
        }
        //Övning 2
        //Tillåt användaren att skriva in två nummer. Skriv tillbaka det första numret plus det andra,
        //minus det andra, multiplicerat med det andra, delat med det andra samt vilket av de två
        //numren som är högst.
        System.out.println("Skriv in ett nummer");
        String input1 = scanner.nextLine();
        System.out.println("Skriv in ett till nummer");
        String input2 = scanner.next();
        int add = Integer.parseInt(input1) + Integer.parseInt(input2);
        int sub = Integer.parseInt(input1) - Integer.parseInt(input2);
        int multi = Integer.parseInt(input1) * Integer.parseInt(input2);
        double div = (double) Integer.parseInt(input1) / Integer.parseInt(input2);
        System.out.println("Add = " + add + " Sub = " + sub + " Multiplier = " + multi + " Divided = " + div);

        //Övning 3
        //Tänk dig att du programmerar en fart-kamera. Tillåt användaren att skriva in en
        //hastighetsbegränsning. Sedan skall användaren skriva ned en fart. Programmet skall då
        //utvärdera farten. Farten är okej om den är på hastighetsbegränsningen eller lägre. För varje
        //kilometer-i-timmen högre så skicka tillbaka en böter som är större ju högre över
        //hastighetsbegränsningen de körde. Var det över 30 km/h snabbare, skriv i stället ut att
        //körkortet är avstängt.
        System.out.println("Skriv in en max hastighet");
        int maxSpeed = scanner.nextInt();
        System.out.println("Skriv ned den aktuella hastigheten på fordonet");
        int currentSpeed = scanner.nextInt();
        int speedDiff = currentSpeed - maxSpeed;
        if (speedDiff > 0 ) {
            System.out.println("Bötern kommer kosta: " + speedDiff * 100);
        }
        else if (speedDiff > 30){
            System.out.println("Körkort Go Bye-Bye.");
        }
        else {
            System.out.println("Du kör lagligt.");
        }
        //Övning 4
        //Skriv ett program som skriver ut alla nummer mellan 1 och 10, fast skriv inte ut 5.
        for (int i = 0; i <= 10; i++) {
            if ( i != 5) {
                System.out.println(i);
            }
        }
        //Övning 5
        //Skriv ett program som genom en loop skriver ut alla strängar i en string-array.
        String[] stringArray = {"Volvo", "BMW", "Ford", "Mazda"};
        for ( int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
        //Uppgift 6
        //Skriv ett program som fortsätter fråga användaren om nummer tills de skriver ”sluta” eller
        //liknande. Då skall programmet ge tillbaka alla nummer adderade med varandra.
        System.out.println("Skriv in så många nummer du vill:");
        System.out.println("När du inte vill skriva fler nummer skriv: [sluta]");
        String conditionString = scanner.nextLine();
        while (!conditionString.equals("sluta")) {
            System.out.println(conditionString);
            conditionString = scanner.nextLine();
        }
        
    }
}