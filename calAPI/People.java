import java.time.Year;

public class People {
    public String gender; // "male", "female"
    public String nickname;
    public String fullname;
    protected int yearBorn;
    protected int age;

    // Default constructor
    public People() {
    }

    // Constructor with 4 parameters
    public People(int yearBorn, String gender, String nickname, String fullname) {
        this.yearBorn = yearBorn;
        this.gender = gender;
        this.nickname = nickname;
        this.fullname = fullname;
    }

    // Getter and Setter methods
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public int getAge() {
        return age;
    }

    // Method to calculate age based on current year using API
    public void calAge() {
        int currentYear = Year.now().getValue(); // current year from system
        this.age = currentYear - this.yearBorn;
    }

    // Method to print all person information
    public void printInfo() {
        System.out.println("Fullname: " + fullname);
        System.out.println("Nickname: " + nickname);
        System.out.println("Gender: " + gender);
        System.out.println("Year Born: " + yearBorn);
        System.out.println("Age: " + age);
        System.out.println("-------------------------");
    }
}
