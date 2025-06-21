package DesignPatterns.factoryDP;

public class TemporaryEmployee implements Employee{
    int salary;

    TemporaryEmployee(int salary){
        this.salary = salary;
    }
    @Override
    public int getSalary() {
        System.out.println("Temporary Employee Salary is : "+salary);
        return salary;
    }
}
