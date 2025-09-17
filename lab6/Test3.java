public class Test3 {

    static class tobject {
        public float t = 10f;
    }

    public static void main(String[] args) {
        tobject o = new tobject();
        o.t = 100f;
        System.out.println("Before Passing Arguments : o.t = " + o.t);
        F2C(o); // ส่ง reference ของออบเจกต์ไปยัง method
        System.out.println("After Passing Arguments : o.t = " + o.t);
    }

    public static void F2C(tobject o) {
        o.t = o.t * 5 / 9;
        System.out.println("In ChangeThem : o.t = " + o.t);
    }
    // ส่ง reference ของออบเจกต์ไปยัง method
    /*
     * o.t เปลี่ยนแปลงไป เพราะ
     * ถึงแม้ส่ง reference แบบ pass by value แต่ method สามารถแก้ไขออบเจกต์จริงที่reference ชี้อยู่ได้
     */
}
