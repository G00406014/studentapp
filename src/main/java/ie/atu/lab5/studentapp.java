package ie.atu.lab5;

import java.util.Scanner;

public class studentapp {

    public static void main(String[] args) {
        System.out.println("please enterthe width of the rectangle");
        Scanner input = new Scanner(System.in);
        double width = input.nextDouble();
        System.out.println("you entered : " + width);
    }
}
