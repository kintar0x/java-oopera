import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, ArrayList<Actor> listOfActors, Director director, int duration) {
        this.title = title;
        this.listOfActors = listOfActors;
        this.director = director;
        this.duration = duration;
    }

    public void printListOfActors() {
        if (listOfActors.isEmpty()) {
            System.out.println("Список актёров пуст.");
            return;
        }
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addActorToListOfActors(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Такой актёр уже есть в списке!");
            return;
        }
        listOfActors.add(newActor);
    }

    public void replaceActorToListOfActors(Actor newActor, String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surname)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Такого актёра у нас нет!");
    }


}
