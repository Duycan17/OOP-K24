package Week3;

public class Student {
    private String name;
    private int age;
    private String address;
    private float mathScore;
    private float englishScore;

    public Student(){
        System.out.println("Default constructor called");
    }

    public Student(String name, int age, String address, float mathScore, float englishScore) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getMathScore() {
        return mathScore;
    }

    public void setMathScore(float mathScore) {
        this.mathScore = mathScore;
    }

    public float getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(float englishScore) {
        this.englishScore = englishScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", mathScore=" + mathScore +
                ", englishScore=" + englishScore +
                '}';
    }

    public float getAverageScore() {
        return (this.getMathScore() + this.getEnglishScore()) / 2;
    }
}
