public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Стивен", "Кинг");
        Author author2 = new Author("Виктор", "Пелевин");
        Book book1 = new Book("Мобильник", author1, 2000);
        Book book2 = new Book("Жизнь насекомых", author2, 2010);
        book1.setYearPublic(2001);
        System.out.println(book1.getNazvanie() + ", " + book1.getYearPublic() + ", " + book1.getAuthorName().getTotalName());
        System.out.println(book2.getNazvanie() + ", " + book2.getYearPublic() + ", " + book2.getAuthorName().getTotalName());
    }
}