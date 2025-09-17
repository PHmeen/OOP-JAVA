public class People {
    private String gender, nickname, identificationID, fullname;
    private int yearBorn, age;
    private double weight, height, BMI;

    public People() {
    }

    // Overloaded constructors
    public People(String gender, String nickname) {
        this.gender = gender;
        this.nickname = nickname;
    }

    public People(String gender, String nickname, String id, String fullname) {
        this(gender, nickname);
        this.identificationID = id;
        this.fullname = fullname;
    }

    public People(int yearBorn, String gender, String nickname) {
        this(gender, nickname);
        this.yearBorn = yearBorn;
        calAge();
    }

    // Setters
    public void setFullname(String name) {
        this.fullname = name;
    }

    public void setIdentificationID(String id) {
        this.identificationID = id;
    }

    public void setYearBorn(int year) {
        this.yearBorn = year;
        calAge();
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Getters
    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    // Methods
    public void calAge() {
        this.age = 2025 - yearBorn;
    }

    public void calBMI() {
        if (height > 0)
            this.BMI = weight / Math.pow(height / 100.0, 2);
    }

    public double calBMI(People p) {
        return (p.height > 0) ? p.weight / Math.pow(p.height / 100.0, 2) : 0;
    }

    public void printInfo() {
        System.out.println("\n=== Personal Info ===");
        System.out.println("Fullname: " + fullname);
        System.out.println("Nickname: " + nickname);
        System.out.println("Gender: " + gender);
        System.out.println("Year Born: " + yearBorn);
        System.out.println("Age: " + age);
        System.out.println("ID: " + identificationID);
    }

    public void printInfo(int level) {
        System.out.println("\n--- Basic Info Level " + level + " ---");
        System.out.println("Nickname: " + nickname);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }

    public void printBMI() {
        System.out.println("\n=== BMI Info ===");
        System.out.println("Nickname: " + nickname);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("BMI: " + BMI);
    }
}
