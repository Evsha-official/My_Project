import java.util.List;

public class DisplayEmployee extends Employee{
    public void displayEmployee(List<Employee> listEmployee){
        for (int i = 0; i < listEmployee.size(); i++){
            listEmployee.get(i).print();
        }
    }

    public void displayEmployee2(List<Employee> listEmployee){
        int x = 1;
        for (int i = 0; i < listEmployee.size(); i++){
            System.out.print(x++ + ": ");
            listEmployee.get(i).print2();
        }
    }
}
