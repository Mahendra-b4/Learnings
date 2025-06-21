package DesignPatterns.factoryDP;

public class PermanenetEmployee implements Employee{

    int salary;

    PermanenetEmployee(int salary){
        this.salary = salary;
    }
    @Override
    public int getSalary() {
        System.out.println("Salary of Permanent Employee = "+salary);
        return salary;
    }
}
