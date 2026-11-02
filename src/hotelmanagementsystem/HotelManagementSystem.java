/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelmanagementsystem;

/**
 *
 * @author ander
 */
public class HotelManagementSystem {
    
    static class Employee {
        private String firstName;
        private String lastName;
        private String gender;
        private String email;
        private double salary;
        private String department;
        private String position;
        private String jobTitle;
        private String company;
        private ManagerType managerType;
        
    public Employee ( String firstName, String lastName,String gender, String email, double salary, String department,
                      String position, String jobTitle, String company, ManagerType managerType){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.salary = salary;
        this.department = department;
        this.position = position;
        this.jobTitle = jobTitle;
        this.company = company;
        this.managerType = managerType;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lasttName) {
        this.lastName = lastName;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    }

   
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
