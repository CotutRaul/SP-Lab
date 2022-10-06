import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;

    List<String> text;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
        text = new ArrayList<>();
    }

    public void createNewParagraph(String paragraph) {
        text.add("Paragraph: " + paragraph);
    }

    public void createNewImage(String image) {
        text.add("Image: " + image);
    }

    public void createNewTable(String table) {
        text.add("Table: " + table);
    }

    public void print(){
        System.out.println(title);
        text.forEach(System.out::println);
    }
}
