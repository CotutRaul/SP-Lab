public class Table implements Element{
    private final String title;

    public Table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println( "Table:" + title );
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }
}
