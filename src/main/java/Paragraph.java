import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Paragraph implements Element{
    private String text;
    private AlignStrategy alignStrategy;
    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        if(alignStrategy==null){
            System.out.println( "Paragraph: " + text);
        }
        else {
            alignStrategy.render(this);

        }
    }
}
