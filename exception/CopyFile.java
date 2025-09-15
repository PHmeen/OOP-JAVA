import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        // โค้ดของโปรแกรม UsingException ที่จะถูกเขียนลงไฟล์
        String programCode = "public class UsingException {\n" +
                "    public static void main(String[] args) {\n" +
                "        try {\n" +
                "            throwException();\n" +
                "        } catch (Exception e) {\n" +
                "            System.out.println(\"Exception from method 'main'\");\n" +
                "        }\n" +
                "        doesNotThrowException();\n" +
                "    }\n\n" +
                "    public static void throwException() throws Exception {\n" +
                "        try {\n" +
                "            System.out.println(\"Try from method 'throwException'\");\n" +
                "            throw new Exception();\n" +
                "        } catch (RuntimeException e) {\n" +
                "            System.out.println(\"Exception from method 'throwException'\");\n" +
                "        } finally {\n" +
                "            System.out.println(\"Finally from method 'throwException'\");\n" +
                "        }\n" +
                "    }\n\n" +
                "    public static void doesNotThrowException() {\n" +
                "        try {\n" +
                "            System.out.println(\"Try from method 'doesNotThrowException'\");\n" +
                "        } catch (RuntimeException e) {\n" +
                "            System.out.println(\"Exception from method 'doesNotThrowException'\");\n" +
                "        } finally {\n" +
                "            System.out.println(\"Finally from method 'doesNotThrowException'\");\n" +
                "        }\n" +
                "    }\n" +
                "}\n";

        // พยายามเขียนข้อมูลลงไฟล์ พร้อมจัดการ Exception
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("TestFile.txt"))) {
            writer.write(programCode);
            System.out.println("เขียนข้อมูลลงไฟล์ TestFile.txt สำเร็จ");
        } catch (IOException e) {
            System.out.println("เกิดข้อผิดพลาดในการเขียนไฟล์: " + e.getMessage());
        }
    }
}
