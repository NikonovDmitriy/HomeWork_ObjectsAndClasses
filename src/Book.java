public class Book {
    private final String nazvanie;
    private final Author author;
    private int yearPublic;

    public Book(String nazvanie, Author author, int yearPublic) {
        this.nazvanie = nazvanie;
        this.author = author;
        this.yearPublic = yearPublic;
    }

    public String getNazvanie() {
        return this.nazvanie;
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
