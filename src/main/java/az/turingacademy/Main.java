package az.turingacademy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void mainv1(String[] args) {
        int[][] matrix = new int[3][2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i + j) * 2;
            }
        }
        System.out.println(matrix[2][1] + matrix[1][1]);


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = arr1;
        arr2[1] = 5;
        arr3[1] = 4;
        System.out.println(arr1[1] + " " + arr2[1] + " " + arr3[1]);

    }

    public static void main(String[] args) {

        int[][] matrix = new int[3][];
        matrix[0] = new int[3];
        matrix[1] = new int[2];
        matrix[2] = new int[4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i + j) * 2;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(matrix));

    }
}