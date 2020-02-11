/*
 * Triangle
 * Program Description - Triangle Drawing
 * Written by Glenn Wallace
 * 2/10/2020
 * JDK 1.8
 */
public class Triangle {


    public static void main(String[] args) {

        System.out.println("      *");
        System.out.println("     ***");
        System.out.println("    *****");
        System.out.println("   *******");
        System.out.println("  *********");
        System.out.println(" ***********");
        System.out.println("\n");

        // MORE TRIANGLES INCLUDED FOR FUN
        StringBuilder str = new StringBuilder("**********");
        for (int row=(9); row>=0;
             row--) {
            System.out.println(str);
            str.deleteCharAt(row);
        }

        System.out.println("");
        StringBuilder stringtwo = new StringBuilder("         *");
        for(int row=(9); row>=0; row--) {
            System.out.println(stringtwo);

            stringtwo.deleteCharAt(0);

            stringtwo.append("*");
        }

        System.out.println("");

        StringBuilder stringthree = new StringBuilder("**********");
        for(int row=(0); row<=9; row++) {
            System.out.println(stringthree);

            stringthree.deleteCharAt(row);

            stringthree.insert(row," ");
        }

        int boundary=10;
        for (int row = 1;
             row <= boundary/2; row++) {
            for (int space = 1; space <= (boundary/2) -row;
                 space++)

                System.out.print (" ");

            for (int stars = 1; stars <= (row*2)-1;
                 stars++)

                System.out.print ("*");

            System.out.println(" ");
        }

        for (int row = 1; row <= boundary/2; row++) {
            for (int space = 1; space <= row-1; space++)

                System.out.print (" ");

            for (int stars = 1; stars <= boundary-(row*2)+1; stars++)

                System.out.print ("*");

            System.out.println();
        }
    }
}