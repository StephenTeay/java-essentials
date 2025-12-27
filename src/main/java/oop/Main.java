package oop;

public class Main {
    public static void main(String  [] args){
        Employee stephen = new Employee("Stephen",23,100000,Location.ONSITE);
        Employee praise = new Employee("Praise",19,10000,Location.REMOTE);

        System.out.println(stephen);
        System.out.println(praise);
        System.out.println("===========================================");
        stephen.setHasContributed(true);
        Employee.raiseSalary(stephen);
        System.out.println(stephen);
        Employee.raiseSalary(praise);
        System.out.println(praise);

    }
}
