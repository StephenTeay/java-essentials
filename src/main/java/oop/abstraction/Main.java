package oop.abstraction;



public class Main {
    public static void main(String[] args) {

        AccountTransfer acctEvent = new AccountTransfer("Ayo");
        MissedPaymentEvent paymentEvent = new MissedPaymentEvent("Mide");
        PasswordChangeEvent passwordChangeEvent = new PasswordChangeEvent("Bayo");

        Event [] events = {acctEvent, paymentEvent,passwordChangeEvent};

        for(Event e: events){
            System.out.println(e.getTimeStamp());
            e.process();
            System.out.println();
        }

    }
}
