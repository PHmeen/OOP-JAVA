public class LoopBreak {
    public static void main(String[] args) {
        int count = 1;
        for (;;) {
            System.out.println("Count is: " + count);
            if (count == 5) {
                break;
            }

            count++;
        }
        System.out.println("Loop finished.");
    }
}
