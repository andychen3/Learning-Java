public class Book {
    
    private String title;
    private int pages;
    private int year;

    public Book(String name, int numPages, int pubYear) {
        this.title = name;
        this.pages = numPages;
        this.year = pubYear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public int getYear() {
        return this.year;
    }

    public String toString() {
        return getTitle() + ", " + getPages() + " pages, " + getYear(); 
    }
}
