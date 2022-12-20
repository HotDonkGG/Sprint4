public class Task {
    private TaskPriority priority;

    public Task(TaskPriority taskPriority, String description) {
        this.priority = taskPriority;
        this.description = description;
    }

    public TaskPriority getTaskPriority() {
        return priority;
    }

    private String description;

    public String getDescription() {
        return description;
    }
}