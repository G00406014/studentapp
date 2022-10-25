package ie.atu.lab5;

import java.util.Scanner;


public class studentapp {
    public static void main(String[] args) {
        Student1 students = new Student1();
        System.out.println("please enter student name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        students.setName(name);
        System.out.println("you entered : " + students.getName());



        System.out.println("please enter the students email");
        String email = input.nextLine();
        students.setEmail(email);
        System.out.println("you entered : " + students.getEmail());

        System.out.println("please enter the students course");
        String course = input.nextLine();
        students.setCourse(course);
        System.out.println("you entered : " + students.getCourse());

        Student1 students2 = new Student1();
        System.out.println("please enter the seconds students name ");
        String name2 = input.nextLine();
        students2.setName(name2);
        System.out.println("you entered : " + students2.getName());


        System.out.println("please enter the second students email");
        String email2 = input.nextLine();
        students2.setEmail(email2);
        System.out.println("you entered : " + students2.getEmail());

        System.out.println("please enter the second students course");
        String course2 = input.nextLine();
        students2.setCourse(course2);
        System.out.println("you entered : " + students2.getCourse());

        Student1 students3 = new Student1(name , course , email);
        System.out.println("student3 name : " +   students3.getName());
        System.out.println("student3 email : " +  students3.getEmail());
        System.out.println("student3 course : " + students3.getCourse());

    }
}
