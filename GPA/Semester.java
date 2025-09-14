import java.util.ArrayList;

public class Semester {
    private int academicYear;
    private int termNumber;
    private ArrayList<RegisterRecord> registeredSubjects;

    public Semester(int academicYear, int termNumber) {
        this.academicYear = academicYear;
        this.termNumber = termNumber;
        this.registeredSubjects = new ArrayList<>();
    }

    public void registerSubject(Subject subject, double score) {
        RegisterRecord record = new RegisterRecord(subject, score);
        record.calculateGradeAndPoint(); // คำนวณเกรดทันที
        registeredSubjects.add(record);
        subject.increaseStudentCount(); // เพิ่มจำนวนนักเรียนในวิชา
    }

    public double calculateGPA() {
    double totalGradePoint = 0;
    int totalCredit = 0;

    for (RegisterRecord rr : registeredSubjects) {
        if (rr.isWithdrawn()) {
            continue; // ข้ามวิชาที่ถอน
        }
        totalGradePoint += rr.getGradePoint() * rr.getSubject().getCredit();
        totalCredit += rr.getSubject().getCredit();
    }

    return (totalCredit > 0) ? (totalGradePoint / totalCredit) : 0.0;
}


    public void printSemesterInfo() {
        System.out.println("=== ปี " + academicYear + " เทอม " + termNumber + " ===");
        for (RegisterRecord rr : registeredSubjects) {
            rr.printInfo();
        }
        System.out.println("Semester " + termNumber + " GPA: " + String.format("%.2f", calculateGPA()));
        System.out.println("-----------------------------------");
    }

    // ✅ เปลี่ยนชื่อเมธอดตรงนี้
    public ArrayList<RegisterRecord> getRegisterRecords() {
        return registeredSubjects;
    }

    public int getTotalCredits() {
        int total = 0;
        for (RegisterRecord rr : registeredSubjects) {
            total += rr.getSubject().getCredit();
        }
        return total;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public int getTermNumber() {
        return termNumber;
    }
}
