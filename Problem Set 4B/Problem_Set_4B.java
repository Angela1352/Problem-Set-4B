
/**
 * Angela Chen
 * 1-2
 * Oct. 20, 2023
 */

import java.util.Scanner;

public class Problem_Set_4B {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        String nonLetters = ",.:;()[]{}!?@#$%^&* ";
        boolean palindrome = true;

        System.out.print("Palindrome: ");
        String pal = input.nextLine();
        System.out.println();

        pal = pal.toLowerCase();    

        int first = 0;
        int last = pal.length()-1;
        String letter = pal.substring(first, first+1);

        while (first < last) {
            char Lchar = pal.charAt(first);
            char Rchar = pal.charAt(last);

            if (nonLetters.contains(letter)) first++;
            else if (Lchar != Rchar) palindrome = false;

            first++;
            last--;
        }
        
        System.out.println(palindrome);

        /*
        // -----------------------------------------------------------------------

        String result = "";

        System.out.println();
        System.out.println("Pig Latin: ");
        String pig = input.nextLine();
        System.out.println();

        for (int i = 0; i < pig.length(); i++) {

        String word = pal.substring(0, i);
        }

        //if (word.length() <= 2) System.out.println(pal);

        for (int i = 0; i < pig.length(); i++) {
        result += pig.substring(1) + pig.substring(i, i+1) + "ay";
        }
        System.out.println(result);

        // -----------------------------------------------------------------------
         */

    }
}








