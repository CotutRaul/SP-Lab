import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    private final String name;
    private final List<Element> elements;


    public Section(String name) {
        this.name = name;
        elements = new ArrayList<>();
    }

    public void print() {
        System.out.println(name);
        elements.forEach(Element::print);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
        for (Element element : elements) {
            element.accept(visitor);
        }
    }

    public void add(Element element){
        elements.add(element);
    }

}
