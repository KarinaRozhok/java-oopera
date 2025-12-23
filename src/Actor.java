import java.util.Objects;

public class Actor extends Person {
    protected int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "gender=" + gender +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Actor)) return false;
        Actor actor = (Actor) o;

        //??????????????? < -  ПЕРЕПРОВЕРИТЬ!!! ??????????????????????

        return super.equals(o) && height == actor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }
}




