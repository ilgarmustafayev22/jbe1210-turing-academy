package az.turingacademy.lesson08;

import java.util.Scanner;

public class StringTaskApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char[] vowel = {'a', 'e', 'i', 'ə', 'ö', 'u', 'ü', 'ı', 'o'};
        char endcharacter = word.charAt(word.length() - 1);
        System.out.println("End character - " + word.charAt(word.length() - 1));

        /* 2) Write the logic to insert a word and check if the last character is a vowel.
        Print a message indicating whether the last character is a vowel or not.*/

        //index for loop
        for (int i = 0; i < vowel.length; i++) {
            if (endcharacter == vowel[i]) {
                System.out.println("Wowel charchter ");
                break;
            } else {
                System.out.println("consonant character ");
            }
        }

        for (char c : vowel) {
            if (endcharacter == c) {
                System.out.println("Wowel charchter ");
                break;
            } else {
                System.out.println("consonant character ");
            }
        }
        //3) Type the logic to insert a word and then reverse it and capitalize it
       String word2 = scanner.nextLine();
       word2 = word2.toUpperCase();
       for (int i = word2.length() - 1; i >= 0; i--) {
           char bigword = word2.charAt(i);
           System.out.print(bigword);
       }

    }
}
