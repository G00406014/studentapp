package ie.atu.lab5;

import javax.print.DocFlavor;
import java.io.StringReader;
import java.util.Scanner;


public class studentapp {




    public static void main(String[] args) {
        System.out.println("please enter student name");
        Scanner input = new Scanner(System.in);
        Student1 students = new Student1();
        String name = input.nextLine();
        System.out.println("you entered : " + students.getName());


        System.out.println("please enter the students email");
        String email = input.nextLine();
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

        Student1 students3 = new Student1();
        System.out.println("please enter the third students name ");
        String name3 = input.nextLine();
        students3.setName(name3);
        System.out.println("you entered : " + students3.getName());


        System.out.println("please enter the third students email");
        String email3 = input.nextLine();
        students3.setEmail(email3);
        System.out.println("you entered : " + students3.getEmail());

        System.out.println("please enter the third students course");
        String course3 = input.nextLine();
        students3.setCourse(course3);
        System.out.println("you entered : " + students3.getCourse());



        Student1 student3 = new Student1(23,67,77);
        System.out.println("student3 name : " + students3.getName());
        System.out.println("student3 email : " + students3.getEmail());
        System.out.println("student3 course : " + students3.getCourse());

        Student1 student2 = new Student1(23,67,77);
        System.out.println("student2 name : " + students2.getName());
        System.out.println("student2 email : " + students2.getEmail());
        System.out.println("student2 course : " + students2.getCourse());

        Student1 student = new Student1(23,67,77);
        System.out.println("the first student name is : " + students.getName());
        System.out.println("the first student email is: " + students.getEmail());
        System.out.println("the first student course is: " + students.getCourse());

    }
}
