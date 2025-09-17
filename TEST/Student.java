public class Student {
    // 🔸 Attributes (คุณลักษณะของนักศึกษา)
    private String ID; // รหัสนักศึกษา
    private String Name; // ชื่อนักศึกษา
    private double Weight; // น้ำหนัก (กิโลกรัม)
    private double Height; // ส่วนสูง (เซนติเมตร)

    // 🔹 Default Constructor (คอนสตรักเตอร์เริ่มต้น)
    // ใช้สร้างอ็อบเจกต์เปล่า ๆ แล้วค่อยกำหนดค่าทีหลังด้วย setMethod
    public Student() {
        // ไม่ต้องทำอะไร ก็สามารถสร้างอ็อบเจกต์นักศึกษาได้
    }

    
    // 🔹 Parameterized Constructor (คอนสตรักเตอร์แบบกำหนดค่า)
    // ใช้สร้างอ็อบเจกต์นักศึกษาแล้วกำหนดค่าทั้งหมดในครั้งเดียว
    public Student(String Name, String ID, double Weight, double Height) {
        this.ID = ID; // this.ID คือ attribute ของคลาส
        this.Weight = Weight;
        this.Height = Height;
        this.Name = Name;
    }

    // 🔸 Setter Methods (เมธอดใช้กำหนดค่าให้กับ attributes)
    public void setID(String ID) {
        this.ID = ID; // กำหนดค่าให้ ID
    }

    public void setName(String Name) {
        this.Name = Name; // กำหนดค่าให้ Name
    }

    public void setWeight(double Weight) {
        this.Weight = Weight; // กำหนดค่าให้ Weight
    }

    public void setHeight(double Height) {
        this.Height = Height; // กำหนดค่าให้ Height
    }

    // 🔸 Method สำหรับแสดงข้อมูลนักศึกษา
    public void printInfo() {
        System.out.println("Name: " + Name);
        System.out.println("ID: " + ID);
        System.out.println("Weight: " + Weight + " kg");
        System.out.println("Height: " + Height + " cm");
    }
}
