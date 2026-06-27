import java.util.ArrayList;

public class MusicalShow extends Show{
    MusicAuthor musicAuthor;
    String librettoText;

    public MusicalShow(String title, ArrayList<Actor> listOfActors, Director director, int duration, MusicAuthor musicAuthor, String librettoText) {
        super(title, listOfActors, director, duration);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}
