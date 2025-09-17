
// Read3.java
import java.util.Scanner;
import java.io.IOException;

class Read3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any input: ");
        String input = scanner.nextLine();
        System.out.println("Your input: " + input);
        scanner.close();
    }
}
