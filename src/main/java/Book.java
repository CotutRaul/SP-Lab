import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;

    List<Author> authors;
    List<Chapter> chapters;
    public Book() {
    }

    public Book(String title) {
        this.title = title;
        authors = new ArrayList<>();
        chapters = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void print() {
        System.out.println("Book{" +
                "title='" + title + '\'' +
                ", authors=");
        authors.forEach(Author::print);
        System.out.println("\n chapters=");
        chapters.forEach(Chapter::print);
        System.out.println('}');
    }

    public int createChapter(String chapter) {
        Chapter chp = new Chapter(chapter);
        chapters.add(chp);
        return chapters.size()-1;
    }

    public Chapter getChapter(int indexChapter) {
        return chapters.get(indexChapter);
    }
}
