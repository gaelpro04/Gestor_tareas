import java.util.LinkedList;

public class Tasks {
    private LinkedList<Task> myTasks;

    public Tasks() {
        myTasks = new LinkedList<>();
    }

    public void add(Task task) {

        if (task.isPriority()) {
            myTasks.addFirst(task);
            return;
        }

        myTasks.add(task);
    }

    public Task delete(Task task) {
        return myTasks.remove(task) ? task : null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < myTasks.size(); i++) {
            builder.append((i+1) + "] " + myTasks.get(i) + "\n");
        }

        return builder.toString();
    }

    public boolean isEmpty() {
        return myTasks.isEmpty();
    }
}
