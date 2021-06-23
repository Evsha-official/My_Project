import java.util.Scanner;

public class EditEmployee extends Employee{
    public void EditEmployee(ListEmployee listEmployee){
        System.out.println("Which employee you want edit?                 if you want exit enter 0");
        DisplayEmployee displayEmployee = new DisplayEmployee();
        displayEmployee.displayEmployee2(listEmployee.getListEmployee());
        int editId;
        Scanner sc = new Scanner(System.in);
        editId = sc.nextInt();
        if(editId == 0){
           return;
        }
        listEmployee.getListEmployee().get(editId - 1).print();
        System.out.println("\nWhat do you want edit?");
        String edit = sc.next();

        switch (edit){
            case "Name", "name", "1":
                System.out.println("Name:");
                String editName = sc.next();
                listEmployee.getListEmployee().get(editId -1).setName(editName);
                break;
            case "Surname", "surname", "2":
                System.out.println("Surname:");
                String editSurname = sc.next();
                listEmployee.getListEmployee().get(editId -1).setSurname(editSurname);
                break;
            case "Middle name", "middle name", "3":
                System.out.println("Middle name:");
                String editMiddleName = sc.next();
                listEmployee.getListEmployee().get(editId -1).setMiddleName(editMiddleName);
                break;
            case "Birthday date", "birthday date", "Age", "age", "4":
                System.out.println("Age:");
                String editAge = sc.next();
                listEmployee.getListEmployee().get(editId -1).setBirthdayDate(editAge);
                break;
            case "Position", "position", "5":
                System.out.println("Position:");
                String editPosition = sc.next();
                listEmployee.getListEmployee().get(editId -1).setPosition(editPosition);
                break;
            case "Phone number", "phone number", "6":
                System.out.println("Phone Number:");
                String editPhoneNumber = sc.next();
                listEmployee.getListEmployee().get(editId -1).setPhoneNumber(editPhoneNumber);
                break;
            case "Email address", "email address", "7":
                System.out.println("Email Address:");
                String editEmailAddress = sc.next();
                listEmployee.getListEmployee().get(editId -1).setEmailAddress(editEmailAddress);
                break;
            case "Working place number", "working place number", "8":
                System.out.println("Working Place Number:");
                int editWorkingPlaceNumber = sc.nextInt();
                listEmployee.getListEmployee().get(editId -1).setWorkingPlaceNumber(editWorkingPlaceNumber);
                break;
            case "Home address", "home address", "9":
                System.out.println("Home Address:");
                String editHomeAddress = sc.next();
                listEmployee.getListEmployee().get(editId -1).setHomeAddress(editHomeAddress);
                break;
            case "Salary", "salary", "10":
                System.out.println("Salary:");
                double editSalary = sc.nextDouble();
                listEmployee.getListEmployee().get(editId -1).setSalary(editSalary);
                break;
        }
    }
}
