package methods;

import java.util.Scanner;

public class HomeAreaCalculator {

    public static void main(String[] args) {
        Rectangle room = getRoom();
        Rectangle kitchen = getRoom();

        double roomArea = room.calculateArea();
        double kitchenArea = kitchen.calculateArea();

        System.out.println("The area of the room is " + roomArea);
        System.out.println("The area of the kitchen is " + kitchenArea);
        System.out.println("The total Area of the two spaces is " + calculateTotalArea(room, kitchen));
        System.out.println("The total Perimeter of the two spaces is " + calculateTotalPerimeter(room, kitchen));
    }

    public static double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

    public static double calculateTotalPerimeter(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculatePerimeter() + rectangle2.calculatePerimeter();
    }

    public static Rectangle getRoom(){
        double length, width;
        System.out.println("What is the length of the room: ");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextDouble();
        System.out.println("What is the width of the room: ");
        width = scanner.nextDouble();
        return new Rectangle(length, width);

    }

}
