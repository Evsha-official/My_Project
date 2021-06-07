import java.util.Scanner;

public class Start {
    ListEmployee listEmployee = new ListEmployee();

    public void start() {
//        Employee employee1 = new Employee("Pavlo", "Evva", "Evgenovich", "junior Java Developer", "0505801343", "evvapavlous2001@gmail.com", 5, "Troleybusna 17/10", 12000);
//        listEmployee.addEmployee(employee1);
//        Employee employee2 = new Employee("Pavlo", "Evva", "Evgenovich", "junior Java Developer", "0505801343", "evvapavlous2001@gmail.com", 5, "Troleybusna 17/10", 12000);
//        listEmployee.addEmployee(employee2);
//        Employee employee3 = new Employee("Pavlo", "Evva", "Evgenovich", "junior Java Developer", "0505801343", "evvapavlous2001@gmail.com", 5, "Troleybusna 17/10", 12000);
//        listEmployee.addEmployee(employee3);
//        Employee employee7 = new Employee();
//        employee7.setName("Pavlo");
//        employee7.setSurname("Evva");
//        employee7.setMiddleName("Evgenovich");
//        employee7.setPosition("junior Java Developer");
//        employee7.setPhoneNumber("0505801343");
//        employee7.setEmailAddress("evvapavlous2001@gmail.com");
//        employee7.setWorkingPlaceNumber(5);
//        employee7.setHomeAddress("Troleybusna 17 10");
//        employee7.setSalary(12000);
//        listEmployee.addEmployee(employee7);
//
//
//
//

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
                AddEmployee addEmployee = new AddEmployee();
                addEmployee.AddEmployee(listEmployee);
                break;
            case 3:
                System.out.println("delete an existing employee");
                break;
            case 4:
                System.out.println("edit an existing employee");
                break;
            case 5:
                System.out.println("Exiting");
                break;
            }
        } while (number != 5);
    }
}
