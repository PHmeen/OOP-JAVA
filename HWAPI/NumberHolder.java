public class NumberHolder {
    public int anInt;
    public float aFloat;

    public static void main(String[] args) {
        NumberHolder myNumber = new NumberHolder();

        myNumber.anInt = 10;
        myNumber.aFloat = 10.5f;

        System.out.println("anInt = " + myNumber.anInt);
        System.out.println("aFloat = " + myNumber.aFloat);
    }
}
