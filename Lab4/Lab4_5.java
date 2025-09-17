class Lab4_5 {
  public static void main(String[] args) {
    boolean x = true;
    boolean y = false;
    boolean m = x | y; // OR 
    System.out.println("m=" + m);

    boolean n = x & y; // AND
    System.out.println("n=" + n);

    boolean o = x ^ y; // XOR
    System.out.println("o=" + o);

    boolean p = !x; // NOR
    System.out.println("p=" + p);

    boolean q = !(m | n) & (o | p);
    System.out.println("q=" + q);
  }
}
