package com.java;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Hello World");
////    /* Variables
////    water- Bucket
////    In Java :
////    Variables are containers which stores data values
////    string, int, float, char, boolean
////     */
////        String first_name = "Saif";
////        String Second_name ="Ali";
////        System.out.println(first_name+Second_name);
////        int a = 45;
////        float b= 45.45f;
////        System.out.println(a+b);
////
////        /* Rules for constructing name of variables in Java
////        1- Can contain digits, underscore, dollar signs, letters
////        2- should start with letter, $ and _
////        3- Java is a Case Sensitive Language which means saif and Saif are two different Variables.
////        4- Should not contain spaces
////        5- You cannot use reserved keywords from java
////
////        Two types of java types
////        Primitive
////        Non-Primitive or Reference Data types
////
////        Primitive data types
////        which have specific storage size
////        byte ( 1 byte ), short ( 2 bytes ), int (4 bytes ), long (8 bytes),
////        float(4 bytes) decimal, double ( 8 bytes )
////        booleaan ( 1 bit ), char ( 2 bytes )
////
////        Non Primtive Data types
////        Programmer makes it
////         */
////        byte e = 123;
////        System.out.println(e);
////        double d = 45.6787978d;
////        System.out.println(d);
////        char grade = 'A';
////        System.out.println(grade);
////
////        /* Operators in Java
////        Operand     Operator    Operator    =   Result
////        4               +           7       =     11
////
////        Types of Operators in JaVA
////
////        Arithmatic Operators
////        Assignment
////        Logical
////        Comparison
////
////         */
////
////        int num1 = 40  ,    num2 = 50;
////        num1 +=2;
////        num2 -=2;
////        System.out.print("The value of num1 + num2 is ");
////        System.out.println(num1 + num2);
////
////        System.out.print("The value of num1 - num2 is ");
////        System.out.println(num1 - num2);
////
////        System.out.print("The value of num1 * num2 is ");
////        System.out.println(num1 * num2);
////
////        System.out.print("The value of num1 / num2 is ");
////        System.out.println(num1 / num2);
////
////        System.out.print("The value of num1 % num2 is ");
////        System.out.println(num1 % num2);
////
////        System.out.println(num2++);
////
////        System.out.println(++num2);
////
////        System.out.println(num1--);
////
////        System.out.println(--num1);
////
////        /* Explore these Operators
////        -=
////        *=
////        /=
////        %=
////         */
////
////        num1 -= -10;
////        System.out.println(num1);
//
////        num2 *= 10;
////        System.out.println(num2);
////
////        num2 /= 10;
////        System.out.println(num2);
////
////        num2 %= 20;
////        System.out.println(num2);
////
////
////        /*
////        Comparison Operators
////
////        ==  Checks for equality of two values
////        != Checks if two values are not equal
////        <   Smaller than
////        >   Greater than
////        <=
////        >=
////
////        Logical Operators
////
////        AND Operators && returns only true if both are true A.B
////        OR Operators  || returns true only if one is true
////        NOT Operators ! Reverses the condition
////
////         Taking user input in Java
////         Use class scanner
////
////         */
//////        Scanner scan = new Scanner(System.in);
//////        System.out.println("Enter Age");
//////        int input = scan.nextInt();
//////        System.out.println(input);
////
////        String name = "Saif";
////        String channel= "Saif Ali";
////        System.out.println(name.length());
////        System.out.println(name.toUpperCase());
////        System.out.println(name.toLowerCase());
////        System.out.println(name + " from\n " + channel);
////        int num01=7 , num02=8;
////        System.out.println(Math.max(num01, num02));
////        System.out.println(Math.min(num01, num02));
////        System.out.println(Math.sqrt(81));
////        System.out.println(Math.abs(-98));
////        System.out.println(6+ (9-1)*Math.random());
/////*      If else conditionals
//// */
//
////        Scanner scan = new Scanner(System.in);
////        System.out.println("Enter Your Age");
////        int Age = scan.nextInt();
////
////        if(Age>21){
////            System.out.println("You are Elder than ME");}
////
////        else if (Age<21){
////        System.out.println("You are Younger than ME");}
////
////        else {
////            System.out.println("You are identical in Age to me");
//
//        System.out.println("Hello Saif!");
//        String name = "Saif Ali";
//        System.out.println(name);
//        int a = 65, x= 23, y= 34;
//        float b = 76.87f;
//        boolean c = true;
//        System.out.println(a+b+x+y);
//        System.out.println(c);
//        byte V = 75;
//        System.out.println(V);
//        Double q = 52.2656987d;
//        System.out.println(q-V);

