package org.example;

public class Menu {
    public static void Header(String message) {
        int width = 47;
        int padding = (width - message.length()) / 2;
        String paddingString = " ";
        for (int i = 0; i < padding; i++) {
            paddingString = paddingString + " ";
        }
        System.out.println("-----------------------------------------------");
        System.out.println("RAF-MS™ - Robust Amazing Farm Management System");
        System.out.println("-----------------------------------------------");
        System.out.println(paddingString + message);
        System.out.println("-----------------------------------------------");
    }
    public static void HeaderWithoutMessage() {
        System.out.println("-----------------------------------------------");
        System.out.println("RAF-MS™ - Robust Amazing Farm Management System");
        System.out.println("-----------------------------------------------");
    }
}
