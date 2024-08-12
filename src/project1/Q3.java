package project1;

public class Q3 {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type where you will store odd and even
numbers. Develop a program which will identify/print the even numbers
only.

         */

        int [][] numbers ={
                {15, 1, 37},
                {20, 22, 5},
                {78, 9, 17}
        };

        for (int i=0; i<numbers.length; i++){
            for (int s =0; s<numbers[i].length; s++) {
                if (numbers[i][s] % 2==0){
                    System.out.println(numbers[i][s]);
                }
            }
        }
    }
}
