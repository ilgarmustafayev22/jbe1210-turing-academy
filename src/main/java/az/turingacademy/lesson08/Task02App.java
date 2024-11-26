package az.turingacademy.lesson08;

import java.util.Arrays;
import java.util.Scanner;

public class Task02App {

    public static void main(String[] args) {
        //int[] nums = {1, 15, 100, 1004, 99};

        Scanner sc = new Scanner(System.in);
        int[] nums = new int[100];

//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = sc.nextInt();
//        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10000);
        }

//        for (int num : nums) {
//            System.out.println(num);
//        }

        System.out.println(Arrays.toString(nums));


    }
}
