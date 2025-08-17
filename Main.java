public class Main {
    public static void main(String[] args) {
        // สร้าง Lecturer
        Lecturer l1 = new Lecturer();
        l1.setfullname("A.J.Num");

        Lecturer l2 = new Lecturer();
        l2.setfullname("A.J. NEW");

        Lecturer l3 = new Lecturer();
        l3.setfullname("ภิมลมาศ รัตนบุรี");

        // สร้าง Subject
        Subject s1 = new Subject("308-103", "OOP", 3, l1, 1, 1, 2025);
        Subject s2 = new Subject("308-243", "COMPUTER NETWORK SYSTEMS", 3, l2, 1, 1, 2025);
        Subject s3 = new Subject("193-031G8", "NATURAL THERAPY", 2, l3, 2, 1, 2025);

        // สร้าง Student
        Student a1 = new Student();
        a1.setfullname("MEEN");
        a1.setIdentificationID("6610210999");

        // พิมพ์ข้อมูลนักเรียน (ต้องมี method นี้ใน People class)
        a1.printInfostudent();

        // ลงทะเบียนพร้อมระบุคะแนน
        a1.register(s1, 80); // A
        a1.register(s2, 20); // F
        a1.register(s3, 70); // B

        // พิมพ์ผลลัพธ์
        a1.printRegisterRecord();

        Student a2 = new Student();
        a2.setfullname("TungSahur");
        a2.setIdentificationID("6610210011");

        a2.printInfostudent();

        a2.register(s1, 89); // A
        a2.register(s2, 51); // D
        a2.register(s3, 69); // C+

        a2.printRegisterRecord();

        // แสดงจำนวนผู้ลงทะเบียนแต่ละวิชา (จะเพิ่มขึ้นตามจำนวนคนที่ลงทะเบียน)
        System.out.println("==== Subject Info ====");
        s1.printInfoSubject();
        s2.printInfoSubject();
        s3.printInfoSubject();
        // แสดงจำนวนนักเรียนทั้งหมดที่สร้างขึ้น
        a1.StudentCount();
    }
}

