package ie.atu.lab5;

import java.util.Scanner;

public class studentapp {

    public static void main(String[] args) {
        System.out.println("please enter student name");
        Scanner input = new Scanner(System.in);
        double name = input.nextDouble();
        System.out.println("you entered : " + name);

        System.out.println("please enter the students email");
        double email = input.nextDouble();
        System.out.println("you entered : " + email);

        System.out.println("please enter the students course");
        double course = input.nextDouble();
        System.out.println("you entered : " + course);
    }
}