//      float num1 = 25, num2 = 36 ;
//   System.out.print("The sum of num1 and num2 is ");
//        System.out.println(num1+num2);
//System.out.print("The subtraction of num1 and num2 is ");
//        System.out.println(num1-num2);
//System.out.print("The multiplication of num1 and num2 is ");
//        System.out.println(num1*num2);
//System.out.print("The division of num1 and num2 is ");
//        System.out.println(num1/num2);
//
//
//        System.out.println(++num1);
//        System.out.println(--num2);
//
//num1+=25;
//        System.out.println(num1);

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name = scan.nextLine();
//        String channel = "Saifi"; System.out.println(name);
//        System.out.println(name.length());
//        System.out.println(name.toUpperCase(Locale.ROOT));
//        System.out.println(name +"from"+ channel );

//        String name = "Saif";
//        System.out.println(name.charAt(2));
//        System.out.println(name.contains("if"));
//        System.out.println(name.endsWith("aif"));
//
//        int num1 = 9, num2 =7;
//        System.out.println(Math.max(num1, num2));
//        System.out.println(Math.min(num1, num2));
//        System.out.println(Math.sqrt(36));
//
//        System.out.println(Math.abs(-36));
//        System.out.println(Math.random());
//        System.out.println(4+(8-4)*Math.random());
//
//        Scanner  scan = new Scanner(System.in);
//        System.out.println("Enter your Age");
//        int Age = scan.nextInt();
//
//        if (Age >20){
//            System.out.println("You are an adult");
//        }else if (Age >5){
//            System.out.println("You are not a kid");
//        }else {
//            System.out.println("You are a kid");}
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your age");
//            int age = scan.nextInt();
//        switch (age){ case 12 :
//            System.out.println("You are 12 years old");
//            break;
//            case 56 :
//                System.out.println("You are 56 years old");
//                break;
//
//            case 16:
//                System.out.println("You are 16 years old");
//                break;
//            default:
//                System.out.println("You did not match any of the case");}
//        int i = 0;
//        while (i<100){
//            System.out.println(i);
//            i +=1;}
//        int j = 0;
//        do {
//            System.out.println(j);
//            j +=1;
//        }while (j<100);

//        for(int i = 0; i<10;i++){
//            if (i>2) {
//                break;
//            }
//            else {
//                System.out.println(i);}
//        for (int i=0; i<=10; i++){
//            if (i==2)
//                continue;
//            System.out.println(i);
//        int [] marks = {0,222,342,546,787,334};
//        marks [3] = 897;
//    System.out.println(marks[3]);


//        Scanner scan = new Scanner (System.in);
//        System.out.println("Enter your Age!");
//        int Age = scan.nextInt();
//        if(Age>20){
//            System.out.println("You are an adult");}
//        else if(Age>5){
//            System.out.println("You are not akid");}
//            else{
//            System.out.println("You are a kid");}

//            Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your age");
//        int Age = scan.nextInt();
//
//        switch (Age){
//
//            case 20:
//                System.out.println("You are eligible for vaccination");
//                break;case 21:
//                System.out.println("You are eligible for vaccination");
//                break;case 22:
//                System.out.println("You are eligible for vaccination");
//                break;case 23:
//                System.out.println("You are eligible for vaccination");
//                break;case 24:
//                System.out.println("You are eligible for vaccination");
//                break;case 25:
//                System.out.println("You are eligible for vaccination");
//                break;case 26:
//                System.out.println("You are eligible for vaccination");
//                break;case 27:
//                System.out.println("You are eligible for vaccination");
//                break;case 28:
//                System.out.println("You are eligible for vaccination");
//                break;case 29:
//                System.out.println("You are eligible for vaccination");
//                break;case 30:
//                System.out.println("You are eligible for vaccination");
//                break;case 31:
//                System.out.println("You are eligible for vaccination");
//                break;case 32:
//                System.out.println("You are eligible for vaccination");
//                break;case 33:
//                System.out.println("You are eligible for vaccination");
//                break;case 34:
//                System.out.println("You are eligible for vaccination");
//                break;case 35:
//                System.out.println("You are eligible for vaccination");
//                break;case 36:
//                System.out.println("You are eligible for vaccination");
//                break;case 37:
//                System.out.println("You are eligible for vaccination");
//                break;case 38:
//                System.out.println("You are eligible for vaccination");
//                break;case 39:
//                System.out.println("You are eligible for vaccination");
//                break;
//                case 40:
//                System.out.println("You are eligible for vaccination");
//            break;
//            default:
//                System.out.println("You are not eligible for vaccination");}
//
       int i=0;
        while (i<100){
            System.out.println(i);
              i+=1;}
        int j =0;
        do{
            System.out.println(j);
        j=+1;
        while (j<100);}




    }






    }






