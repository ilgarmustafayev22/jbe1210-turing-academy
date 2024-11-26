package az.turingacademy.lesson09;

public class Task02App {

    public static void main(String[] args) {
        int[] myArray = {2, 3, 6, -2, 7, 12, -6, 9};
        int maxElement = findMax(myArray);
        System.out.println(maxElement);
    }

    private static int findMax(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }
}


