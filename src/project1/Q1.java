package project1;

public class Q1 {

    /*
    1. Create a program that uses an array to store a list of temperatures for a week,
    and then uses a loop to find the highest and lowest temperature for the week.
     */
    public static <Int> void main(String[] args) {

        int[] temperature = {85, 75, 90, 115, 75, 45, 100};

        int highest = 85;

        for (int i = 0; i < temperature.length; i++) {

            if (temperature[i] > highest) {
                highest = temperature[i];

            }

        }
        System.out.println(highest);

        int lowest = 85;

        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] < lowest) {
                lowest = temperature[i];
            }

        }
        System.out.println(lowest);
    }
}
