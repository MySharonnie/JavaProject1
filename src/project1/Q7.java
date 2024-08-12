package project1;

public class Q7 {

    public static void main(String[] args) {
        //Write a Java Program to print the first 10 numbers of Fibonacci series.

        int numbers = 10;
        int firstNum = 0;
        int secondNum = 1;
        int nextNum = 0;


        for (int i = 0; i < numbers; i++) {
            System.out.print(nextNum+" ");
            nextNum = firstNum + secondNum;
            firstNum=secondNum;
            secondNum=nextNum;

        }

    }
}
