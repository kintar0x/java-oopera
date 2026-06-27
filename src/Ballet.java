import java.util.ArrayList;

public class Ballet extends MusicalShow{
    Choreographer choreographer;

    public Ballet(String title, ArrayList<Actor> listOfActors, Director director, int duration, MusicAuthor musicAuthor, String librettoText, Choreographer choreographer) {
        super(title, listOfActors, director, duration, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
