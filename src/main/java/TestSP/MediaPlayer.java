package TestSP;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer implements Element {
    private String name;
    private List<Playlist> playlists;

    public MediaPlayer() {
        playlists = new ArrayList<>();
    }

    public MediaPlayer(String name) {
        this.name = name;
        playlists = new ArrayList<>();
    }

    public void add(Playlist playlist) {
        playlists.add(playlist);
    }

    @Override
    public void accept(Visitor visitor) {
        for (Playlist playlist : playlists) {
            playlist.accept(visitor);
        }
    }
}
