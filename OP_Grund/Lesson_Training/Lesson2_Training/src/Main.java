import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
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
        //Uppgift 7
        //Skriv ett program som ber användaren om ett nummer. Ge tillbaka numret multiplicerat
        //med varje heltal som är lägre än det själv, alltså ifall man skriver in 5 får man tillbaka
        //resultatet från 5*4*3*2*1. Testa att göra detta till en funktion som ger tillbaka numret
        System.out.println("Skriv in ett nummer:");
        int multiNum = scanner.nextInt();
        scanner.nextLine();
        int sumNum = 1;
        int endNum = 0;
        for (int i = multiNum; i > 0; i--) {
            sumNum = i * sumNum;
        }
        System.out.println(sumNum);
        //Uppgift 8
        //Skriv ett program där man får skriva ned fem strängar. Om man skriver ned en sträng man
        //redan har skrivit säger programmet till och ber en att skriva ett nytt i dess ställe. När alla är
        //nedskrivna så ge tillbaks dem.

        ArrayList<String> stringArrayList = new ArrayList<String>();
        System.out.println("Skriv 5 Strängar:");
        for (int i = 0; i < 5; i++) {
            String fiveString = scanner.nextLine();
            System.out.println("Du skrev in : " + fiveString);
            for (int j = 0; j < stringArrayList.size(); j++) {
                if (stringArrayList.get(j).equals(fiveString)) {
                    System.out.println("String finns redan, Vad ska den gamla heta? ");
                    stringArrayList.set(j, scanner.nextLine());
                    System.out.println("Nu kan du skriva nästa rad:");
                }
            }
            stringArrayList.add(fiveString);
        }
        System.out.println(stringArrayList);

        //Uppgift 9
        //Skriv ett program där användaren kan skriva ned så många nummer de vill tills de skriver
        //”sluta”. Skriv sedan ned hur många unika nummer de skrev ned. Du vill nog kolla om
        //användaren skrev ”sluta” innan du gör om vad de skrev till ett nummer.


        //Uppgift 10
        //Ha en funktion som heter Call som tar ett argument, ett nummer som är vem man ringer.
        //Gör att funktionen ger tillbaka en string som är svaret från den man ringer, beroende på vem
        //man ringer

        //Funktionen skapad:
        System.out.println(Call(1));
        System.out.println(Call(2));
        System.out.println(Call(3));
        System.out.println(Call(4));
        System.out.println(Call(95820952));


        //Uppgift 11
        //Vi skall spela Sten-Sax-Påse mot datorn. Slumpa först ut vad datorn kommer att göra, men
        //spara det bara, visa det ej. Tillåt användaren att skriva in om de gör sten, sax eller påse. Om
        //de skriver in någonting annat måste de skriva om. Visa nu vad datorn gjorde och bestäm
        //vem som vann. Om det blev samma så kör man igen. Annars så vinner den vars val har
        //övertaget. Sax slår påse, påse slår sten och sten slår sax. Använd loopar och if-satser.

        System.out.println("Datorn vill spela Sten-Sax-Påse med dig!");
        Random random = new Random();
        int computerHand = random.nextInt(1, 4);
        System.out.println("Vad väljer du?");
        System.out.println("1. Sten");
        System.out.println("2. Sax");
        System.out.println("3. Påse");
        int playerHand = scanner.nextInt();
        scanner.nextLine();

            System.out.println(computerHand);
            if (computerHand == 1) {
                System.out.println("Datorn valde: Sten");
            } else if (computerHand == 2) {
                System.out.println("Datorn valde: Sax");
            } else if (computerHand == 3) {
                System.out.println("Datorn valde: Påse");
            } else {
                System.out.println("VA?");
            }
            if (playerHand == 1) {
                System.out.println("Du valde: Sten");
            } else if (playerHand == 2) {
                System.out.println("Du valde: Sax");
            } else if (playerHand == 3) {
                System.out.println("Du valde: Påse");
            } else {
                System.out.println("VA?");
            }
        if (playerHand == computerHand - 1) {
            System.out.println("Du vann!");
        }
        else if (playerHand == 3 && computerHand == 1) {
            System.out.println("Du vann!");
        }
        else if (playerHand == computerHand) {
            System.out.println("Lika");
            System.out.println(computerHand);
            System.out.println(playerHand);
        }
        else {
            System.out.println("Datorn vann!");
        }
    }
    public static String Call(int num) {
        switch (num) {
            case 1:
                return "Hej Son!";
            case 2:
                return "Jag har inte tid att prata nu.";
            case 3:
                return "Jag gillar glass";
            case 4:
                return "Hej pratar med Axel.";
            default:
                return "Numret du försöker nå är inte i bruk.";
        }
    }
}