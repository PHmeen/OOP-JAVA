public class CallBook {

    public static void main(String[] args) {
     // Object แรก: ใช้ Constructor ตั้งค่าทั้งหมด
        Book book1 = new Book(1, "Constructor", "Phathit", 1000.00, true);

    // Object ที่สอง: สร้าง object ว่าง ๆ ก่อน แล้วใช้ setter ตั้งค่าทีละค่า
        Book book2 = new Book(); 
        book2.setId(102);
        book2.setTitle("Method");
        book2.setWriter("MEEN");
        book2.setPrice(500.00);
        book2.setAvailable(false);

        System.out.println("=== Book 1 ===");
        System.out.println("ID: " + book1.getId());
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Writer: " + book1.getWriter());
        System.out.println("Price: " + book1.getPrice());
        System.out.println("Available: " + book1.isAvailable());

        System.out.println("\n=== Book 2 ===");
        System.out.println("ID: " + book2.getId());
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Writer: " + book2.getWriter());
        System.out.println("Price: " + book2.getPrice());
        System.out.println("Available: " + book2.isAvailable());
    }
}