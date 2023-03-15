package lecture01;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your weight: ");
        float weight = sc.nextFloat();
        System.out.println("Enter Your height in cm: ");
        int height =sc.nextInt();
        float heightInM = (float) height/100;

        double BMI = weight/(heightInM*heightInM);

        if (BMI >= 18.5 && BMI <= 24.9){

            System.out.println("BMI optimal");
        } else {
            System.out.println("BMI not optimal");
        }

    }
}
