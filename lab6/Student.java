public class Student {
    String id;
    String name;
    String addr;
    double gpa;

    // Constructor 1
    Student(String id, String name) {
        System.out.println("Student method 1");
    }

    // Constructor 2
    Student(String id, String name, String addr) {
        System.out.println("Student method 2");
    }

    // Constructor 3
    Student(String id, String name, String addr, double gpa) {
        System.out.println("Student method 3");
    }

    public static void main(String[] args) {
        Student s1 = new Student("001", "John");
        Student s2 = new Student("002", "Jane", "Bangkok");
        Student s3 = new Student("003", "Jim", "Chiang Mai", 3.75);
    }
    /*
      method Student นี้เป็น Method Overloading
      เพราะมีชื่อ method เดียวกัน (Student) แต่พารามิเตอร์ต่างกัน
      ทำให้เรียกใช้งานได้ตามจำนวนและชนิดของพารามิเตอร์ที่ส่งเข้าไป
    */
}
