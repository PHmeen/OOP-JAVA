public class Main {
    public static void main(String[] args) {
        // อาจารย์
        Lecturer l1 = new Lecturer();
        l1.setfullname("A.J.Num");

        Lecturer l2 = new Lecturer();
        l2.setfullname("A.J. NEW");

        Lecturer l3 = new Lecturer();
        l3.setfullname("A.J.SI");

        Lecturer l4 = new Lecturer();
        l4.setfullname("A.J. Preecha");

        Lecturer l5 = new Lecturer();
        l5.setfullname("A.J.Tret");

        // วิชา turm1
        Subject s1 = new Subject("308-103", "OOP", 3, l1, 1, 1, 2025);
        Subject s2 = new Subject("308-243", "COMPUTER NETWORK SYSTEMS", 3, l2, 1, 1, 2025);
        Subject s3 = new Subject("193-031G8", "NATURAL THERAPY", 2, l3, 2, 1, 2025);

        // วิชา 2
        Subject s4 = new Subject("308-376", "Software Engineering ", 1, l4, 2, 2, 2025);
        Subject s5 = new Subject("308-311", "System Analysis", 2, l5, 2, 2, 2025);

        // นักศึกษา
        Student a1 = new Student();
        a1.setfullname("MEEN");
        a1.setIdentificationID("6610210999");
        a1.setPreBMI(170, 62);
        a1.printInfostudent();

        // เทอม 1
        a1.register(s1, 80, 2025, 1); // A
        a1.register(s2, 20, 2025, 1); // F
        a1.register(s3, 70, 2025, 1); // B

        // เทอม 2
        a1.register(s4, 80, 2025, 2); // D
        a1.register(s5, 90, 2025, 2); // A

        // ถอน s4 TESTSUBJECT001
        a1.withdrawSubject(s1);
        a1.withdrawSubject(s2);

        System.out.println("\n=== หลังถอน ===");

        // แสดงผลการเรียน
        a1.printAllSemesterRecords();
    }
}
