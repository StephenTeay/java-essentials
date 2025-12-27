package oop.abstraction;

import java.sql.Timestamp;

public abstract class AbstractEvent implements Event{
    private Long createdTimeStamp;
    private String id;

    public AbstractEvent(String id){
        this.createdTimeStamp = new Timestamp(System.currentTimeMillis()).getTime();
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getTimeStamp() {
        return this.createdTimeStamp;
    }
    @Override
    public abstract void process();
}
