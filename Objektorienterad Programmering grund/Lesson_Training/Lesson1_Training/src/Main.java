import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Övning 1
        //Installera IntelliJ Klart!

        //Övning 2
        // Skapa en int-variabel i Java och skriva ut den med System.out.println();
        int int1 = 4;
        System.out.println(int1);

        //Övning 3
        // Skapa två stycken int-variabler. Skriv ut vad dessa blir när de blir adderade med varandra.
        // Gör sedan detsamma med subtraktion, multiplikation och division.
        int int2 = 3;
        int int3 = 4;

        System.out.println(int2 + " + " + int3 + " = " + (int2 + int3));
        System.out.println(int2 + " - " + int3 + " = " + (int2 - int3));
        System.out.println(int2 + " * " + int3 + " = " + (int2 * int3));
        System.out.println(int2 + " / " + int3 + " = " + (int2 / int3));

        //Övning 4
        //Type-cast två stycken int-variabler till doubles med paranteser framför dem och sedan dela
        //dem. Type-cast är när man skriver en parantes framför variabel-namnet för att använda den
        //som en annan typ.

        System.out.println((double) int2 / (double) int3);

        //Övning 5
        // Tillåt användaren att skriva in text flera gånger. Spara dessa strings i variabler. Addera ihop
        //de olika strings de skrev och skriv ut dessa tillbaks till dem. Gör detta med en Scanner
        //scanner = new Scanner(System.in);, och sedan String input = scanner.nextLine();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv vad du vill:");
        //String input1 = scanner.nextLine();
        System.out.println("Skriv vad du vill en gång till:");
        //String input2 = scanner.nextLine();
        System.out.println("Jag la ihop dina 2 påståenden:");
        //System.out.println(input1 + input2);

        //Övning 6
        //Skapa två stycken byte-variabler som tillsammans blir större än 255 och försök addera dem
        //och skriv ut. Vad händer?
        byte num1 = 125;
        byte num2 = 5;
        //byte numsum = num1 + num2; ERROR!

        //Övning 7
        //Testa nu den ovan övningen, men du type-castar dina bytes som ints för att få den att funka.
        byte numsum = (byte)(num2 + num1);
        System.out.println(numsum);

        //Övning 8
        //Testa att använda Random för att slumpa ett nummer mellan 0 och 75. Det borde vara att
        //skapa en Random random = new Random();, sedan skriva int value = random.nextInt(0, 75).
        //Detta kommer behöva att ni importerar random. Så, då har ni gjort det.

        Random random = new Random();
        int value = random.nextInt(0, 75);
        System.out.println(value);

        //Övning 9
        //Testa nu att slumpa ut två stycken nummer och sedan addera dem, skriv ut.
        int value2 = random.nextInt(0, 75);
        System.out.println(value2);
        System.out.println(value + value2);

        //Övning 10
        // Tillåt användaren att skriva ned två nummer och ett namn. Repetera deras namn tillbaka till
        //dem och addera numren. Testa olika string-funktioner för att göra namnet upper case, lower
        //case eller ersätt alla a med e med replace funktionen, om ni kan hitta dem. Skriv namnet på
        //en string-variabel och sedan en punkt för att komma åt string-funktioner.
        System.out.println("Skriv ett nummer:");
        int num3 = scanner.nextInt();
        System.out.println("Skriv ett till nummer:");
        int num4 = scanner.nextInt();
        //System.out.println("Skriv ditt namn");
        //String name = scanner.nextLine();
        System.out.println("Hej, " + "Dina två nummer var: " + num3 + " och " + num4);
    }
}