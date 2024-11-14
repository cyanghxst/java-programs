// package com.logicbig.example.string;

public class StringPrintfPadding {

    public static void main(String[] args) {
        //left padding
        System.out.printf("Result: %20s%n", "test");
        //right padding
        System.out.printf("Result: %-20s%n", "test");
        System.out.printf("%-20s result%n", "test");
        //formatting multiple lines in columns
        for (int i = 7; i < 300; i += 50) {
            System.out.printf("[Product:%4s  %-4d %10f]%n", i, i * 10, i / 2f);
        }
    }
}
