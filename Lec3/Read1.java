import java.io.*;

class Read1 {
    public static void main(String args[]) throws IOException {
        System.out.println("Enter one character: ");
        char c = (char) System.in.read();
        System.out.println("Your data is " + c);
    }
}
