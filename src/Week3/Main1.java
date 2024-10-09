package Week3;

import Week3.Student;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Student> students = new Vector<Student>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter student address: ");
        String address = scanner.nextLine();

        System.out.print("Enter student math score: ");
        float mathScore = scanner.nextFloat();

        System.out.print("Enter student english score: ");
        float englishScore = scanner.nextFloat();

        Student student = new Student(name, age, address, mathScore, englishScore);
        students.add(student);

        System.out.println("Student added: " + student);
    }
}