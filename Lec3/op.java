public class op {
    public static void main(String[] args) {
        double x = 1.0;
        double y = 5.0;
        double z = x-- + --y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
