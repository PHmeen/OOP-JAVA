public class Test2 {
    public static void main(String[] args) {
        float t = 100f;
        System.out.println("Before Passing Arguments : t = " + t);
        F2C(t);  // ส่งค่า t (primitive) ไปยัง method
        System.out.println("After Passing Arguments : t = " + t);
    }

    public static void F2C(float t) {
        t = t * 5 / 9;
        System.out.println("In ChangeThem : t = " + t);
    }

    class tobject {
        public float t = 10f;
    }

    // ส่งค่า t (primitive) ไปยัง method
    /*
     * t ใน main ไม่เปลี่ยนแปลง เพราะ
     * primitive type ส่งแบบ pass by value คือ ส่งแค่สำเนาค่าไปแก้ไขใน method เท่านั้น
     */
}
