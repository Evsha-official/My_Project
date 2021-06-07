import java.util.Scanner;

public class AddEmployee extends Employee{
//    private ListEmployee listEmployee = new ListEmployee();
    public void AddEmployee(ListEmployee listEmployee){
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println("Enter name:");
        employee.setName(sc.nextLine());
        System.out.println("Enter surname:");
        employee.setSurname(sc.nextLine());
        System.out.println("Enter Middle name:");
        employee.setMiddleName(sc.nextLine());
        System.out.println("Enter position:");
        employee.setPosition(sc.nextLine());
        System.out.println("Enter Phone number:");
        employee.setPhoneNumber(sc.nextLine());
        System.out.println("Enter Email address:");
        employee.setEmailAddress(sc.nextLine());
        System.out.println("Enter Working place number:");
        employee.setWorkingPlaceNumber(sc.nextInt());
        System.out.println("Enter Home Address:");
        employee.getHomeAddress(sc.next());
        System.out.println("Enter salary:");
        employee.setSalary(sc.nextInt());
        listEmployee.addEmployee(employee);
    }
}
