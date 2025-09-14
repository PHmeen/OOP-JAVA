import java.util.InputMismatchException;
import java.util.Scanner;

public class calgpa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        try {
            System.out.print("กรุณาใส่คะแนน (0 - 100): ");
            int score = scanner.nextInt(); 

            // ตรวจสอบช่วงคะแนน
            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("คะแนนต้องอยู่ในช่วง 0 ถึง 100 เท่านั้น.");
            }

            
            String grade;
            if (score >= 80) {
                grade = "A";
            } else if (score >= 70) {
                grade = "B";
            } else if (score >= 60) {
                grade = "C";
            } else if (score >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("เกรดของคุณคือ: " + grade);

        } catch (InputMismatchException e) {
            // กรณีผู้ใช้กรอกข้อมูลที่ไม่ใช่ตัวเลข
            System.out.println("ข้อผิดพลาด: กรุณาใส่ค่าตัวเลขเท่านั้น.");
        } catch (IllegalArgumentException e) {
            // กรณีคะแนนอยู่นอกช่วงที่กำหนด
            System.out.println("ข้อผิดพลาด: " + e.getMessage());
        } finally {
            scanner.close(); 
        }

        System.out.println("จบการทำงานของโปรแกรม.");
    }
}
