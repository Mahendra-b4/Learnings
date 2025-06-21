package DesignPatterns.factoryDP;

public class CallerFactory { ;

    public static Employee getEmployeeSalary(String empType, int salary) throws Exception {
        EmployeeFactory employeeFactory;
        if(empType.matches("Permanent")){
            employeeFactory = new PermanenetEmployeeFactory();
            return employeeFactory.getEmployeeSalary(salary);
        }
        else if(empType.matches("Temporary")){
            employeeFactory = new TemporaryEmployeeFactory();
            return employeeFactory.getEmployeeSalary(salary);
        }
        else throw new Exception("Wrong Employee Type");
    }
}
