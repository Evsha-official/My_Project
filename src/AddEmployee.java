import java.util.Scanner;

public class AddEmployee extends Employee{
    ListEmployee listEmployee = new ListEmployee();
    public void AddEmployee(){

        Employee employee1 = new Employee("Pavlo", "Evva", "Evgenovich", "junior Java Developer", "0505801343", "evvapavlous2001@gmail.com", 5, "Troleybusna 17/10", 12000);
        listEmployee.addEmployee(employee1);
        Employee employee2 = new Employee("Pavlo", "Evva", "Evgenovich", "junior Java Developer", "0505801343", "evvapavlous2001@gmail.com", 5, "Troleybusna 17/10", 12000);
        listEmployee.addEmployee(employee2);
        Employee employee3 = new Employee("Pavlo", "Evva", "Evgenovich", "junior Java Developer", "0505801343", "evvapavlous2001@gmail.com", 5, "Troleybusna 17/10", 12000);
        listEmployee.addEmployee(employee3);
        Employee employee7 = new Employee();
        employee7.setName("Pavlo");
        employee7.setSurname("Evva");
        employee7.setMiddleName("Evgenovich");
        employee7.setPosition("junior Java Developer");
        employee7.setPhoneNumber("0505801343");
        employee7.setEmailAddress("evvapavlous2001@gmail.com");
        employee7.setWorkingPlaceNumber(5);
        employee7.setHomeAddress("Troleybusna 17 10");
        employee7.setSalary(12000);
        listEmployee.addEmployee(employee7);


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
