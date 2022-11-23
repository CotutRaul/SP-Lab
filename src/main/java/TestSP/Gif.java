package TestSP;

public class Gif extends Informatii implements Element {
    public Gif(String name, int dimensine) {
        super(name, dimensine);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitGif(this);
    }
}
