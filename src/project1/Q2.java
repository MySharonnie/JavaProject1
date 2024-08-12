package project1;

public class Q2 {
    public static void main(String[] args) {

        /*
        2. Create an array of integer values. After the array is created, calculate the
sum of all stored elements in that array.
         */

        int[] total = {20, -5, 44, 999, 63, 12};


        int sum = 0;
        for (int i = 0; i < total.length; i++) {
            sum = sum + total[i];
        }
        System.out.println(sum);

    }
}
