import java.util.List;

class MusicalShow extends Show {
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

    public void addActor(Actor newActor) {
        listOfActors.add(newActor);
    }
}


class Ballet extends MusicalShow {
    protected String choreographer;

    public Ballet(String title, int duration, Director director, List<Actor> listOfActors, String musicAuthor, String librettoText, String choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;


    }
}

class Opera extends MusicalShow {
    protected int choirSize;

    public Opera(String title, int duration, Director director, List<Actor> listOfActors, String musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
