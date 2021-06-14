import java.util.Scanner;

public class Start {
    ListEmployee listEmployee = new ListEmployee();

    public void start() {

        Employee employee6 = new Employee();
        employee6.setName("Pavlo4");
        employee6.setSurname("Evva");
        employee6.setMiddleName("Evgenovich");
        employee6.setBirthdayDate("26-08-2001");
        employee6.setPosition("junior Java Developer");
        employee6.setPhoneNumber("0505801343");
        employee6.setEmailAddress("evvapavlous2001@gmail.com");
        employee6.setWorkingPlaceNumber(5);
        employee6.setHomeAddress("Troleybusna 17 10");
        employee6.setSalary(12000);
        listEmployee.addEmployee(employee6);

        Employee employee7 = new Employee();
        employee7.setName("Pavlo");
        employee7.setSurname("Evva");
        employee7.setMiddleName("Evgenovich");
        employee7.setBirthdayDate("26-08-2001");
        employee7.setPosition("junior Java Developer");
        employee7.setPhoneNumber("0505801343");
        employee7.setEmailAddress("evvapavlous2001@gmail.com");
        employee7.setWorkingPlaceNumber(5);
        employee7.setHomeAddress("Troleybusna 17 10");
        employee7.setSalary(12000);
        listEmployee.addEmployee(employee7);

        Employee employee8 = new Employee();
        employee8.setName("Pavlo2");
        employee8.setSurname("Evva");
        employee8.setMiddleName("Evgenovich");
        employee8.setBirthdayDate("26-08-2001");
        employee8.setPosition("junior Java Developer");
        employee8.setPhoneNumber("0505801343");
        employee8.setEmailAddress("evvapavlous2001@gmail.com");
        employee8.setWorkingPlaceNumber(5);
        employee8.setHomeAddress("Troleybusna 17/10");
        employee8.setSalary(12000);
        listEmployee.addEmployee(employee8);



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
                System.out.println("add a new employee");
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
            }
        } while (number != 5);
    }
}
