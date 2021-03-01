
public class Books {
    private String name;
    private int pages;
    private int year;
    
    public Books(String bookName, int bookPages, int publicationYear){
        this.name = bookName;
        this.pages = bookPages;
        this.year = publicationYear;
       
    }
    public String toString() {
        return this.name + ", " + this.pages + " pages" + ", " + this.year;
    }
    
    public String getName() {
        return name;
    }
    
}
