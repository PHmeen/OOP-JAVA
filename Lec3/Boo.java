public class Boo {
    public static void main(String[] args) {
        boolean testResult = true;
        boolean testValue = false;

        if (testResult) {
            System.out.println("ผ่าน");
        } else {
            System.out.println("ไม่ผ่าน");
        }

        // สลับค่าของ testResult
        testResult = !testResult;

        System.out.println("ค่าคือ: " + testResult);
    }
}
