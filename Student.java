import java.util.ArrayList;

public class Student extends People {

    private double GPA;
    private ArrayList<RegisterRecord> registeredRecords;
    static int numberOfStudent;

    public Student() {
        System.out.println("ข้อมูลนักเรียน");
        registeredRecords = new ArrayList<>();
        numberOfStudent++;
    }

    public void StudentCount() {
        System.out.println("จำนวนนักเรียนทั้งหมด = " + numberOfStudent);
    }

    // ลงทะเบียนวิชาพร้อมคะแนน
    public void register(Subject s, double score) {
        RegisterRecord record = new RegisterRecord(s, score);
        registeredRecords.add(record);
        s.increaseStudentCount();  // เพิ่มจำนวนผู้ลงทะเบียนรายวิชา
    }

    public ArrayList<RegisterRecord> getRegisterList() {
        return registeredRecords;
    }

    public void printRegisterRecord() {
        System.out.println("--- Registered Records ---");
        if (registeredRecords.isEmpty()) {
            System.out.println("No records registered.");
        } else {
            for (RegisterRecord record : registeredRecords) {
                record.calculateGradeAndPoint();  // คำนวณเกรดก่อนพิมพ์
                record.printInfo();
            }
        }
        System.out.println("GPA: " + String.format("%.2f", calculateGPA()));
        System.out.println("--------------------------");
    }

    public double calculateGPA() {
        double totalGradePoint = 0;
        int totalCredit = 0;

        for (RegisterRecord record : registeredRecords) {
            totalGradePoint += record.getGradePoint() * record.getSubject().getCredit();
            totalCredit += record.getSubject().getCredit();
        }

        if (totalCredit > 0) {
            GPA = totalGradePoint / totalCredit;
        } else {
            GPA = 0;
        }

        return GPA;
    }
}
