package project1;

import java.util.Scanner;

public class Q6 {
    //Write a java program to check whether a given number is prime or not?

    public static void main(String[] args) {
        Scanner prime = new Scanner(System.in);

        System.out.println("Please enter a number greater than 2");

        int number = prime.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime=false;

            }
        } System.out.println("Is "+number+" prime?: "+isPrime);
    }
}
