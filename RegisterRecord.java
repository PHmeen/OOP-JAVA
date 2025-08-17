public class RegisterRecord {
    private Subject subject;
    private double score;
    private String grade;
    private double gradePoint;

    // Constructor เดิม (ยังใช้ได้)
    public RegisterRecord(Subject subject) {
        this.subject = subject;
    }

    // Constructor ใหม่ที่รับคะแนน
    public RegisterRecord(Subject subject, double score) {
        this.subject = subject;
        this.score = score;
    }

    // Constructor ใหม่ที่รับคะแนน เกรด และเกรดพ้อยท์
    public RegisterRecord(Subject subject, double score, String grade, double gradePoint) {
        this.subject = subject;
        this.score = score;
        this.grade = grade;
        this.gradePoint = gradePoint;
    }

    // Setters
    public void setScore(double score) {
        this.score = score;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setGradePoint(double gradePoint) {
        this.gradePoint = gradePoint;
    }

    // Getters
    public Subject getSubject() {
        return subject;
    }

    public String getSubjectName() {
        return subject.getSubjectName();
    }

    public double getScore() {
        return score;
    }

    public String getGrade() {
        return grade;
    }

    public double getGradePoint() {
        return gradePoint;
    }

    // Method คำนวณเกรดและเกรดพ้อยท์จากคะแนน
    public void calculateGradeAndPoint() {
        if (score >= 80) {
            grade = "A";
            gradePoint = 4.0;
        } else if (score >= 75) {
            grade = "B+";
            gradePoint = 3.5;
        } else if (score >= 70) {
            grade = "B";
            gradePoint = 3.0;
        } else if (score >= 65) {
            grade = "C+";
            gradePoint = 2.5;
        } else if (score >= 60) {
            grade = "C";
            gradePoint = 2.0;
        } else if (score >= 55) {
            grade = "D+";
            gradePoint = 1.5;
        } else if (score >= 50) {
            grade = "D";
            gradePoint = 1.0;
        } else {
            grade = "F";
            gradePoint = 0.0;
        }
    }

    // แสดงข้อมูล
    public void printInfo() {
        System.out.println("รายวิชา: " + subject.getSubjectName());
        System.out.println("Subject ID: " + subject.getSubjectId());
        System.out.println("Credit: " + subject.getCredit());
        System.out.println("คะแนน: " + score);
        System.out.println("เกรด: " + grade);
        System.out.println("เกรดพ้อยท์: " + gradePoint);
        System.out.println("---------------------------");
    }
}