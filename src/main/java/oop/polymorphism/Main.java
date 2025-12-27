package oop.polymorphism;

public class Main {
    public static void main(String[] args) {
        ContactBook contact = new ContactBook("Ayomide",Integer.parseInt("0811489"));
        ContactBook contact1 = new ContactBook("Stephen", "taiwoayomide899@gmail.com");
        ContactBook contact2 = new ContactBook("Bolu","08114891459","teaycorps@gmail.com");

        System.out.println(contact);
        System.out.println(contact1);
        System.out.println(contact2);
    }
}
