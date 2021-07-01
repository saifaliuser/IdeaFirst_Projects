package com.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number");
        float num1= scan.nextFloat();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter Second Number");
        float num2= scan.nextFloat();
        System.out.println("You have entered "+ num1 +" and " +num2);
        String prompt = "Enter 0 for addition, 1 for substraction, 2 for multiplication and 3 for division";
        System.out.println(prompt);
        int input = scan.nextInt();
        switch (input){
            case 0:
                System.out.println("Adding these numbers");
                System.out.print("The result is ");
                System.out.println(num1 + num2);
                break;
            case 1:
                System.out.println("Substracting these numbers");
                System.out.print("The result is ");
                System.out.println(num1 - num2);
                break;
                case 2:
                System.out.println("Multiplying these numbers");
                System.out.print("The result is ");
                System.out.println(num1 * num2);
                    break;
            case 3 :
                System.out.println("Dividing these numbers");
                System.out.print("The result is ");
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid numbers");
        }











    }
}
