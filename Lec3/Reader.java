import java.io.*;

public class Reader {
    public static void main(String[] args) throws IOException {

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(reader);
        
        System.out.print("Enter your name: ");
        String name = stdin.readLine();  

        System.out.println("Hello, " + name + "!");
    }
}
