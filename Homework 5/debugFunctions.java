/*
Referencing your homework from https://github.com/melissachodziutko/CMPT220/blob/main/Homework%203/LoopsDebug.java
Can you take problems 2, 3, and 5 and turn them into methods, and then call those methods in main?
Things that may trip you up while working on this:
1. the code works the same whether it's in a method or not, it just needs some minor variable adjustments probably
2. be wary of opening and closing brackets!! 
3. methods can't go inside methods!
4. methods go outside public static main, but inside public class main!
5. do you need to return the value? if so, make sure it isn't void

I give you two fully working method examples with and without parameters and called them for your reference :)
*/

import java.util.Scanner;
public class debugFunctions {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter your first number to be added");
    int firstInput = sc.nextInt();
    System.out.println("Enter your second number to be added");
    int secondInput = sc.nextInt();
    //remember this method is returning, so we need to print it out
    System.out.println(add(firstInput,secondInput));

    System.out.println("im going to print out the word Dog now.");
    printDog();

    System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial:");
        int number = sc.nextInt();
        System.out.println("Factorial: " + factorial(number));

        System.out.println("Problem 3");
        System.out.println("Enter a number, and I will tell you the sum of every other number up to that number:");
        int limit = sc.nextInt();
        System.out.println("Sum of every other number: " + sumEveryOther(limit));

        System.out.println("Problem 5");
        System.out.println("Enter a string to reverse:");
        String inputString = sc.next();
        System.out.println("Reversed string: " + reverseString(inputString));

        sc.close();
      
    }

  
    public static int add(int zyx, int tuv){


        return(zyx + tuv);


    }

  
    public static void printDog(){
        System.out.println("Dog");
    }


    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static int sumEveryOther(int limit) {
        int sum = 0;
        for (int i = 1; i <= limit; i += 2) {
            sum += i;
        }
        return sum;
    }
    public static String reverseString(String input) {
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }
        return reverse;
    }
}
