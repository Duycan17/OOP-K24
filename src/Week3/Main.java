package Week3;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setAge(20);
        student.setAddress("123 Main St");
        student.setMathScore(90);
        student.setEnglishScore(80);
        System.out.println(student.toString());
        System.out.println("Average score: " + student.getAverageScore());
        System.out.println(student.getAverageScore());
    }
}
