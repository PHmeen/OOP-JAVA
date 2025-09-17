public class Scope {
    public static void main(String[] args) {
        int x = 12;
        {
            int q = 96;
            System.out.println(x);
            System.out.println(q);

        }
    }
}
