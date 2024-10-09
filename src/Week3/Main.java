package Week3;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Student> students = new Vector<Student>();
        students.add(new Student("Nguyen Van A", 20, "Ha Noi", 9, 8));
        students.add(new Student("Nguyen Van B", 21, "Ha Noi", 7, 8));
        Student student1 = new Student("Nguyen Van C",20,"Ha Noi",8,9);
        students.add(student1);
        Student student2 = new Student("Nguyen Van D",21,"Ha Noi",9,9);
        students.add(student2);
        students.add(new Student("Nguyen Van E", 22, "Ha Noi", 10, 10));
        String name ="Nguyen Van E";
        for (int i = 0;i <= students.size() - 1 ;i++){
        if (students.get(i).getName().equals(name)){
            System.out.println("Student with name: "+name+" exists in Vector");
        }
    }}
}
