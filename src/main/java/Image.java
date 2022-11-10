import java.util.concurrent.TimeUnit;

public class Image implements Element{
    private final String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println( "Image: " + imageName);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImage(this);

    }
}
