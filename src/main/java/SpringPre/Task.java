package SpringPre;

public class Task extends User {
    private int taskId;
    private String title;
    private String desc;
    private Status Status;
    private int userId;

    public Task(){
        this.userId = getId();
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Status getStatus() {
        return Status;
    }

    public void setStatus(Status status) {
        Status = status;
    }
}
