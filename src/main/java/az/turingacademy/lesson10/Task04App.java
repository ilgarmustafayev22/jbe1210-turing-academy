package az.turingacademy.lesson10;

import java.util.Scanner;

public class Task04App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxIndex = 0;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i + 1;
            }
        }
//        for (int i = 0; i < n; i++){
//            if (arr[i] == max){
//                maxIndex = i;
//                break;
//            }
//        }
        System.out.println(max + " " + (maxIndex + 1));
    }
}
