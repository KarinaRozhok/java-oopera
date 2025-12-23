import java.util.List;

public class MusicalShow extends Show {
    protected String musicAuthor;
    protected String librettoText;
    protected List<Actor> listOfActors;

    public MusicalShow(String title, int duration, Director director, List<Actor> listOfActors, String musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
        this.listOfActors = listOfActors;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }

}

