package gross_calculator;

import java.util.Scanner;

public class HourlyPay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var maxHoursAllowed = 40;
        int hoursWorked;
        int hourlyPay = 20;

        System.out.println("How many hours did you work ");
        hoursWorked = scanner.nextInt();

        while(hoursWorked > maxHoursAllowed){
            System.out.println("You shouldn't have worked for more than "+ maxHoursAllowed+ " hours");
            System.out.println("How many hours did you work ");
            hoursWorked = scanner.nextInt();
        }
        scanner.close();

        double grossPay = hoursWorked * hourlyPay;
        System.out.println("Gross Pay: "+ grossPay);
    }
}
