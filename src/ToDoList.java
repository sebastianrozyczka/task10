import java.util.ArrayList;

public class ToDoList {
    public static void main(String[] args) {
        Person son = new Person();
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(0, new Task("Zrobic zadanie domowe", "Stworzenie programu obslugujacego liste zadan"));
        tasks.add(1, new Task("Zrobic zakupy", "Lista: pomidory, ogorki, mleko", -1));
        tasks.add(2, new Task("Poodkurzać", "Odkurzanie przedpokoju i salonu", 2, son));

        tasks.get(0).showPriorityInfo();

        tasks.get(1).showPriorityInfo();

        tasks.get(2).showPriorityInfo();
    }
}
