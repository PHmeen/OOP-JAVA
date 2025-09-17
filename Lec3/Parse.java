public class Parse {
    public static void main(String[] args) {
        String ageString = "25";  // ใช้เครื่องหมายคำพูดปกติ ""
        int age = Integer.parseInt(ageString);  // แปลง String เป็น int

        String priceString = "125.25";
        double price = Double.parseDouble(priceString);  // แปลง String เป็น double

        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
    }
}
