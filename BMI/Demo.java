public class Demo {
    public static void main(String[] args) {

        // Object แรก
        People p4 = new People(2005, "Male", "MEEN");
        p4.setFullname("Mr. Phathit Nudam");
        p4.setIdentificationID("699");
        p4.setWeight(73);
        p4.setHeight(173);
        p4.calBMI(); 

        p4.printInfo();
        p4.printBMI();

        // Object ที่สอง
        People p5 = new People(2004, "Male", "Phu");
        p5.setFullname("Phurinat Phu");
        p5.setIdentificationID("776");
        p5.setWeight(68);
        p5.setHeight(170);

        double bmiOfPhu = p4.calBMI(p5);
        System.out.printf("\nBMI ของ Phu ที่ Meen คำนวณให้คือ: %.2f\n", bmiOfPhu);

        p5.printInfo();
        p5.calBMI();     
        p5.printBMI();

        System.out.println("=== จบโปรแกรม ===");
    }
}
