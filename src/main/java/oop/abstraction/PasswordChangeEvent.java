package oop.abstraction;



public class PasswordChangeEvent extends AbstractEvent {

    public PasswordChangeEvent(String id){
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Password for Account with id "+ this.getId() + " has been changed, If you didn't initiate this" +
                " action, kindly review your account security");

    }
}
