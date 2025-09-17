public class Sex {
    public static void main(String[] args) {
        char sex = 'M';

        switch (sex) {
            case 'm':
            case 'M':
                System.out.println("Male");
                break;
            case 'f':
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Wrong Sex");
        }
    }
}
