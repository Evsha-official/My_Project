import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Employee{
    private String name;
    private String surname;
    private String middleName;
    private LocalDateTime birthdayDate; // pattern **.**.**** extend last **** = birthYear;
    private String position;
    private String phoneNumber;
    private String emailAddress;
    private int workingPlaceNumber;
    private String homeAddress;
    private double salary;
    private LocalDateTime startWorkingDate;

    public Employee(){}

    public Employee(String name, String surname, String middleName, String position, String phoneNumber, String emailAddress, int numberWorkingPlace, String localAddress, double salary){
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.workingPlaceNumber = numberWorkingPlace;
        this.homeAddress = localAddress;
        this.salary = salary;
    }

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

    public LocalDateTime getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(LocalDateTime birthdayDate) {
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

    public LocalDateTime getStartWorkingDate() {
        return startWorkingDate;
    }

    public void setStartWorkingDate(LocalDateTime startWorkingDate) {
        this.startWorkingDate = startWorkingDate;
    }

    public void print(){
System.out.println( "\nName - " + name +
                    "\nSurname - " + surname +
                    "\nMiddle name - " + middleName +
                    "\nPosition - " + position +
                    "\nPhone Number - " + phoneNumber +
                    "\nEmail Address - " + emailAddress +
                    "\nWorking Place Number - " + workingPlaceNumber +
                    "\nHome Address - " + homeAddress +
                    "\nSalary - " + salary);
    }

//        private int calculateAge(int dateOfBirthday){
//        LocalDateTime nowDateObj = LocalDateTime.now();
//        int age = nowDateObj.getYear() - dateOfBirthday.getYear();
//        return age;
//    }

//    public int getAge() {
//        LocalDate date = LocalDate.now();
//        return date.getYear() - birthYear;
//    }


//
//    private  int calculateWorkTime(int dateStartWorking){
//
//    }



}
