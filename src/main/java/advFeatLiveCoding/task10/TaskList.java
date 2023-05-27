package advFeatLiveCoding.task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class TaskList {
    private List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(Task... tasks) {
        this.taskList.addAll(Arrays.asList(tasks));
    }

    public List<Task> isDone(){
        return taskList
                .stream()
                .filter(Task::isStatus).collect(Collectors.toList());
    }

    public void allTasks() {
        System.out.println("All tasks");
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println(taskList.get(i).toString());
        }
    }
    public List<Task> overdueTasks(int date){
        return this.taskList
                .stream()
                .filter(task -> task.getDueDate()<date)
                .collect(Collectors.toList());
    }

}
