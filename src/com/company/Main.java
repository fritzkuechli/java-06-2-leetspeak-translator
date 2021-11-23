package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        char[] inputTextChar;
        System.out.println("Please input your Text: ");
        inputTextChar = inp.nextLine().toUpperCase().toCharArray();

        for (char c : inputTextChar) {
            char outputChar = switch (c) {
                case 'A' -> '@';
                case 'B' -> '8';
                case 'C' -> '(';
                case 'E' -> '3';
                case 'G' -> '6';
                case 'I' -> '!';
                case 'L' -> '1';
                case 'O' -> '0';
                case 'S' -> '$';
                case 'T' -> '7';
                case 'Z' -> '2';
            default -> c;
            };
            System.out.print(outputChar);
        }
    }
}
