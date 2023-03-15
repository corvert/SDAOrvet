package todo;

import java.util.Arrays;

public class ToDoList {

    private TodoTask[] todoTasks = new TodoTask[]{};

    public void add(String description){



        TodoTask[] updatedTodoTasks = new TodoTask[todoTasks.length + 1];

        for (int i = 0; i < todoTasks.length; i++){
            if (todoTasks[i].getDescription().equals(description)){
                throw new RuntimeException();
            }
            updatedTodoTasks[i] = todoTasks[i];
        }

        updatedTodoTasks[todoTasks.length] = new TodoTask(description);
        todoTasks = updatedTodoTasks;

    }
    public void remove(String description){
        if(todoTasks.length == 0){
            return;
        }
        TodoTask[] updatedTodoTasks = new TodoTask[todoTasks.length - 1];

        for (int i = 0, j = 0; i < todoTasks.length; i++, j++) {
            if (todoTasks[i].getDescription().equals(description)){
                j--;
                continue;
            }
            updatedTodoTasks[j] = todoTasks[i];

        }
        todoTasks = updatedTodoTasks;
    }

    public void complete(String description){
        for (int i = 0; i < todoTasks.length; i++) {
            if (todoTasks[i].getDescription().equals(description)){
                todoTasks[i].setDone(true);
            }

        }
    }

    public TodoTask[] getTodoTasks() {
        return todoTasks;
    }
}
