class Myclass {
    public int A;
    static int B;

    public Myclass() {
        A = 0;
        B = 1;
    }
}

public class test {
    public static void main(String[] args) {
        Myclass test1 = new Myclass();
        test1.A = 1;
        test1.B = 3;
        System.out.println("test1.A = " + test1.A + " test1.B = " + test1.B);
        
        Myclass test2 = new Myclass();
        test2.A = 2;
        test2.B = 4;
        System.out.println("test2.A = " + test2.A + " test2.B = " + test2.B);
        
        test1.B = 10;
        System.out.println("test1.A = " + test1.A + " test1.B = " + test1.B);
        System.out.println("test2.A = " + test2.A + " test2.B = " + test2.B);
    }
}
