import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static Player player = new Player();
    public static void main(String[] args) {
        System.out.println("Riddare, en drake har kidnappat prinsessan och du måste rädda henne!");
        System.out.println("Du befinner dig vid en vägkorsning:");
        Intro();
    }
    // Intro() Method displays the first scenario in the game.
    public static void Intro() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vad vill du göra:");
        System.out.println("1. Gå mot Smedjan");
        System.out.println("2. Gå mot Vakttornet");
        System.out.println("3. Gå mot Stallet");
        System.out.println("4. Gå mot Berget");
        try {
            String firstChoice = scanner.nextLine();
            switch (Integer.parseInt(firstChoice)) {
                case 1:
                    Smith();
                case 2:
                    Stable();
                case 3:
                    GuardTower();
                case 4:
                    Mountain();
                default:
                    System.out.println("Skriv numret på det alternativ du vill göra:");
                    System.out.println(firstChoice);
                    Intro();
            }
        }
        catch (Exception e) {
            System.out.println("Du måste ange ett nummer. #1");
            Intro();
        }
    }
    //Smith() method to add Pickups Object "Sword" to Player if object is not already added.
    public static void Smith() {
        boolean gotSword = false;
        for (int i = 0; i < player.pickups.size(); i++ ) {
            if (player.pickups.get(i).name == "Sword") {
                gotSword = true;
            }
        }
        if (gotSword == false) {
            System.out.println("I smedjan hittar du ett svärd! Du beger dig mot vägkorsningen med svärdet i högsta hugg.");
            player.pickups.add(new Pickups("Sword"));
        }
        else if (gotSword == true) {
            System.out.println("Du hittar inget i smedjan och beger dig tillbaka mot vägkorsningen.");
        }
        Intro();
    }
    //Smith() method to add Pickups Object "Shield" to Player if object is not already added.
    public static void GuardTower() {
        boolean gotShield = false;
        for (int i = 0; i < player.pickups.size(); i++ ) {
            if (player.pickups.get(i).name.equals("Shield")) {
                gotShield = true;
            }
        }
        if (gotShield == false) {
            System.out.println("I vakttornet hittar du en sköld! Du beger dig mot vägkorsningen med skölden på ryggen");
            player.pickups.add(new Pickups("Shield"));
        }
        else if (gotShield == true) {
            System.out.println("Du hittar inget i vakttornet och beger dig tillbaka mot vägkorsningen.");
        }
        Intro();
    }
    //Stable() method to add Pickups Object "Horse" to Player if object is not already added.
    public static void Stable() {
        boolean gotHorse = false;
        for (int i = 0; i < player.pickups.size(); i++ ) {
            if (player.pickups.get(i).name.equals("Horse")) {
                gotHorse = true;
            }
        }
        if (gotHorse == false) {
            System.out.println("I stallet hittar du en häst! Du rider på hästen mot vägkorsningen!");
            player.pickups.add(new Pickups("Horse"));
        }
        else if (gotHorse == true) {
            System.out.println("Du hittar inget i stallet och beger dig tillbaka mot vägkorsningen.");
        }
        Intro();
    }
    //Mountain() method that displays the last scenario of the game.
    public static void Mountain() {
        boolean gotSword = false;
        boolean gotShield = false;
        boolean gotHorse = false;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < player.pickups.size(); i++ ) {
            if (player.pickups.get(i).name.equals("Sword")) {
                gotSword = true;
            }
            else if (player.pickups.get(i).name == "Shield") {
                gotShield = true;
            }
            else if (player.pickups.get(i).name == "Horse") {
                gotHorse = true;
            }
        }
        if ( gotSword && gotShield && gotHorse) {
            System.out.println("Du rider in mot berget där draken ligger och vaktar prinsessan.");
            System.out.println("Du dräper draken och prinsessan är räddad.");
            GameOver();
        }
        else {
            System.out.println("Du möter draken utan den korrekta utrustningen, vad vill du göra?");
            System.out.println("1. Försök prata med draken");
            System.out.println("2. Försök dräpa draken");
            try {
                String finalChoice = scanner.nextLine();
                switch (Integer.parseInt(finalChoice)) {
                    case 1:
                        System.out.println("Det visar sig att draken är en snäll varelse som trodde slottet var prinsessans fängelse.");
                        System.out.println("Du och prinsessan rider hem. Du fick aldrig betalt för ditt jobb.");
                        GameOver();
                    case 2:
                        GameOver();

                    default:
                        Mountain();
                }
            }
            catch (Exception e) {
                System.out.println("Du måste ange ett nummer. #2");
                Mountain();
            }
        }
    }
    //A GameOver Scene, if the player wish to continue playing or exit the application.
    public static void GameOver() {
        player.pickups.clear();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < player.pickups.size(); i++) {
            System.out.println(player.pickups.get(i).name);
        }

        System.out.println("Vill du fortsätta spela?");
        System.out.println("1. Ja");
        System.out.println("2. Nej");
        String gameOverChoice = scanner.nextLine();
        try {
            switch (Integer.parseInt(gameOverChoice)) {
                case 1:
                    Intro();
                case 2:
                    System.exit(0);
                default:
                    GameOver();
            }
        }
        catch (Exception e) {
            System.out.println("Du måste ange ett nummer. #3");
            GameOver();
        }
    }
}