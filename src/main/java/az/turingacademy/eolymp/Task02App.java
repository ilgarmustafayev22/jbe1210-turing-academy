package az.turingacademy.eolymp;

import java.util.Scanner;

public class Task02App {

    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        int i1 = num / 10;
        int i2 = num % 10;

        System.out.println(i1 + " " + i2);
    }

}
