package az.turingacademy.lesson08;

public class Task01App {

    public static void main(String[] args) {
        String word1 = "AAA";
        String word2 = "AAA";

        String word3 = new String("AAA");

        String word4 = new String("AAA");

        String concat = word1.concat(word2).concat(word3);

        StringBuilder stringBuilder1 = new StringBuilder(word1);
        StringBuilder stringBuilder2 = new StringBuilder(word2);

        StringBuilder append = stringBuilder1.append(stringBuilder2);
        //AAAAAA


//AAA
        //AAAAAA
        //AAAAAAAAA

    }

}
