public class EditEmployee extends Employee{
    public void EditEmployee(ListEmployee listEmployee){
        System.out.println("Which employee you want edit?");
        DisplayEmployee displayEmployee = new DisplayEmployee();
        displayEmployee.displayEmployee2(listEmployee.getListEmployee());

    }
}
