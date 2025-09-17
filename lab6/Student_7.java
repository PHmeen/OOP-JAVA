class People {
    String name;
    int age;
}

public class Student_7 extends People {
    double grade;

    // Default Constructor กำหนดค่าเบื้องต้นเมื่อสร้างออบเจกต์
    public Student_7() {
        this.grade = 3.50;
        this.age = 20;
    }

    public void printProfile() {
        System.out.println(" Age : " + age);
        System.out.println(" Grade : " + grade);
    }

    
    public static void main(String[] args) {
        Student_7 student = new Student_7();
        student.name = "Phathit";
        System.out.println(" Name : " + student.name);
        student.printProfile();
    }
}
