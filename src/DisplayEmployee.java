import java.util.List;

public class DisplayEmployee extends Employee{
    public void displayEmployee(List<Employee> listEmployee){
        for (int i = 0; i < listEmployee.size(); i++){
            listEmployee.get(i).print();
        }
    }

    public void displayEmployee2(List<Employee> listEmployee){
        for (int i = 0; i < listEmployee.size(); i++){
            listEmployee.get(i).print2();
        }
    }
}
