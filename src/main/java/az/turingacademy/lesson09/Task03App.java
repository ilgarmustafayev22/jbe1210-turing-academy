package az.turingacademy.lesson09;

import java.util.Scanner;

public class Task03App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        printTriangle(size);

    }

    private static void printTriangle(int num) {

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < --num; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        int b = num - 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j <= b) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            b--;
            System.out.println();
        }
//        for (int i = 0; i < a; i++) {
//            for(int j=a-1;j<=0;j++){
//                if(j==a){
//                    System.out.print(" ");
//                }else{
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//
//
//        }
    }
}
