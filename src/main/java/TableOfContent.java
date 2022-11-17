import java.util.ArrayList;
import java.util.List;

public class TableOfContent implements Element{
    List<String> content;

    public TableOfContent() {
        content = new ArrayList<>();
    }

    public void addContent(String name, int page){
        content.add(name+"................. pag " +page);
    }

    @Override
    public void print() {
        content.forEach(System.out::println);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitContent(this);
    }
}
