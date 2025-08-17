class People {
    protected String identificationID;
    public String fullname;
    protected int yearBorn;
    protected int age;
    protected double weight;
    protected double height;
    protected double BMI;
    protected String compareBMI;
    protected People people;

    public People() {
        // Default constructor
    }
    //  Constructor
    public People(String identificationID, String fullname) {
        this.identificationID = identificationID;
        this.fullname = fullname;
    }

    public void setIdentificationID(String identificationID) {
        this.identificationID = identificationID;
    }
    public String getIdentificationID() {
        return identificationID;
    }

    public void setfullname(String fullname) {
        this.fullname = fullname;
    }
    public String getfullname() {
        return fullname;
    }

    public void setPreBMI(double height,double weight){
        this.height = height;
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }
    public double getHeight(){
        return height;
    }

    public void calBMI(){
        this.BMI = this.weight / ( (this.height/100.0) * (this.height/100.0) );
    }
    public double calBMI(People people){
        double tempBMI = people.getWeight() / ( (people.getHeight()/100.0) * (people.getHeight()/100.0) );
        return tempBMI;
    }

    public void setBMI (double BMI){
        this.BMI = BMI;
    }

    public double getBMI(){
        return this.BMI;
    }

    public String getBMICategory() {
        if (BMI < 18.5) {
            return compareBMI = "น้ำหนักต่ำกว่าเกณฑ์";}
        else if (BMI >= 18.5 && BMI <= 22.9) {
            return compareBMI = "น้ำหนักสมส่วน";}
        else if (BMI >= 23.0 && BMI <= 24.9) {
            return compareBMI = "น้ำหนักเกินมาตรฐาน";}
        else if (BMI >= 25.0 && BMI <= 29.9) {
            return compareBMI = "อ้วน";}
        else {
            return compareBMI = "อ้วนมาก";}
    }

    // Modified printInfostudent() method
    public void printInfostudent() {
        // Calculate BMI and determine the category right before printing
        this.calBMI();
        this.getBMICategory();

        System.out.println("Identification ID: " + identificationID);
        System.out.println("Fullname: " + fullname);
        System.out.println("BMI: " + String.format("%.2f", BMI) + " การแปรผล: " + compareBMI);
        System.out.println("\n");
    }
}