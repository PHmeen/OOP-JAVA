public class Car {
    static String color = "Silver";
    int seat;

    public static void main(String[] args) {
        int price = 2;

        Car car320d = new Car();
        Car.color = "Bronze";  // 
        System.out.println("My new car is in " + Car.color);  
        System.out.println("Price is " + price + " Millions baht");
    }
}
