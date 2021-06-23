import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class Employee{
    private String name;
    private String surname;
    private String middleName;
    private String birthdayDate;
    private String position;
    private String phoneNumber;
    private String emailAddress;
    private int workingPlaceNumber;
    private String homeAddress;
    private double salary;
    private String startWorkingDate;
    private String id = this.setId();
    //private static double counter = 1;

    public Employee(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getWorkingPlaceNumber() {
        return workingPlaceNumber;
    }

    public void setWorkingPlaceNumber(int workingPlaceNumber) {
        this.workingPlaceNumber = workingPlaceNumber;
    }

    public String getHomeAddress(String s) {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getStartWorkingDate() {
        return startWorkingDate;
    }

    public void setStartWorkingDate(String startWorkingDate) {
        this.startWorkingDate = startWorkingDate;
    }

    public String getId() {
        return id;
    }

    private String setId() {
        String ID = UUID.randomUUID().toString();
        return ID;
    }

    public void print(){
        try {
            System.out.println( "\nName - " + name +
                                "\nSurname - " + surname +
                                "\nMiddle name - " + middleName +
                                "\nAge - " + getAge() +
                                "\nPosition - " + position +
                                "\nPhone Number - " + phoneNumber +
                                "\nEmail Address - " + emailAddress +
                                "\nWorking Place Number - " + workingPlaceNumber +
                                "\nHome Address - " + homeAddress +
                                "\nSalary - " + salary);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void print2(){
        System.out.println(name);
    }

    public int getAge() throws ParseException {
        Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(birthdayDate);
        LocalDate date = LocalDate.now();
        int birthdayYear = date1.getYear() + 1900;
        int age =  date.getYear() - birthdayYear;
        return age;
    }

    public Employee createEmployee(){
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        String input = null;
        int inputInt;
            System.out.println("Enter name:");
            input = sc.nextLine();
            if(input.equals("0")){
                return employee;
            }
            employee.setName(input);
            System.out.println("Enter surname:");
            input = sc.nextLine();
            if(input.equals("0")){
                return employee;
            }
            employee.setSurname(input);
            System.out.println("Enter Middle name:");
            input = sc.nextLine();
            if(input.equals("0")){
                return employee;
            }
            employee.setMiddleName(input);
            System.out.println("Enter birthday date:                  Example: 12-12-1987");
            input = sc.nextLine();
            if(input.equals("0")){
                return employee;
            }
            employee.setBirthdayDate(input);
            System.out.println("Enter position:");
            input = sc.nextLine();
            if(input.equals("0")){
                return employee;
            }
            employee.setPosition(input);
            System.out.println("Enter Phone number:");
            input = sc.nextLine();
            if(input.equals("0")){
                return employee;
            }
            employee.setPhoneNumber(input);
            System.out.println("Enter Email address:");
            input = sc.nextLine();
            if(input.equals("0")){
                return employee;
            }
            employee.setEmailAddress(input);
            System.out.println("Enter Working place number:");
            inputInt = sc.nextInt();
            if(inputInt == 0){
                return employee;
            }
            employee.setWorkingPlaceNumber(inputInt);
            System.out.println("Enter Home Address:");
            input = sc.nextLine();
            input = sc.nextLine();
            if(input.equals("0")){
                return employee;
            }
            employee.setHomeAddress(input);
            System.out.println("Enter salary:");
            inputInt = sc.nextInt();
            if(inputInt == 0){
                return employee;
            }
            employee.setSalary(inputInt);

        return employee;
    }

//    public int getWorkTime(){
//
//    }




}
