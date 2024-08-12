package project1;

public class Q10 {
    public static void main(String[] args) {
        //Write a program to print out duplicate elements from an Array of Strings?

        String [] names={"Jay","Mo","Curly","Mo","Joe"};

        for(int i=0; i<names.length;i++) {
            for(int n=i; n<names.length; n++) {
                if (names[i].equals(names[n]) && i!=n) {
                    System.out.println(names[i]);


                }
            }
        }
    }
}
