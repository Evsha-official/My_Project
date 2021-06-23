import java.util.Scanner;

public class DeleteEmployee extends Employee{
    public void deleteEmployee(ListEmployee listEmployee){
        System.out.println("Which employee you want delete?                 if you want exit enter 0");
        DisplayEmployee displayEmployee = new DisplayEmployee();
        displayEmployee.displayEmployee2(listEmployee.getListEmployee());
        int deletedId;
        Scanner sc = new Scanner(System.in);
        deletedId = sc.nextInt();
        if(deletedId == 0){
            return;
        }
        listEmployee.getListEmployee().remove(deletedId - 1);


    }
}
