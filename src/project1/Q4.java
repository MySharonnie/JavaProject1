package project1;

public class Q4 {
    public static void main(String[] args) {
        /*
        Create a 2D array of integers. Develop a program which will calculate the
sum of even and odd numbers for that array.
         */

        int[][] numbers = {
                {12, 19, 26, 74},
                {70, 77, 115, 32},
                {19, 99, 5, 6},
                {74, 47, 44, 777}
        };
        int evenSum=0;
        int oddSum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int c = 0; c < numbers[i].length; c++) {
                if (numbers[i][c]%2==0){
                    evenSum= evenSum+numbers[i][c];
                }
            }
        }
        System.out.println("The sum of the even numbers is "+evenSum);

        for (int r=0; r<numbers.length; r++){
            for (int c=0; c<numbers[r].length; c++) {
                if (numbers[r][c]%2!=0) {
                    oddSum=oddSum+numbers[r][c];
                }
            }
        }
        System.out.println("The sum of the odd numbers is "+oddSum);

    }
}
