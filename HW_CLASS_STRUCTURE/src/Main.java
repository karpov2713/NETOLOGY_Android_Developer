public class Main {
    public static void main(String[] args) {
        Author author = new Author("Dmitry", "Karpov", 3);
        Book book = new Book(author, "Android-forever", 2025, 501);

        System.out.println(book.isBig(book.pages));
        System.out.println(book.estimatePrice(book.pages));
        System.out.println(book.contains("Dmitry"));
    }
}