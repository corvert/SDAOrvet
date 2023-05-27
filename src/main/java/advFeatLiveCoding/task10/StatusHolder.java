package advFeatLiveCoding.task10;

public class StatusHolder {
    private Status status;
    public StatusHolder(Status ToDo){
        status = ToDo;
    }
    public void setStatus (Status newStatus){
        status = newStatus;
    }
    public Status getStatus(){
        return status;
    }
}
