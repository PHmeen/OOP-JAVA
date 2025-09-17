class DataOnly {
    int i;
    float f;
    boolean b;
}

public class Main {
    public static void main(String[] args) {
        DataOnly d = new DataOnly(); 

        d.i = 47;        
        d.f = 1.1f;      
        d.b = false;     

        System.out.println("i = " + d.i);
        System.out.println("f = " + d.f);
        System.out.println("b = " + d.b);
    }
}
