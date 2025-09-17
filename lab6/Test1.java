public class Test1 {
    static int sq(int n) {
        return n * n;
    }

    static double sq(float n) {
        return n * n;
    }

    static double sq(double n) {
        return n * n;
    }

    public static void main(String[] args) {
        int x = sq(10);        
        double y = sq(11.0);   // เรียก sq(double n)
        System.out.println(x);
        System.out.println(y);
        // - sq(10) → เรียก sq(int)
        // - sq(11.0f) → เรียก sq(float)
        // - sq(11.0) → เรียก sq(double)
    }
}
