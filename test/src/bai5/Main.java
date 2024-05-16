package bai5;

public class Main {
    public static void main(String[] args) {
        employee e1 = new employee("Di", "Manager", 1500000);
        employee e2 = new employee("Minh Hung", "staff", 150000);
        employee e3 = new employee("DiDi", "co-worker", 1500000);

        System.out.println("\n Employee Details: ");
        e1.printEmployeeDetails();
        e2.printEmployeeDetails();
        e3.printEmployeeDetails();
        e3.raiseSalary(10);
        e2.raiseSalary(5);
        e1.raiseSalary(6);
        System.out.println("\n After raise salary: ");
        System.out.println("\n10% for Di: ");
        e1.printEmployeeDetails();


    }
}
