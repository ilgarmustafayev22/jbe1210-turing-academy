package az.turingacademy.lesson10;

import java.util.Scanner;

public class Task01App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary;
        double maxSalary = -1;
        while (sc.hasNext()) {
            salary = sc.nextDouble();
            if (maxSalary < salary) {
                maxSalary = salary;
            }
        }
        System.out.printf("%.2f", maxSalary);

    }

}
