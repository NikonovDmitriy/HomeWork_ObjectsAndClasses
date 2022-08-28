public class Book {
    private final String title;
    private final Author author;
    private int yearPublic;

    public Book(String title, Author author, int yearPublic) {
        this.title = title;
        this.author = author;
        this.yearPublic = yearPublic;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthorName() {
        return this.author;
    }

    public int getYearPublic() {
        return this.yearPublic;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }
}
