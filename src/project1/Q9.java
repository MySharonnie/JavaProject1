package project1;

public class Q9 {

    public static void main(String[] args) {
        //Write a java program to find the second largest number in the array

        int [] num= {88, 74, 15, 19, 85, 44, 125, 99};
        int largest=num[0];
        int secondLargest=num[0];

        for (int n:num){
            if (n >largest){
                secondLargest=largest;
                largest=n;
            } else if (n>secondLargest && n!=largest) {
                secondLargest=n;

            }


        } System.out.println(secondLargest);


    }
}
