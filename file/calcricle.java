<<<<<<< HEAD
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class calcricle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("กรุณาใส่รัศมีของวงกลม: ");
            double radius = scanner.nextDouble();

            if (radius < 0) {
                throw new IllegalArgumentException("รัศมีต้องเป็นจำนวนบวกเท่านั้น.");
            }

            double area = Math.PI * radius * radius;
            double circumference = 2 * Math.PI * radius;

            System.out.printf("พื้นที่ของวงกลม: %.2f\n", area);
            System.out.printf("เส้นรอบวงของวงกลม: %.2f\n", circumference);

            // บันทึกข้อมูลลงไฟล์
            FileWriter writer = new FileWriter("circle_result.txt");
            writer.write(String.format("รัศมี: %.2f\n", radius));
            writer.write(String.format("พื้นที่: %.2f\n", area));
            writer.write(String.format("เส้นรอบวง: %.2f\n", circumference));
            writer.close();

            System.out.println("บันทึกข้อมูลลงไฟล์เรียบร้อยแล้ว (circle_result.txt)");

        } catch (InputMismatchException e) {
            System.out.println("ข้อผิดพลาด: กรุณาใส่ค่าตัวเลขเท่านั้น.");
        } catch (IllegalArgumentException e) {
            System.out.println("ข้อผิดพลาด: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("เกิดข้อผิดพลาดในการเขียนไฟล์: " + e.getMessage());
        } finally {
            scanner.close();
        }

        System.out.println("จบการทำงานของโปรแกรม.");
    }
}
=======
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class calcricle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("กรุณาใส่รัศมีของวงกลม: ");
            double radius = scanner.nextDouble();

            if (radius < 0) {
                throw new IllegalArgumentException("รัศมีต้องเป็นจำนวนบวกเท่านั้น.");
            }

            double area = Math.PI * radius * radius;
            double circumference = 2 * Math.PI * radius;

            System.out.printf("พื้นที่ของวงกลม: %.2f\n", area);
            System.out.printf("เส้นรอบวงของวงกลม: %.2f\n", circumference);

            // บันทึกข้อมูลลงไฟล์
            FileWriter writer = new FileWriter("circle_result.txt");
            writer.write(String.format("รัศมี: %.2f\n", radius));
            writer.write(String.format("พื้นที่: %.2f\n", area));
            writer.write(String.format("เส้นรอบวง: %.2f\n", circumference));
            writer.close();

            System.out.println("บันทึกข้อมูลลงไฟล์เรียบร้อยแล้ว (circle_result.txt)");

        } catch (InputMismatchException e) {
            System.out.println("ข้อผิดพลาด: กรุณาใส่ค่าตัวเลขเท่านั้น.");
        } catch (IllegalArgumentException e) {
            System.out.println("ข้อผิดพลาด: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("เกิดข้อผิดพลาดในการเขียนไฟล์: " + e.getMessage());
        } finally {
            scanner.close();
        }

        System.out.println("จบการทำงานของโปรแกรม.");
    }
}
>>>>>>> 755f774 (Add exception files, move calcricle files to 'file' folder, and delete old GPA files)
