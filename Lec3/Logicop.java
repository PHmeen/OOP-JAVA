public class Logicop {
    public static void main(String[] args) {
        boolean result = false;
        int number = 5;
        String color = "red";  

        result = (number < 10) & (color.equals("red"));      
        System.out.println("1. result = " + result);

        result = (number < 10) & (color.equals("black"));    
        System.out.println("2. result = " + result);

        result = (number > 10) || (color.equals("red"));     
        System.out.println("3. result = " + result);

        result = (number > 10) || (color.equals("black"));   
        System.out.println("4. result = " + result);

        result = (number > 10) ^ (color.equals("red"));      
        System.out.println("5. result = " + result);

        result = (number > 10) ^ (color.equals("black"));    
        System.out.println("6. result = " + result);

        result = !(number < 10) || (color.equals("red"));   
        System.out.println("7. result = " + result);

        result = (number < 10) & !(color.equals("black"));   
        System.out.println("8. result = " + result);
    }
}
