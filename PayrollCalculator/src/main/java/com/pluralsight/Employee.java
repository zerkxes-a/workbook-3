package com.pluralsight;
//UNGA BUNGA MEOW MEOW WHAT MAKES UP AN EMPLOYEE
public class Employee {
    private int employeeID;
    private String name;
    private float hoursWorked;
    private float payRate;
    //CONSTRUCTOR METHOD REMEMBER THIS U DUMMIE *PARAMATERIZED CONSTRUCTOR BELOW*
    Employee (int employeeID, String name, float hoursWorked, float payRate){
        this.employeeID = employeeID;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }
//GETTER AND SETTER METHOD. SHOULD BE OBVIOUS
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }
    public float getGrossPay(){
        return (hoursWorked * payRate);
    }

}
