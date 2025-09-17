public class Main {
    public static void main(String[] args) {
        // Student meen = new Student(); // creat object
        // meen.setID("699");
        // meen.setWeight(70);
        // meen.setHeight(173);
        // meen.printInfo();

        // Student som = new Student(); // creat object
        // som.setID("699");
        // som.setWeight(70);
        // som.setHeight(173);
        // som.printInfo();

        Student meen = new Student("meen", "699", 73, 173);
        meen.printInfo();
        Student som = new Student("Som", "245", 60, 170);
        som.printInfo();
    }

}
