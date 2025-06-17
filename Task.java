import java.time.LocalDate;
//Class that models something to do for the user
public class Task {
    private String title;
    private String description;
    private LocalDate dateFinish;
    private boolean isDone;
    private boolean priority;

    public Task (String title, String description, LocalDate dateFinish, boolean isDone, boolean priority) {
        this.title = title;
        this.description = description;
        this.dateFinish = dateFinish;
        this.isDone = isDone;
        this.priority = priority;
    }

    public Task (String title, String description, boolean priority) {
        this.title = title;
        this.description = description;
        dateFinish = null;
        isDone = false;
        this.priority = priority;
        dateFinish = null;
    }

    public Task(String title) {
        this.title = title;
        description = null;
        dateFinish = null;
        isDone = false;
        priority = false;
        dateFinish = null;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Class getters and setters'

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(LocalDate dateFinish) {
        this.dateFinish = dateFinish;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        LocalDate currentDate = LocalDate.now();

        return title + "\n " + description + "\n Finish date: " + (dateFinish.isEqual(currentDate) ? ("Ends today: " +
                dateFinish.toString()) : dateFinish.isBefore(currentDate) ? ("It expired: " + dateFinish) : dateFinish) +
                "\n Completed: " + (isDone ? "Yes " : "No ") + "\n Priority: " + (isPriority() ? "Yes " : "No ");
    }
}