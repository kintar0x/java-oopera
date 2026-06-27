import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 1.89);
        Actor actor2 = new Actor("Мария", "Петрова", Gender.FEMALE, 1.75);
        Actor actor3 = new Actor("Илья", "Власов", Gender.MALE, 1.77);

        Director director1 = new Director("Кирилл", "Измайлов", Gender.MALE, 4);
        Director director2 = new Director("Сергей", "Мухин", Gender.MALE, 6);

        MusicAuthor musicAuthor = new MusicAuthor("Николай", "Марнин", Gender.MALE);
        Choreographer choreographer = new Choreographer("Мария", "Власик", Gender.FEMALE);

        Show show = new Show("Гамлет", new ArrayList<>(), director1, 120);
        Opera opera = new Opera("Евгений Онегин", new ArrayList<>(), director2, 180, musicAuthor, "Либретто оперы Евгений Онегин", 10);
        Ballet ballet = new Ballet("Лебединое озеро", new ArrayList<>(), director2, 180, musicAuthor, "Либретто балета Лебединое озеро", choreographer);

        show.addActorToListOfActors(actor1);
        show.addActorToListOfActors(actor2);

        opera.addActorToListOfActors(actor1);
        opera.addActorToListOfActors(actor3);

        ballet.addActorToListOfActors(actor1);
        ballet.addActorToListOfActors(actor2);
        ballet.addActorToListOfActors(actor3);

        System.out.println("Спектакль: " + show.title);
        show.printListOfActors();
        System.out.println();

        System.out.println("Опера: " + opera.title);
        opera.printListOfActors();
        System.out.println();

        System.out.println("Балет: " + ballet.title);
        ballet.printListOfActors();
        System.out.println();

        show.replaceActorToListOfActors(actor3, "Иванов");

        System.out.println("Спектакль после замены:");
        show.printListOfActors();
        System.out.println();

        show.replaceActorToListOfActors(actor2, "Яковлев");

        System.out.println("Либретто оперы:");
        opera.printLibrettoText();
        System.out.println();

        System.out.println("Либретто балета:");
        ballet.printLibrettoText();
    }
}