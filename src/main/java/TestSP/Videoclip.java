package TestSP;

public class Videoclip  extends Informatii implements Element{
    public Videoclip(String name, int dimensine) {
        super(name, dimensine);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitVideoclip(this);
    }
}
