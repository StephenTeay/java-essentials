package oop.polymorphism;

public class ContactBook {
    private String name;
    private String phoneNumber;
    private String email;

    public ContactBook(String name, String phoneNumber, String email){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public ContactBook(String name, int phoneNumber){
        this.name = name;
        this.phoneNumber = String.valueOf(phoneNumber);
    }
    public ContactBook(String name, String email){
        this.name = name;
        this.email = email;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(this.name);
        if(this.phoneNumber != null){
            sb.append(" Phone: ").append(this.phoneNumber);
        }
        if(this.email != null){
            sb.append(" Email: ").append(this.email);
        }
        return sb.toString();
    }


}
