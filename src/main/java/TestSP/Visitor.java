package TestSP;

public interface Visitor {
    void visitPlaylist(Playlist playlist);
    void visitVideoclip(Videoclip videoclip);
    void visitGif(Gif gif);
    void visitMelodie(Melodie melodie);

    void pringSizes();
}
