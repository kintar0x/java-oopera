import java.util.ArrayList;

public class Opera extends MusicalShow{
    private int choirSize;

    public Opera(String title, ArrayList<Actor> listOfActors, Director director, int duration, MusicAuthor musicAuthor, String librettoText, int choirSize) {
        super(title, listOfActors, director, duration, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }

}
