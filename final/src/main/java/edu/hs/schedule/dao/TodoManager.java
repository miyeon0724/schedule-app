package edu.hs.schedule.dao;

import edu.hs.schedule.model.Todo;
import java.util.ArrayList;
import java.util.List;

public class TodoManager {
    private static final List<Todo> todos = new ArrayList<>();

    public static void add(Todo todo) {
        todos.add(todo);
    }

    public static List<Todo> getAll() {
        return todos;
    }

    public static void remove(int id) {
        todos.removeIf(t -> t.getId() == id);
    }

    public static void clearAll() {
        todos.clear();
    }
}
