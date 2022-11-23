package TestSP;

public class Melodie extends Informatii implements Element{
    public Melodie(String name, int dimensine) {
        super(name, dimensine);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitMelodie(this);
    }
}
