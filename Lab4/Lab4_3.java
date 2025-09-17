// import java.lang.*;  java.lang ถูก import AUTO
class Lab4_3
{
  static double rate = 4.25;          
  static final double PI = 3.1459;   //  ทำให้ PI เป็นค่าคงที่เปลี่ยนแปลงค่าไม่ได้
  public static void main(String[] args)
  {
      rate = 3.25; 
      // PI = PI + 3.20;              // PI ถูกประกาศเป็น final คือ ค่าคงที่เปลี่ยนแปลไม่ได้
      System.out.println("rate=" + rate); 
      System.out.println("PI=" + PI);     
  }
}