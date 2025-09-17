public class Bicycle {
    boolean isMoving = true;
    int currentSpeed = 10;

    void applyBrakes() {
        if (isMoving) {
            currentSpeed--;
            System.out.println("Speed after braking: " + currentSpeed);
        }
    }

    public static void main(String[] args) {
        Bicycle bike = new Bicycle();
        bike.applyBrakes();
    }
}
