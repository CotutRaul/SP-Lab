package TestSP;

public class Main {
    public static void main(String[] args) {
        MediaPlayer m = new MediaPlayer("Winamp");
        Playlist p = new Playlist("Chill");
        p.add(new Melodie("BudaBar",3000));
        p.add(new Videoclip("Waves in Caraibe",200000));
        p.add(new Melodie("Simple things",4000));
        p.add(new Gif("sunglasses", 500));
        m.add(p);

        Visitor v = new MediaSizeVisitor();
        m.accept(v);
        v.pringSizes();
    }
}
