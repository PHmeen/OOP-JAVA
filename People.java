public class People {
    protected String identificationID;  
    public String fullname;

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

    public void printInfostudent() {
        System.out.println("Identification ID: " + identificationID);
        System.out.println("Fullname: " + fullname);
        System.out.println("\n");
    }
}
