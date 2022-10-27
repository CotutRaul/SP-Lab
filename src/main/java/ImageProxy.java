public class ImageProxy implements Element{

    public Image realImage = null;
    public String src;

    public ImageProxy(String src) {
        this.src = src;
    }

    public Image loadImage() {
        // String tmp = realImage.toString().substring(3).toUpperCase();
        if (realImage == null)
            realImage = new Image(this.src);

        return realImage;
    }

    @Override
    public void print() {
        loadImage();
        realImage.print();
    }
}
