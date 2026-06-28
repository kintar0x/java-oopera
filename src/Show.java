import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

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
        int count = 0;
        int firstIndex = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surname)) {
                count++;
                if (firstIndex == -1) {
                    firstIndex = i;
                }
            }
        }
        if (count == 0) {
            System.out.println("Такого актёра у нас нет!");
            return;
        }
        if (count > 1) {
            System.out.println("Найдено " + count + " актёра(-ов) с фамилией \"" + surname + "\". Заменяем первого.");
        }
        listOfActors.set(firstIndex, newActor);
    }


}
