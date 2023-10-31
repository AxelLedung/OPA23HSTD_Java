package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Skapa en array som är 5 ints lång och innehåller numren 1, 2, 3, 4 och 5. Hämta sedan det
        //   nummer som ligger på index 2. Vilket är det?
        //     index:      0, 1, 2, 3, 4
        int[] fiveInts = { 1, 2, 3, 4, 5 };
        int[] fiveInts2 = new int[5]; // Creates an array of 5 items, all default value.

        System.out.println("At index 0 there is " + fiveInts[0]);
        System.out.println("At index 1 there is " + fiveInts[1]);
        System.out.println("At index 2 there is " + fiveInts[2]);
        System.out.println("At index 3 there is " + fiveInts[3]);
        System.out.println("At index 4 there is " + fiveInts[4]);

        //        2. Nu hämta den som ligger på index 0. Sedan, försök hämta den som
        //        ligger på index 5. Vad händer? Varför?
        //System.out.println("At index 5 there is " + fiveInts[5]);
        // It crashes because 5 is not one of the indexes.

        // 3. Skapa en array som innehåller tre strings med tre stycken namn.
        // Loopa igenom dem och skriv ut allihopa.
        String[] names = { "Joe", "Bob", "Lovisa" };
        for (String name : names) { // We can do this with a foreach loop
            System.out.println("Name: " + name);
        }
        for(int i = 0; i < names.length; i++) { // Or a for-loop
            System.out.println("Name: " + names[i] + ", Index: " + i);
        }
        int counter = 0;
        while (counter < names.length) { // Or a while-loop. It works quite the same, albeit some are more suitable than others.
            System.out.println("Name: " + names[counter] + ", Index: " + counter);
            counter++;
        }

        //4. Be användaren att skriva in ett nummer. Hämta den string som ligger på
        // det index du ha angivit.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write an index: ");
        String input = scanner.nextLine();
        // I recommend against using nextInt. It behaves weirdly. Instead, scan a nextLine and then parse it.
        try {
            int index = Integer.parseInt(input);
            System.out.println("Name at index " + index + " is " + names[index]);
        }
        catch (Exception e) {
            System.out.println("That didn't go well.");
            System.out.println(e);
        }

        //5. Skapa en loop. Gå igenom en array av nummer och skriv ut vad alla
        // numren i arrayen summerade blir.
        int[] numbers = { 3, 8, 1, 5, 7 };
        int total = 0;
        for(int number : numbers) {
            total += number; // For each iteration of the loop, add the number to the total.
        }
        total = 0;
        for(int i = 0; i < numbers.length; i++) { // Could also have been done with a for-loop.
            total += numbers[i];
        }
        System.out.println("All numbers summed is " + total);

        //6. Vid en array av strings, tillåt användaren att skriva in en string.
        //   Skriv då ut vilken index den stringen ligger på, om någon.
        //   Skriv annars ”Finns inte”.
        String[] stringArray = { "hey", "hi", "how", "are", "you", "how" };
        System.out.println("Please write one of the strings.");
        input = scanner.nextLine();
        boolean found = false;
        for(int i = 0; i < stringArray.length; i++) {
            if (input.equals(stringArray[i])) {
                found = true;
                System.out.println(input + " is at index " + i);
            }
        }
        // To check if I found something after the loop, I create a boolean, and set it to false.
        // If I find what I look for, I change it to true.
        // I then have an if-statement after checking if the boolean is false. This is only true if I didn't find any.
        if (found == false) {
            System.out.println(input + " does not exist in the array.");
        }


        //7. När du har en lista av ints, låt användaren skriva in ett nummer.
        //   Ta bort de element i listan som har det numret. I början och efter
        //   användaren skriver in ett värde, lista de värden som
        //   fortfarande finns i listan.
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(8);
        intList.add(8);
        intList.add(5);
        intList.add(2);
        intList.add(8);
        intList.add(2);
        intList.add(4);
        for (int num : intList) {
            System.out.print(num + " ");
            // Just print does not put a new line at the end, just printing the numbers next to each other.
        }
        System.out.println(); // Empty println only adds a new line.
        System.out.println("Write the number to remove from above list.");
        input = scanner.nextLine();
        int intToRemove = Integer.parseInt(input);

        // When removing, I need the flexibility of a for-loop.
        // Loop through it. Compare if the value is what we want to remove.
        // If it is, use the remove-function to remove it from the list.
        // However, this will make everything ahead in the list decrease their
        // index with 1. If we're at index 1, the one that was index 2 will
        // become the new index 1 if we remove the item at index 1.
        // This means that, if we let i++ (add 1 to i) happen normally, we'll skip one item.
        // prevent this with i-- if we find one to remove.
        for(int i = 0; i < intList.size(); i++) {
            if (intToRemove == intList.get(i)) {
                intList.remove(i);
                i--;
            }
        }

        System.out.println("intList is now");
        for (int num : intList) {
            System.out.print(num + " ");
        }
        System.out.println();

        //1. Skriv ett program som låter användaren skriva in ett ord. Skriver de rätt ord, låt dem passera.
        //  Annars lås fast dem i loopen tills de skriver rätt.
        String rightWord = "rätt";
        // Exclamation-mark in front of a boolean, or function that returns a boolean, means we're turning it
        // to the opposite. This means, in the below while-loop, we loop if input DOES NOT equal rightWord.
        while (!input.equals(rightWord)) {
            System.out.println("Skriv \"rätt\""); // If you want to write " inside a string, write a \ in front of it.
            input = scanner.nextLine();
            if (!input.equals(rightWord)) {
                System.out.println("Det var inte \"rätt\".");
            }
        }

        //2. Skriv ett program där användaren kan skriva in ett nummer. Spara ett relativt högt nummer
        //först. Låt användaren skriva flera nummer, och när alla nummer de skrivet summerat blir
        //högre än det sparade numret, låt dem passera.

        int highNumber = 100;
        total = 0;
        while (total <= highNumber) {
            System.out.println("Your total is " + total);
            System.out.println("Write a number.");
            try {
                input = scanner.nextLine();
                int number = Integer.parseInt(input);

                total += number;
            }
            catch (Exception e) {
                System.out.println("That was not a number.");
            }
        }
        System.out.println(total + " is higher than " + highNumber + ". You're free to go.");

        //3. Om du inte redan gjorde det, skriv en try {} catch {} på förra uppgiften så att det inte kraschar
        //när användaren skriver någonting som inte är ett nummer. Säg till dem i try-en att inte skriva
        //saker som inte är nummer.
        System.out.println("I did that already.");

        //4. Skriv ett program där man kan välja att addera eller subtrahera från ett tal. Skriver man
        //   "Addera" så frågar den hur mycket man vill addera, och sedan adderas detta till talet.
        //   "Subtrahera" är detsamma, men talet minskas med det istället. Sätt detta i en loop så man kan
        //   göra detta om och om igen tills man skriver ”sluta”.
        total = 0;
        while (true) {
            System.out.println("Total is " + total);
            System.out.println("add or subtract");
            input = scanner.nextLine();
            if (input.equals("add")) {
                input = scanner.nextLine();
                int number = Integer.parseInt(input);
                total += number;
            }
            else if (input.equals("subtract")) {
                input = scanner.nextLine();
                int number = Integer.parseInt(input);
                total -= number;
            }
            else if (input.equals("quit")) {
                break;
            }
        }

    }
}