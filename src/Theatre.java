import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {


        // Создаём актёров и режиссёров
        Actor actor1 = new Actor("Брэд", "Питт", Person.Gender.MALE, 180);
        Actor actor2 = new Actor("Марго", "Робби", Person.Gender.FEMALE, 170);
        Actor actor3 = new Actor("Аль", "Пачино", Person.Gender.MALE, 190);

        Director director1 = new Director("Кристофер", "Нолан", Person.Gender.MALE, 5);
        Director director2 = new Director("Квентин", "Тарантино", Person.Gender.FEMALE, 3);

        // Создаём автора музыки и хореографа
        Person musicAuthor = new Person("Ханс", "Циммер", Person.Gender.MALE);
        Person choreographer = new Person("Мэттью", "Борн", Person.Gender.MALE);
        String fullName = choreographer.name + " " + choreographer.surname;

        // Создаём спектакли
        Show regularShow = new Show("Моя дорогая Матильда", 120, director1, new ArrayList<>());
        Opera operaShow = new Opera("Призрак Оперы", 150, director2, new ArrayList<>(), "Автор музыки", "Текст либретто", 50);
        Ballet balletShow = new Ballet("Спящая красавица Мэттью Борна", 120, director1, new ArrayList<>(), "Автор музыки", "Текст либретто", fullName);

        // Распределяем актёров по спектаклям
        regularShow.addActor(actor1);
        regularShow.addActor(actor2);

        operaShow.addActor(actor2);
        operaShow.addActor(actor3);

        balletShow.addActor(actor1);
        balletShow.addActor(actor3);

        System.out.println("Актёры в обычном спектакле: " + regularShow.title);
        regularShow.printActorsList();

        System.out.println("Актёры в оперном спектакле: " + operaShow.title);
        operaShow.printActorsList();

        System.out.println("Актёры в балетном спектакле: " + balletShow.title);
        balletShow.printActorsList();


        Actor newActor = new Actor("Леонардо", "Дикаприо", Person.Gender.MALE, 170);

        regularShow.replaceActor(actor1, newActor);

        System.out.println("После замены актёра в обычном спектакле:");
        regularShow.printActorsList();

        System.out.println("Текст либретто оперного спектакля:");
        operaShow.printLibrettoText();

        System.out.println("Текст либретто балетного спектакля:");
        ((Ballet) balletShow).printLibrettoText();
    }
}
