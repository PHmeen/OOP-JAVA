import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings("unchecked")
public class WriteJSON_6610210699 {

    public static void main(String[] args) {

        // สร้าง JSON Object นักเรียนคนที่ 1
        JSONObject obj1 = new JSONObject();
        obj1.put("firstname", "Phathit");
        obj1.put("lastname", "Nudam");
        obj1.put("student_id", "6610210699");
        obj1.put("age", 20);

        // ที่อยู่ของนักเรียนคนที่ 1
        JSONObject address1 = new JSONObject();
        address1.put("no", "15");
        address1.put("road", "Karnjanavanid");
        address1.put("city", "Hatyai");
        address1.put("province", "Songkhla");
        address1.put("postalCode", "90110");
        obj1.put("address", address1);

        // ภาษาโปรแกรมที่รู้จัก
        JSONArray languages1 = new JSONArray();
        languages1.add("C");
        languages1.add("C#");
        languages1.add("javascript");
        languages1.add("Java");
        obj1.put("language", languages1);

        // สร้าง JSON Object นักเรียนคนที่ 2
        JSONObject obj2 = new JSONObject();
        obj2.put("firstname", "Phurinut");
        obj2.put("lastname", "Siritum");
        obj2.put("student_id", "6610210720");
        obj2.put("age", 20);

        // ที่อยู่ของนักเรียนคนที่ 2
        JSONObject address2 = new JSONObject();
        address2.put("no", "15");
        address2.put("road", "Karnjanavanid");
        address2.put("city", "Hatyai");
        address2.put("province", "Songkhla");
        address2.put("postalCode", "90110");
        obj2.put("address", address2);

        // ภาษาโปรแกรมที่รู้จัก
        JSONArray languages2 = new JSONArray();
        languages2.add("C");
        languages2.add("Python");
        languages2.add("Java");
        languages2.add("HTML");
        languages2.add("CSS");
        obj2.put("language", languages2);

        // รวม object นักเรียนทั้งสองลงใน JSONArray
        JSONArray studentsArray = new JSONArray();
        studentsArray.add(obj1);
        studentsArray.add(obj2);

        // เขียน JSON Array ลงไฟล์
        try (FileWriter file = new FileWriter("6610210699.json")) {
            file.write(studentsArray.toJSONString());
            file.flush();
            System.out.println("JSON file created: 6610210699.json");
        } catch (IOException e) {
            System.out.println("Error writing JSON:");
            e.printStackTrace();
        }
    }
}
