package az.turingacademy.lesson06;

import java.util.Scanner;

public class Task01App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        if (num % 2 == 1) {
//            System.out.println("ODD");
//        } else if (num == 0) {
//            System.out.println("ZERO");
//        } else {
//            System.out.println("EVEN");
//        }

        String result = num % 2 == 1 ? "ODD" : (num == 0 ? "ZERO" : "EVEN");
        System.out.println(result);

        //2

        if (num < 0) {
            System.out.println("NEGATIVE");
        } else if (num > 0) {
            System.out.println("POSITIVE");
        } else {
            System.out.println("ZERO");
        }

        String result2 = num < 0 ? "NEGATIVE" : (num > 0 ? "POSITIVE" : "ZERO");
        System.out.println(result2);
    }
}
