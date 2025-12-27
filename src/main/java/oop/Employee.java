package oop;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private Location location;
    private boolean hasContributed;


    public Employee(String name, int age, double salary, Location location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = Location.REMOTE;
        this.hasContributed = false;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setHasContributed(boolean value) {
        this.hasContributed = value;
    }


    public static void raiseSalary(Employee employee) {
        if (employee.hasContributed) {
            var currentSalary = employee.getSalary();
            var increase = currentSalary * 0.4;
            var newSalary = currentSalary + increase;
            employee.setSalary(newSalary);
        }
    }
    @Override
    public String toString(){
        return this.name + " is currently "+ this.age + " and earns "+this.salary;
    }
}
