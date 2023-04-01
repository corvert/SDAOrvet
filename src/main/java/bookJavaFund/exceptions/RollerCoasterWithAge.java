package bookJavaFund.exceptions;

import java.util.Scanner;

class TooYoungException extends Exception {
int age;
String name;
TooYoungException(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
class TooShortException extends Exception{
    double height;

    public TooShortException(double height) {
        this.height = height;
    }
}

public class RollerCoasterWithAge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter user name");
            String name = sc.nextLine().trim();
            if (name.equalsIgnoreCase("")) {
                break;
            }
            try {
                System.out.println("Enter " + name + " age ");
                int age = sc.nextInt();
                sc.nextLine();
                if (age < 15) {
                    throw new TooYoungException(age, name);
                }

                System.out.println("Enter " + name + " height");
                double height = sc.nextDouble();
                sc.nextLine();
                if (height < 130){
                    throw new TooShortException(height);
                }
                System.out.println(name + " is riding the roller coaster");
            } catch (TooYoungException e) {
                System.out.println(e.name + " is " + e.age + " years old, which is too young to ride! " );
            } catch (TooShortException e){
                System.out.println(name + " is " + e.height + " cm tall, which is too short to ride!");
            }finally {
                System.out.println("escorting " + name + " outside the premises");
            }
        }
    }
}
