import java.io.*;

class Read2 {
    public static void main(String args[]) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        System.out.println("Enter any input");

        input = stdin.readLine();

        System.out.println("Your input is " + input);
    }
}
