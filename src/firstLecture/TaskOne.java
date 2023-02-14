package firstLecture;

import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter circle diameter: ");
        float diameter = sc.nextFloat();
        double circlePerimeter = Math.PI*diameter;
        System.out.printf("Circle perimeter is %.2f", circlePerimeter);
    }
}
