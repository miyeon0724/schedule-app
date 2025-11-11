package edu.hs.schedule.dao;

import edu.hs.schedule.model.Schedule;
import java.util.ArrayList;
import java.util.List;

public class ScheduleManager {
    private static final List<Schedule> schedules = new ArrayList<>();

    public static void add(Schedule schedule) {
        schedules.add(schedule);
    }

    public static List<Schedule> getAll() {
        return schedules;
    }

    public static void remove(int id) {
        schedules.removeIf(s -> s.getId() == id);
    }

    public static void clearAll() {
        schedules.clear();
    }
}
