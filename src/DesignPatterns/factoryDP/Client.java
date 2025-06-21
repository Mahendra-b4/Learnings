package DesignPatterns.factoryDP;

public class Client {

    public static void main(String[] args) throws Exception {
        Employee permanent = CallerFactory.getEmployeeSalary("Permanent", 450000);
        permanent.getSalary();

        Employee temp = CallerFactory.getEmployeeSalary("Temporary", 350000);
        temp.getSalary();

        Employee permanent2 = CallerFactory.getEmployeeSalary("Permanen", 450000);
        permanent2.getSalary();
    }

}
