package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hours = 0;
        System.out.println("How many hours did you work:");
        hours = scanner.nextInt();
        double hourlyPay = 0;
        System.out.println("What is the hourly rate:");
        hourlyPay = scanner.nextDouble();
        double grossPay = hours* hourlyPay;
        System.out.println("Gross Pay: " + grossPay);
    }
}
