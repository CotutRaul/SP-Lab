import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private String name;
    private List<Paragraph> paragraphs;
    private List<Image> images;
    private List<Table> tables;




    public SubChapter() {
    }

    public SubChapter(String name) {
        this.name = name;
        paragraphs = new ArrayList<>();
        images = new ArrayList<>();
        tables = new ArrayList<>();
    }

    public void createNewParagraph(String name) {
        Paragraph paragraph = new Paragraph(name);
        paragraphs.add(paragraph);
    }

    public void createNewImage(String name) {
        Image image = new Image(name);
        images.add(image);
    }

    public void createNewTable(String name) {
        Table table = new Table(name);
        tables.add(table);
    }

    public void print() {
        System.out.println( "SubChapter{" +
                "name='" + name + '\'' +
                ", paragraphs=");
        paragraphs.forEach(Paragraph::print);
        System.out.println("\nimages=");
        images.forEach(Image::print);
        System.out.println("\ntables=");
        tables.forEach(Table::print);
        System.out.println('}');
    }
}
