public class DeleteEmployee extends Employee{
    public void deleteEmployee(ListEmployee listEmployee){
        System.out.println("Which employee you want delete?");
        DisplayEmployee displayEmployee = new DisplayEmployee();
        displayEmployee.displayEmployee2(listEmployee.getListEmployee());
    }
}
