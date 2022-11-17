import java.util.ArrayList;
import java.util.List;

public class Book extends Section {

    List<Author> authors;

    public Book(String title) {
        super(title);
        authors = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
        super.accept(visitor);
    }

    public void print() {
        System.out.println("Authors:");
        authors.forEach(Author::print);
        System.out.println();

        System.out.print("Book: ");
        super.print();
    }


    public void addContent(Element element) {
        super.add(element);
    }
}
