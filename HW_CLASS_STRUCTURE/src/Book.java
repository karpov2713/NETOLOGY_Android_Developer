public class Book {
    static int pagesForBig = 500;
    static int minPrice = 250;

    public Author author;
    public String title;
    public int releaseYear;
    public int pages;

    Book(Author author, String title, int releaseYear, int pages) {
        this.author = author;
        this.title = title;
        this.releaseYear = releaseYear;
        this.pages = pages;
    }

    public boolean isBig(int pages) {
        return pages > pagesForBig;
    }

    public boolean contains(String word) {
        return author.name.contains(word) || author.surname.contains(word) || title.contains(word);
    }

    public int estimatePrice(int pages) {
        if ((int) Math.floor(pages * (3 * Math.sqrt(author.rating))) < minPrice) {
            return minPrice;
        } else {
            return (int) Math.floor(pages * (3 * Math.sqrt(author.rating)));
        }
    }
}
