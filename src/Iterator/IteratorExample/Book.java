package Iterator.IteratorExample;


public class Book {
 

    private String name;
    private String ISBN;
    private String press;

    public Book(String name, String ISBN, String press) {
        this.name = name;
        this.ISBN = ISBN;
        this.press = press;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", press='" + press + '\'' +
                '}';
    }
}