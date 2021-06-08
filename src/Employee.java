import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

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
    private int id = this.setId();
    private static int counter;

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

    public int getId() {
        return id;
    }

    private int setId() {
        return ++counter;
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
                                "\nSalary - " + salary + "id - " + getId());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public int getAge() throws ParseException {
        Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(birthdayDate);
        LocalDate date = LocalDate.now();
        int birthdayYear = date1.getYear() + 1900;
        int age =  date.getYear() - birthdayYear;
        return age;
    }

//    public int getWorkTime(){
//
//    }




}
