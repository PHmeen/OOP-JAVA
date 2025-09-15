import java.util.ArrayList;

public class Student extends People {

    private ArrayList<Semester> semesters;  // เก็บข้อมูลแต่ละเทอม
    static int numberOfStudent;

    public Student() {
        System.out.println("ข้อมูลนักเรียน");
        semesters = new ArrayList<>();
        numberOfStudent++;
    }

    public void StudentCount() {
        System.out.println("จำนวนนักเรียนทั้งหมด = " + numberOfStudent);
    }

    // ลงทะเบียนวิชาพร้อมคะแนน โดยระบุปีและเทอม
    public void register(Subject s, double score, int year, int term) {
        Semester semester = findOrCreateSemester(year, term);
        semester.registerSubject(s, score);
    }

    // หาว่าเทอมนี้มีอยู่แล้วหรือยัง ถ้าไม่มีก็สร้างใหม่
    private Semester findOrCreateSemester(int year, int term) {
        for (Semester sem : semesters) {
            if (sem.getAcademicYear() == year && sem.getTermNumber() == term) {
                return sem;
            }
        }
        Semester newSem = new Semester(year, term);
        semesters.add(newSem);
        return newSem;
    }

    // ถอนรายวิชา โดยรับ subject object
    public boolean withdrawSubject(Subject subject) {
        for (Semester semester : semesters) {
            for (RegisterRecord record : semester.getRegisterRecords()) {
                if (record.getSubject().getSubjectId().equals(subject.getSubjectId())) {
                    record.setWithdrawn(true);
                    System.out.println("ถอนรายวิชา " + subject.getSubjectName() + " สำเร็จ!");
                    return true;
                }
            }
        }
        System.out.println("ไม่พบรายวิชา " + subject.getSubjectName());
        return false;
    }

    // ถอนรายวิชา โดยรับ subject ID
    public boolean withdrawSubject(String subjectId) {
        for (Semester semester : semesters) {
            for (RegisterRecord record : semester.getRegisterRecords()) {
                if (record.getSubject().getSubjectId().equals(subjectId)) {
                    record.setWithdrawn(true);
                    System.out.println("ถอนรายวิชา " + record.getSubject().getSubjectName() + " สำเร็จ!");
                    return true;
                }
            }
        }
        System.out.println("ไม่พบรายวิชา ID: " + subjectId);
        return false;
    }

    // แสดงผลการเรียนทั้งหมด + GPAX
    public void printAllSemesterRecords() {
        double totalGradePoint = 0;
        int totalCredit = 0;

        for (Semester sem : semesters) {
            sem.printSemesterInfo();  // แสดงผลในแต่ละเทอม
            totalGradePoint += sem.calculateGPA() * sem.getTotalCredits();
            totalCredit += sem.getTotalCredits();
        }

        double gpax = (totalCredit > 0) ? totalGradePoint / totalCredit : 0.0;
        System.out.println("==== GPAX รวมทุกเทอม ====");
        System.out.println("GPAX: " + String.format("%.2f", gpax));
        System.out.println("==========================");
    }

    // แสดงรายวิชาทั้งหมดทุกเทอม
    public void printAllRecords() {
        for (Semester semester : semesters) {
            for (RegisterRecord record : semester.getRegisterRecords()) {
                record.printInfo();
            }
        }
    }
}
