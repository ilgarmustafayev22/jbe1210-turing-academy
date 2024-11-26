package az.turingacademy.lesson06;

import java.util.Scanner;

public class Task02App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        if (month <= 0 || month > 12) {
            System.out.println("FALSE");
        } else {

            if (month >= 3 && month < 6) {
                System.out.println("SPRING");
            } else if (month >= 6 && month < 9) {
                System.out.println("SUMMER");
            } else if (month >= 9 && month < 12) {
                System.out.println("AUTUMN");
            } else {
                System.out.println("WINTER");
            }

            switch (month) {
                case 1 -> System.out.println("YANVAR");
                case 2 -> System.out.println("FEVRAL");
                case 3 -> System.out.println("MART");
                case 4 -> System.out.println("APREL");
                case 5 -> System.out.println("MAY");
                case 6 -> System.out.println("IYUN");
                case 7 -> System.out.println("IYUL");
                case 8 -> System.out.println("AVGUST");
                case 9 -> System.out.println("SENTYABR");
                case 10 -> System.out.println("OKTYABR");
                case 11 -> System.out.println("NOYABR");
                default -> System.out.println("DEKABR");
            }

        }

    }

}
