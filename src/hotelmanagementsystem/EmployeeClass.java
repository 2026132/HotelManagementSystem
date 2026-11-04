/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagementsystem;

/**
 *
 * @author ander
 */
public class EmployeeClass {
    
    static class Employee {
        private String firstName;
        private String lastName;
        private String department;
        private String position;
        private String jobTitle;
        private String company;
        private ManagerType managerType;
        
    public Employee ( String firstName, String lastName,String department,
                      String position, ManagerType managerType){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.position = position;
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
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department ;
    }
    
    public String getPosition() {
        return position;
    }
    
    public void setPosition(String position) {
        this.position = position ;
    }
    
    public ManagerType getManagerType() {
        return managerType;
    }
    
    public void setManagerType(ManagerType managerType) {
        this.managerType = managerType;
    }
    }

    
    
    
    
    
}
