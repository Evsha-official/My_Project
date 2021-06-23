import java.util.Scanner;

public class Start {
    ListEmployee listEmployee = new ListEmployee();

    public void start() {

        Employee employee = new Employee();
        employee.setName("Pavlo4");
        employee.setSurname("Evva");
        employee.setMiddleName("Evgenovich");
        employee.setBirthdayDate("26-08-2001");
        employee.setPosition("junior Java Developer");
        employee.setPhoneNumber("0505801343");
        employee.setEmailAddress("evvapavlous2001@gmail.com");
        employee.setWorkingPlaceNumber(5);
        employee.setHomeAddress("Troleybusna 17 10");
        employee.setSalary(12000);
        listEmployee.addEmployee(employee);

        Employee employee1 = new Employee();
        employee1.setName("Pavlo");
        employee1.setSurname("Evva");
        employee1.setMiddleName("Evgenovich");
        employee1.setBirthdayDate("26-08-2001");
        employee1.setPosition("junior Java Developer");
        employee1.setPhoneNumber("0505801343");
        employee1.setEmailAddress("evvapavlous2001@gmail.com");
        employee1.setWorkingPlaceNumber(5);
        employee1.setHomeAddress("Troleybusna 17 10");
        employee1.setSalary(12000);
        listEmployee.addEmployee(employee1);

        Employee employee2 = new Employee();
        employee2.setName("Pavlo2");
        employee2.setSurname("Evva");
        employee2.setMiddleName("Evgenovich");
        employee2.setBirthdayDate("26-08-2001");
        employee2.setPosition("junior Java Developer");
        employee2.setPhoneNumber("0505801343");
        employee2.setEmailAddress("evvapavlous2001@gmail.com");
        employee2.setWorkingPlaceNumber(5);
        employee2.setHomeAddress("Troleybusna 17/10");
        employee2.setSalary(12000);
        listEmployee.addEmployee(employee2);



        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Welcome!");
        do {
        System.out.println("\nWhat do you want?");
        System.out.println("1 - display a list of employees");
        System.out.println("2 - add a new employee");
        System.out.println("3 - delete an existing employee");
        System.out.println("4 - edit an existing employee");
        System.out.println("5 - Exit");
        number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("display a list of employees:");
                DisplayEmployee displayEmployee = new DisplayEmployee();
                displayEmployee.displayEmployee(listEmployee.getListEmployee());
                break;
            case 2:
                System.out.println("add a new employee                 if you want exit enter 0");
                listEmployee.addEmployee(new AddEmployee().createEmployee());
                break;
            case 3:
                System.out.println("delete an existing employee");
                DeleteEmployee deleteEmployee = new DeleteEmployee();
                deleteEmployee.deleteEmployee(listEmployee);
                break;
            case 4:
                System.out.println("edit an existing employee");
                EditEmployee editEmployee = new EditEmployee();
                editEmployee.EditEmployee(listEmployee);
                break;
            case 5:
                System.out.println("Exiting");
                break;
            default:
                System.err.println("incorrect enter");
            }

        } while (number != 5);
    }
}
