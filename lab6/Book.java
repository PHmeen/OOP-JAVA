public class Book {
        // Attributes 
    private int id;
    private String title;
    private String writer;
    private double price;
    private boolean available;

       // Constructor
    public Book(int id, String title, String writer, double price, boolean available) {
        this.id = id;
        this.title = title;
        this.writer = writer;
        this.price = price;
        this.available = available;
    }
    // Getter methods 
    public Book() {

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
