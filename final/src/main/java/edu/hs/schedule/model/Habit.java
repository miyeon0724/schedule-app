package edu.hs.schedule.model;

public class Habit {
    private int id;
    private String name;
    private int streak;
    private String frequency; // daily, weekly 등

    public Habit() {}

    public Habit(int id, String name, int streak, String frequency) {
        this.id = id;
        this.name = name;
        this.streak = streak;
        this.frequency = frequency;
    }

    // Getter & Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getStreak() { return streak; }
    public void setStreak(int streak) { this.streak = streak; }

    public String getFrequency() { return frequency; }
    public void setFrequency(String frequency) { this.frequency = frequency; }
}
