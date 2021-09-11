package Exercise22;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;

public class Exercise22 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = 0;

        System.out.print("Enter the first number: ");
        String number1 = scanner.nextLine();

        System.out.print("Enter the second number: ");
        String number2 = scanner.nextLine();

        System.out.print("Enter the third number: ");
        String number3 = scanner.nextLine();

        int Number1 = Integer.parseInt(number1);
        int Number2 = Integer.parseInt(number2);
        int Number3 = Integer.parseInt(number3);

        if (Number1 == Number2 || Number1 == Number3 || Number2 == Number3) {
            System.out.print("Please enter different individual numbers next time. ");
            System.exit(0);
        }
        else {
            max = Number1;
            if (Number2 > Number1) {
                max = Number2;
                if (Number3 > Number2) {
                    max = Number3;
                }
            }
            else if (Number3 > Number1){
                max = Number3;
               }
        }

        System.out.print("The largest number is " + max);
    }

}
