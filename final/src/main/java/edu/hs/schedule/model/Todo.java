package edu.hs.schedule.model;

public class Todo {
    private int id;
    private String task;
    private boolean isDone;
    private String deadline;

    public Todo() {}

    public Todo(int id, String task, boolean isDone, String deadline) {
        this.id = id;
        this.task = task;
        this.isDone = isDone;
        this.deadline = deadline;
    }

    // Getter & Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTask() { return task; }
    public void setTask(String task) { this.task = task; }

    public boolean isDone() { return isDone; }
    public void setDone(boolean done) { isDone = done; }

    public String getDeadline() { return deadline; }
    public void setDeadline(String deadline) { this.deadline = deadline; }
}
