public class UsingException {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (Exception e) {
            System.out.println("Exception from method 'main'");
        }
        doesNotThrowException();
    }

    public static void throwException() throws Exception {
        try {
            System.out.println("Try from method 'throwException'");
            throw new Exception();
        } catch (RuntimeException e) {
            System.out.println("Exception from method 'throwException'");
        } finally {
            System.out.println("Finally from method 'throwException'");
        }
    }

    public static void doesNotThrowException() {
        try {
            System.out.println("Try from method 'doesNotThrowException'");
        } catch (RuntimeException e) {
            System.out.println("Exception from method 'doesNotThrowException'");
        } finally {
            System.out.println("Finally from method 'doesNotThrowException'");
        }
    }
}
