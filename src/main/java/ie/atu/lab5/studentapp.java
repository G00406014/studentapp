package ie.atu.lab5;

import java.util.Scanner;

public class studentapp {

    public static void main(String[] args) {
        System.out.println("please enter student name");
        Scanner input = new Scanner(System.in);
        double name = input.nextDouble();
        Student1 students = new Student1();
        students.setName(name);
        System.out.println("you entered : " + students.getName());


        System.out.println("please enter the students email");
        double email = input.nextDouble();
        System.out.println("you entered : " + students.getEmail());
        students.setEmail(email);

        System.out.println("please enter the students course");
        double course = input.nextDouble();
        System.out.println("you entered : " + students.getCourse());
        students.setCourse(course);

        Student1 students2 = new Student1();
        System.out.println("please enter the seconds students name ");
        double name2 = input.nextDouble();
        students2.setName(name2);
        System.out.println("you entered : " + students2.getName());


        System.out.println("please enter the second students email");
        double email2 = input.nextDouble();
        System.out.println("you entered : " + students2.getEmail());
        students2.setEmail(email);

        System.out.println("please enter the second students course");
        double course2 = input.nextDouble();
        System.out.println("you entered : " + students2.getCourse());
        students2.setCourse(course);

        Student1 students3 = new Student1();
        System.out.println("please enter the third students name ");
        double name3 = input.nextDouble();
        students3.setName(name3);
        System.out.println("you entered : " + students3.getName());


        System.out.println("please enter the third students email");
        double email3 = input.nextDouble();
        System.out.println("you entered : " + students3.getEmail());
        students3.setEmail(email);

        System.out.println("please enter the third students course");
        double course3 = input.nextDouble();
        System.out.println("you entered : " + students3.getCourse());
        students3.setCourse(course);
    }
}
