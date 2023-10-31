package handelsakademin.lektion2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public int variableThatWillNeverDisappear = 2;

    public static void main(String[] args) {
        //Lektion1Repetition();
        //System.out.println("This is after the function.");

        //IfStatementExample();
        //IfOvningarFacit();
        ArrayAndListExample();
        LoopExample();
    }

    private static void IfOvningarFacit() {
        // 1. Skriv ner en if sats som jämför två int a och b. Om a<b gör ingenting.
        //    Om a>b byt plats på värdena i a och b. Skriv ut värdena med en System.out.println().
        int a = 7;
        int b = 5;
        if (a > b) {
            int c = a; // Need to put the value of a somewhere so I don't lose it.
            a = b; // Value of a would be overwritten here if I didn't do the above line.
            b = c;
        }
        System.out.println("a is now " + a + ", b is now " + b);

        // 2. Jämför längden av två strängar ( hint strängNamn.length() ).
        //    Om de är samma längd, skriv ut det. Om de är av olika längd, skriv ut den som är längst
        //    av dem (strängNamn + “ är längst”).
        String aString =  "a string";
        System.out.println("aString is " + aString.length() + " long.");
        String anotherString = "Another1";

        if (aString.length() == anotherString.length()) {
            System.out.println("They are the same length.");
        }
        else if (aString.length() > anotherString.length()) {
            System.out.println(aString + " is the longest.");
        }
        else {
            System.out.println(anotherString + " is the longest.");
        }

        // 3. Om siffrorna a och b är lika eller om siffrorna b och c är lika,
        //    skriv ut “true” i consolen.
        a = 3;
        b = 3;
        int c = 6;
        if (a == b || b == c) {
            System.out.println("true");
        }

        // 4. Vi har 3 tal (4.5, 11.8, 34.3). Vi testar om det första, tredje är lika.
        //    Om de är de så skriver vi till konsolen just detta. Om ovan fall inte är sann så testar
        //    vi om talEtt är lika med eller mindre än talTvå. Om detta fall är sant skriver vi ut talTre.
        //    Annars skriver vi ut talEtt, talTvå och talTre.
        double talEtt = 36.4;
        double talTvå = 11.8;
        double talTre = 34.4;
        if (talEtt == talTre) {
            System.out.println("Tal ett och tal tre är lika.");
        }
        else if (talEtt <= talTvå) {
            System.out.println(talTre);
        }
        else {
            System.out.println(talEtt + ", " + talTvå + " och " + talTre);
        }
    }

    public static void IfStatementExample() {
        Scanner scanner = new Scanner(System.in);
        /*String password = "coolPassword1234!";
        System.out.print("Write the password: ");
        String input = scanner.nextLine();

        boolean bool = password == input;
        System.out.println("bool is " + bool);*/

        System.out.println("Write your age.");
        String input = scanner.nextLine();
        int age;
        try {
            String scopeExample = "I stop existing when this try ends, because I was created in here.";
            age = Integer.parseInt(input);
        }
        catch (Exception e) {
            System.out.println("Not a number.");
            return; // Instantly ends the function.
        }

        // == - If the two variables are equal
        // != - If the two variables are NOT equal
        // < - If the right variable is greater
        // > - If the left variable is greater
        // <= - If the right variable is greater or equal
        // >= - If the left variable is greater or equal
        if (age >= 18) { // Check if we're older or equal to 18
            System.out.println("You can try for driver's license.");
        }
        else if (age >= 15) { // Only if the above if-statement fails, check if we're 15 or older.
            System.out.println("You can get a E-traktor license");
        }
        else { // Only if all above if-statements fails, do the contents of else.
            System.out.println("Wait " + (18 - age) + " years for a car.");
        }

        boolean passedTest = true;

        // AND. &&
        if (age >= 18 && passedTest == true) { // Both sides of the && needs to pass to come in.
            System.out.println("You can have a driver's license.");
        }

        boolean parentPermission = true;
        // OR. ||
        if (age >= 18 || parentPermission == true) { // Either side of the || needs to pass to come in.
            System.out.println("You can have candy.");
        }

        boolean canAfford = true;

        // If we combine multiple conditions, make sure to have parenthesis to define in
        // what order they are to be read.
        if ((parentPermission == true || age >= 18) && canAfford == true) {
            // In this example. We MUST afford the candy, but then we can
            // either have parent permission or be 18 or over.
            System.out.println("You can have candy.");
        }
        if (parentPermission == true || (age >= 18 && canAfford == true)) {
            // In this example, we pass automatically if parentPermission is true.
            // Is parentPermission false, however, we can also pass if we're
            // 18 or older AND we can afford.
            System.out.println("You can have candy.");
        }
    }

    public static void ArrayAndListExample() {
        // Arrays and lists are both variable types that contain other variables.
        // Arrays have a set size, they cannot be changed in size after being created.
        int v = 3;
        //            index: 0  1  2
        int[] valueArray = { 2, v, 4 }; // This creates an array with a set size of 3 with the given variables.
        int[] valueArray2 = new int[3]; // This creates an array with a set size of 3, all with the default value of 0.
        int[] example = new int[6]; // This one has a size of 6.

        // Each item in an array or list is placed at an index. The index of the
        // item is where in the array/list it is. The first item is at index 0,
        // the second at index 1, the third at index 2, the fourth at index 3, and so on.
        // The highest index in an array/list is always the amount of items -1.

        // To retrieve a value from an array, write the name of the array
        // followed by square brackets with the index we're seeking inside.
        System.out.println("At index 0 is " + valueArray[0]);
        System.out.println("At index 1 is " + valueArray[1]);
        System.out.println("At index 2 is " + valueArray[2]);

        System.out.println("At index 0 is " + valueArray2[0]);
        System.out.println("At index 1 is " + valueArray2[1]);
        System.out.println("At index 2 is " + valueArray2[2]);
        //System.out.println("At index 3 is " + valueArray2[3]); // Trying to call an index that does not exists results in ArrayIndexOutOfBoundsException: crash.

        // The below to change the value of a specific index in an array.
        valueArray2[1] = 7;
        System.out.println("At index 1 is " + valueArray2[1]);

        // You can create an array of any variable type, but an array
        // can always only contain one type. No mixing and matching. This is not python.
        String[] stringArray = {"Hello", "Hi", "Yo"};

        System.out.println("At index 1: " + stringArray[1]);

        // This includes being able to make arrays of arrays.
        int[][] int2DArray = { {1, 2, 3},
                               {2, 3, 4} };

        // List
        // Lists are more flexible than arrays. They do not have a set size.
        // However, they do have somewhat worse performance.

        ArrayList<Integer> intList = new ArrayList<>();
        // The above creates an array. Note that ArrayList is one of those
        // classes that needs to be imported. Within the <>, write what kind
        // of variable this is a list of.
        // Note that it does not accept primitive values / value-types. int, float, char, boolean.
        // To have a list of those, use the equivalent Container Class.
        // byte -> Byte
        // int -> Integer
        // float -> Float
        // boolean -> Boolean
        // char -> Character

        // Use the function add() to add new values to a list.
        intList.add(4); // index 0
        intList.add(5); // index 1
        intList.add(6); // index 2
        System.out.println("Get index 1 from list: " + intList.get(1));

        ArrayList<String> strings = new ArrayList<>();
        strings.add("string 1");
        strings.add("string 2");
        strings.add("string 3");
        strings.add("I was at index 3.");

        // You can use the function set to change a value. It takes two parameters.
        // Parameters are values you send into functions. Set takes two.
        // The first is what index to set a value to. The second is what to set it to.
        strings.set(1, "New string!");

        // Use the get-function to retrieve a value from a list.
        System.out.println("String at index 0 is " + strings.get(0));
        System.out.println("String at index 1 is " + strings.get(1));
        System.out.println("String at index 3 is " + strings.get(3));
        strings.remove(2); // Remove the string at index 2.
        System.out.println("Removes string at index 2.");

        // Note that, if you remove something at an index in a list,
        // everything above it will have their index reduced by 1.
        // Index is a flexible thing.
        System.out.println("String at index 2 is now " + strings.get(2));

        /*
        ArrayList<ArrayList<Integer>> listOfIntList = new ArrayList<>();
        ArrayList<int[]> listOfArray = new ArrayList<>();
        ArrayList<Integer>[] arrayOfList = new ArrayList[4];
        */

        // Value types VS Reference types.
        int[] numberArray = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Printing an array: " + numberArray);

        // In the case of value types, the variable actually contains the value.
        int value = 3;
        int value2 = value;
        value2 = 6;
        System.out.println("value: " + value + ", value2: " + value2);

        // Reference types instead contain the memory address where the item
        // actually is located.
        int[] intArr = { 2, 4, 7 };
        System.out.println(intArr[0]);
        System.out.println("intArr: " + intArr);
        int[] intArr2 = intArr;
        intArr2[1] = 33;
        System.out.println(intArr[0]);
        System.out.println(intArr[1]);
        System.out.println(intArr[2]);
        System.out.println("intArr: " + intArr);
        System.out.println("intArr2: " + intArr2);

        // Strings are Reference Values. They contain addresses.
        // string == anotherString does not work,
        // because we're comparing the addresses, not the values.
        // Instead, use .equals, which is a function that specifically
        // compares if the two strings have the value and returns either true or false.
        String oneString = "Hello";
        String anotherString = "Hello";
        //if (oneString == anotherString) { // Don't do this
        if (oneString.equals(anotherString)) { // Do this
            System.out.println("The strings were the same!");
        }
        else {
            System.out.println("The strings are not equal.");
        }
    }

    public static void LoopExample() {
        // The while-loop looks a lot like an if-statement.
        // However, when we reach the end } of the while-loop, we check the condition again.
        // If it is still true, we run the code again.
        int counter = 0;
        int endAt = 10;
        while (counter < endAt) {
            counter++;
            System.out.println("Counter is currently at " + counter);
        }

        // The do-while loop is almost the exact same, but it always happens at least once.
        // In a regular while loop, we don't even enter the brackets if the condition isn't
        // true, but the code in a do-while loop happens at least once.
        do {
            counter++;
            System.out.println("Counter is currently at " + counter);
        } while (counter < endAt);

        // A use for a while-loop is to loop a program until we want
        // it to end. Here's a small thing where the loop won't end
        // until the user writes "quit", at least if that line is used.
        boolean quit = false;
        while (quit == false) {
            System.out.println("Write 'quit' to quit");
            Scanner scanner = new Scanner(System.in);
            String input = "quit";
            input = scanner.nextLine();

            if (input.equals("quit")) {
                quit = true;
            }
        }

        int[] intArray = { 6, 2, 8, 1, 2, 7 };
        // The for-each loop is a loop that loops over an array or list.
        // In the parenthesis, first create a variable. Then : the array/list.
        // Each item in the array/list takes a turn being the value on the left.
        // The loop will repeat once for every item in the array/list.
        for (int number : intArray) {
            System.out.println("Found " + number);
            if (number == 8) { // This can be used when searching for a specific object, for instance.
                System.out.println("Got the 8!");
            }
        }


        int value = 0;
        value++; // This increases the value by 1.
        value--; // This decreases the value by 1.

        // i = iterator. You are iterating over a list or array.
        // A for loop is constructed as thus. First, we establish an iterator.
        // It is a variable we want to use during the loop to keep track in what iteration of the loop we are.
        // Secondly, the condition. If that condition is still true after a loop, we loop again.
        // Thirdly, what should happen at the end of each loop. Typically i++, increase i by 1.
        // The following is a loop that loops with i being 0 and then going up to 9.
        for (int i = 0; i < 10; i++) {
            System.out.println("i is currently " + i);
        }
        // For-loop is quite flexible. Here I start at 9, decrease i two at a time,
        // and end when it becomes less than 0.
        for (int i = 9; i >= 0; i -= 2) {
            System.out.println("i is currently " + i);
        }

        // Typically, we use for-loops to loop over the contents of an array
        // or a list. intArray.length gets me how many items are in the intArray array.
        // I loop as long as i is less than the number of items, ie, I am not over max index.
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("At index " + i + " we find " + intArray[i]);
            // This is useful if we want to use the index for something.
        }

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Hi");
        stringList.add("How's");
        stringList.add("Life?");

        // for-each works with lists, too.
        for (String string : stringList) {
            // Say we have banned the word "Hi".
            if (string.equals("Hi")) {
                continue; // Immediately go to the next iteration of the loop.
                // Does not execute the rest of this current loop's code.
            }
            System.out.println("String: " + string);
        }

        // for works with lists, too. Then it's .size() that gets how many items there are.
        for(int i = 0; i < stringList.size(); i++) {
            System.out.println("At index " + i + " we find " + stringList.get(i));
            // Say we are only searching for Hi's index and we are uninterested
            // in continuing the loop after finding it.
            if (stringList.get(i).equals("Hi")) {
                System.out.println("We found it at index " + i);
                break; // break will instantly end the loop.
            }
        }
    }

    private static void Lektion1Repetition() {
        System.out.println("Hello world!");
        System.out.print("Hello! ");
        System.out.print("Hi! ");
        System.out.print("How are you? ");
        System.out.println("I'm good, thanks!");
        System.out.println("New Line!");

        // Primitive values.
        boolean aBool = true; // eller false
        byte aByte = 124;
        short aShort = 10000;
        int fyuvged = 10000000;
        long aLong = 10000000000000000L;
        float aFloat = 10.2323232323232323232f;
        double aDouble = 10.324234523432423423423432423423432d;
        char aChar = 34;
        char otherChar = 'g';
        System.out.println("Nr 34 in char is " + aChar);

        String aString = "A whole sentence.";
        System.out.println(aString.toUpperCase());
        System.out.println(aString);

        Scanner rjihogih = new Scanner(System.in);
        System.out.println("Please write your name:");
        String input = rjihogih.nextLine();
        System.out.println("Welcome, " + input + "!");

        float anFloat = 2.34f;
        int rounded = Math.round(anFloat);
        System.out.println(anFloat + " rounded is " + rounded);

        int number = 3;
        int value = Integer.parseInt("3"); // Makes a string into a number.

        number += 5; // Adds 5 to the variable.
        number -= 2; // Subtracts 2 from the variable.
        number *= 5; // Multiplies variable with 5
        number /= 3; // Divides variable with 3.
        System.out.println("Number is now " + number);

        System.out.println("Write a number.");
        input = rjihogih.nextLine();
        try {
            int inputNumber = Integer.parseInt(input);
            System.out.println("Congrats, you can follow basic commands.");
        }
        catch (Exception e) {
            System.out.println("That was not a number.");
            System.out.println(e);
        }
    }
}