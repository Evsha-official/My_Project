import java.util.ArrayList;
import java.util.List;

public class ListEmployee{
    private List<Employee> listEmployee = new ArrayList<>(); // edit to map

    public List<Employee> getListEmployee() {
        return listEmployee;
    }

    public void addEmployee(Employee employee){
        listEmployee.add(employee);
    }
}
