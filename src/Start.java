import java.util.Scanner;

public class Start {
    ListEmployee listEmployee = new ListEmployee();

    public void start() {
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
                addEmployee.AddEmployee();
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
