
/**
 * Angela Chen
 * 1-2
 * Oct. 20, 2023
 */

import java.util.Scanner;

public class Problem_Set_4B {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        // -------------------------- PALINDROMES ----------------------------

        boolean palindrome = true;

        System.out.print("Palindrome: ");
        String pal = input.nextLine();
        pal = pal.toLowerCase();
        System.out.println();

        String result = "";
        String nonLetters = ",.:;()[]{}!?@#$%^&* ";

        for (int i = 0; i < pal.length(); i++) {
            String letter = pal.substring(i, i+1);
            if (nonLetters.contains(letter)) result += letter.substring(0, 0);
            else result += letter;
        }

        int first = 0;
        int last = result.length()-1;

        while (first < last) {
            char left = result.charAt(first);
            char right = result.charAt(last);

            if (left != right) palindrome = false;
            first++;
            last--;
        }

        System.out.println(palindrome);

        // --------------------------- PIG LATIN -----------------------------

        System.out.println();
        System.out.print("Pig Latin: ");
        String pig = input.nextLine();
        System.out.println();

        result = "";
        int space = pig.indexOf(" ");
        int lastIndex = 0;

        while (space != -1) {
            String word = pig.substring(lastIndex, space);
            lastIndex = space + 1;
            if (word.length() > 2) result += pigLatin(word) + " ";
            else result += word + " ";
            space = pig.indexOf(" ", lastIndex);
        }

        String lastWord = pig.substring(lastIndex);
        result += pigLatin(lastWord);

        System.out.println(result);

        // ----------------------- ASCENDING NUMBERS -------------------------

        System.out.println();
        System.out.println("Strictly Ascending Numbers");
        System.out.print("Minimum Number: ");
        int min = input.nextInt();
        System.out.print("Maximum Number: ");
        int max = input.nextInt();
        System.out.println();

        // ------------------------- TIMES TABLE -----------------------------
        
    }

    public static String pigLatin(String str) {
        String result = str.substring(1) + str.charAt(0) + "ay";
        return result; //WHY NEED RETURN?
    }

    public static void ascending(int beg, int end) {

    }
}

