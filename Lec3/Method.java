public class Method {
    int storage(String s) {
        return s.length() * 2;
    }

    boolean flag() {
        return true;
    }

    float naturalLogBase() {
        return 2.718f;
    }

    void nothing() {
        return;
    }

    void nothing2() {
    }

    public static void main(String[] args) {
        Method demo = new Method();

        System.out.println("storage = " + demo.storage("hi"));        // 4
        System.out.println("flag = " + demo.flag());                       // true
        System.out.println("naturalLogBase = " + demo.naturalLogBase());  // 2.718
        demo.nothing();
        demo.nothing2();
    }
}
