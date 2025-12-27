package oop.abstraction;



public class AccountTransfer extends AbstractEvent{

    public AccountTransfer(String id){
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Account Transfer ought to happen as soon as possible for account " +this.getId());
    }
}
