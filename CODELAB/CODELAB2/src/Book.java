public class Book {
    private String title;
    private String author;
    private int stock;
    private double price;

    public static final double DISCOUNT_RATE = 0.1;

    public Book(String title, String author, int stock, double price) {
        this.title = title;
        this.author = author;
        this.stock = stock;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculateDiscount() {
        return price - (price * DISCOUNT_RATE);
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Stock: " + stock);
        System.out.println("Price before discount: Rp" + price);
        System.out.println("Price after discount: Rp" + calculateDiscount());
    }
}