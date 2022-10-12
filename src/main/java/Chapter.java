import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapters;

    public Chapter() {
    }

    public Chapter(String name) {
        this.name = name;
        subChapters = new ArrayList<>();
    }

    public int createSubChapter(String subChapter) {
        SubChapter subChp = new SubChapter(subChapter);
        subChapters.add(subChp);
        return subChapters.size()-1;
    }

    public SubChapter getSubChapter(int indexSubChapter) {
        return subChapters.get(indexSubChapter);
    }

    public void print() {
        System.out.print( "Chapter{" +
                "name='" + name + '\'' +
                ", subChapters=");
        subChapters.forEach(SubChapter::print);
        System.out.println( '}');
    }

}
