package oop.abstraction;


public class MissedPaymentEvent extends AbstractEvent{


    public MissedPaymentEvent(String id) {
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Customer " + this.getId() + " missed their payment. " + "Sending a bill to Customer");

    }
}
