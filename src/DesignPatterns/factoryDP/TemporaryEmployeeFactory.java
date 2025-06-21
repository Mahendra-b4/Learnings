package DesignPatterns.factoryDP;

public class TemporaryEmployeeFactory implements EmployeeFactory{
    @Override
    public Employee getEmployeeSalary(int salary) {
        return new TemporaryEmployee(salary);
    }
}
