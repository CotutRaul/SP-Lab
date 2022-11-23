package TestSP;

public class MediaSizeVisitor implements Visitor {

    private int sizePlaylist;
    private int sizeVideoclip;
    private int sizeGif;
    private int sizeMelodie;

    public MediaSizeVisitor() {
        sizePlaylist = sizeVideoclip = sizeGif = sizeMelodie = 0;
    }

    @Override
    public void visitPlaylist(Playlist playlist) {
        sizePlaylist = sizeVideoclip + sizeGif + sizeMelodie;
    }

    @Override
    public void visitVideoclip(Videoclip videoclip) {
        sizeVideoclip += videoclip.dimensiune;
    }

    @Override
    public void visitGif(Gif gif) {
        sizeGif += gif.dimensiune;
    }

    @Override
    public void visitMelodie(Melodie melodie) {
        sizeMelodie += melodie.dimensiune;

    }

    @Override
    public void pringSizes(){
        System.out.println(
                "sizePlaylist = " + sizePlaylist +
                "\nsizeVideoclip = " + sizeVideoclip +
                "\nsizeGif = " + sizeGif +
                "\nsizeMelodie = " + sizeMelodie);
    }
}

