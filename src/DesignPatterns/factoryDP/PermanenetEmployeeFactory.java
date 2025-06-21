package DesignPatterns.factoryDP;

public class PermanenetEmployeeFactory implements EmployeeFactory{
    @Override
    public Employee getEmployeeSalary(int salary) {
        return new PermanenetEmployee(salary);
    }
}
