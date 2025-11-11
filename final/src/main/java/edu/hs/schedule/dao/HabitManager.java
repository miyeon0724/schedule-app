package edu.hs.schedule.dao;

import edu.hs.schedule.model.Habit;
import java.util.ArrayList;
import java.util.List;

public class HabitManager {
    private static final List<Habit> habits = new ArrayList<>();

    public static void add(Habit habit) {
        habits.add(habit);
    }

    public static List<Habit> getAll() {
        return habits;
    }

    public static void remove(int id) {
        habits.removeIf(h -> h.getId() == id);
    }

    public static void clearAll() {
        habits.clear();
    }
}
