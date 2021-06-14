import java.util.Scanner;

public class DeleteEmployee extends Employee{
    public void deleteEmployee(ListEmployee listEmployee){
        System.out.println("Which employee you want delete?");
        DisplayEmployee displayEmployee = new DisplayEmployee();
        displayEmployee.displayEmployee2(listEmployee.getListEmployee());
        int deletedId;
        Scanner sc = new Scanner(System.in);
        deletedId = sc.nextInt();

        listEmployee.getListEmployee().remove(deletedId - 1);


    }
}
