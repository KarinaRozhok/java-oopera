import java.util.List;
import java.util.ArrayList;

class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected List<Actor> actors;

    public Show(String title, int duration, Director director, List<Actor> actors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.actors = actors;
    }
    public void printActorsList() {
        for (Actor actor : actors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        actors.add(actor);}

 public void replaceActor(Actor oldActor, Actor newActor){
            int index = actors.indexOf(oldActor);
            if (index != -1) {
                actors.set(index, newActor);
            }
        }
        }

