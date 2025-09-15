import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
// import java.util.Iterator;

public class ReadJSON_6610210699 {

    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try {
            Reader reader = new FileReader("6610210699.json"); 

            // แปลงข้อมูลเป็น JSONArray แทน JSONObject
            JSONArray studentList = (JSONArray) parser.parse(reader);

            // วน loop นักเรียนแต่ละคน
            for (int i = 0; i < studentList.size(); i++) {
                JSONObject student = (JSONObject) studentList.get(i);

                String firstname = (String) student.get("firstname");
                String lastname = (String) student.get("lastname");
                String studentId = (String) student.get("student_id");
                long age = (long) student.get("age");

                System.out.println("Student " + (i + 1));
                System.out.println("Name: " + firstname + " " + lastname);
                System.out.println("Student ID: " + studentId);
                System.out.println("Age: " + age);

                // ดึง address object
                JSONObject address = (JSONObject) student.get("address");
                System.out.println("Address:");
                System.out.println("  No: " + address.get("no"));
                System.out.println("  Road: " + address.get("road"));
                System.out.println("  City: " + address.get("city"));
                System.out.println("  Province: " + address.get("province"));
                System.out.println("  Postal Code: " + address.get("postalCode"));

                // ดึงภาษา
                JSONArray languages = (JSONArray) student.get("language");
                System.out.print("Languages: ");
                for (Object lang : languages) {
                    System.out.print(lang + " ");
                }
                System.out.println("\n-------------------------");
            }

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
