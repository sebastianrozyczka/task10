public class Task {
    private String name;
    private String description;
    private int priority;
    private Person person;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Task(String name, String description, int priority) {
        this(name, description);
        this.priority = priority;
    }

    public Task(String name, String description, int priority, Person person) {
        this(name, description, priority);
        this.person = person;
    }

    boolean highPriority() {
        return priority > 0;
    }

    boolean mediumPriority() {
        return priority == 0;
    }

    boolean lowPriority() {
        return priority < 0;
    }

    void showPriorityInfo(){
        System.out.println("Czy zadanie: " + name + " ma wysoki priorytet? " + highPriority());
        System.out.println("Czy zadanie: " + name + " ma średni priorytet? " + mediumPriority());
        System.out.println("Czy zadanie: " + name + " ma niski priorytet? " + lowPriority());
    }
}
