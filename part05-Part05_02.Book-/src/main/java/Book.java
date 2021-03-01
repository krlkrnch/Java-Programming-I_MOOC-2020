
public class Book {

    private String author;
    private String name;
    private int pages;

    public Book(String bookAuthor, String bookName, int bookPages) {
        this.author = bookAuthor;
        this.name = bookName;
        this.pages = bookPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }
     
    public String toString () {
      return this.author + ", " + this.name + ", " + this.pages + " pages";
    }
    

}
