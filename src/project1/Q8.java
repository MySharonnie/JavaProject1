package project1;

public class Q8 {
    public static void main(String[] args) {
        //Maximum and minimum number in the array?

        int [] highlow= {99,44, 4, 122, 55, 79, 5};
        int highest=99;

        for (int i=0; i<highlow.length; i++) {
            if (highlow[i]>highest) {
                highest = highlow[i];
            }
        }
        System.out.println("The highest number is "+highest);

        int lowest=99;



            for (int i=0; i<highlow.length;i++) {
            if (highlow[i]<lowest) {
                lowest=highlow[i];

            }
        }
        System.out.println("The lowest number is "+lowest);
    }


}
