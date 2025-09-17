public class EqualsMethod {
  public static void main(String[] args) {
    Integer n1 = 47; // autoboxing
    Integer n2 = Integer.valueOf(47);

    System.out.println(n1.equals(n2));
  }
}
