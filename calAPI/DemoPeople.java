public class DemoPeople {
    public static void main(String[] args) {
        System.out.println("Hello");

        // สร้าง object พร้อมค่าเบื้องต้นผ่าน constructor
        People MEEN = new People(2005, "Male", "MEEN", " PHATHIT MEEN");
        MEEN.calAge();
        MEEN.printInfo();

        System.out.println("Bye.");
    }
}
