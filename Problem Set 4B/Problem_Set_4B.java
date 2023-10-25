
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

        System.out.println(palindrome + "\n");

        // --------------------------- PIG LATIN -----------------------------

        System.out.print("Pig Latin: ");
        String pig = input.nextLine();
        System.out.println();

        result = "";
        int space = pig.indexOf(" ");
        int lastSpace = 0;

        while (space != -1) {
            String word = pig.substring(lastSpace, space);
            lastSpace = space + 1;
            if (word.length() > 2) result += pigLatin(word) + " ";
            else result += word + " ";
            space = pig.indexOf(" ", lastSpace);
        }

        String lastWord = pig.substring(lastSpace); //last word
        if (lastWord.length() > 2) result += pigLatin(lastWord); 
        else result += lastWord;

        System.out.println(result + "\n");

        // ----------------------- ASCENDING NUMBERS -------------------------

        System.out.println("Strictly Ascending Numbers");
        System.out.print("Minimum Number: ");
        int min = input.nextInt();
        System.out.print("Maximum Number: ");
        int max = input.nextInt();
        System.out.println();

        int count = 0;

        for (int i = min; i <= max; i++) {
            int currentNum = i;
            int lastNum = 10;
            boolean ascend = true;

            while (currentNum > 0) {
                int currentDigit = currentNum % 10;

                if (currentDigit >= lastNum) ascend = false;

                lastNum = currentDigit;
                currentNum = currentNum / 10;
            }

            if (ascend) count++;
        }

        System.out.println("Result: " + count + "\n");

        // ------------------------- TIMES TABLE -----------------------------

        System.out.print("Times Table: ");
        int times = input.nextInt();
        System.out.println();

        String space1 = " ";
        int maxNum = times * times;

        for (int i = 1; i <= times; i++) {
            for (int x = 1; x <= times; x++) {
                int result1 = i * x;

                if (maxNum/100 == 0) {
                    if (result1/10 == 0) space1 = "  ";
                    else if (result1/100 >= 0) space1 = " ";
                } else if (maxNum/1000 == 0) {
                    if (result1/10 == 0) space1 = "   ";
                    else if (result1/100 == 0) space1 = "  ";
                    else if (result1/1000 >= 0) space1 = " ";
                }

                System.out.print(space1 + result1);
            }
            System.out.println();
        }

    }

    public static String pigLatin(String str) {
        String result = str.substring(1) + str.charAt(0) + "ay";
        return result;
    }
}

