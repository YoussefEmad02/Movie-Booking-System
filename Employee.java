package bmt;

import java.util.Date;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String employeePassword;
    static int employeeCount;
    
    public Employee(){

    }

    public Employee(String employeeName, String employeePassword) {
        employeeCount ++;
        this.employeeName = employeeName;
        this.employeePassword = employeePassword;
        this.employeeId = employeeCount;
    }
    
    public void reserveSeat(int showTimeId, int customerId, Date movieTime, int seatNumber){
        //find showtime
        Showtime s =  Data.getShowtime(showTimeId);
        if(s != null){
            s.reserveSeat(seatNumber, customerId);
        }
        else{
            return;
        }
    }
    
    public void printReciept(int customerId, int showTimeId){
        Receipt receipt = new Receipt(customerId, showTimeId);
        receipt.printReciept();
    }
    public String getEmployeeDetails(){
        return "Name: " + employeeName + "\n ID: " + employeeId;
    }

   
   
    public int getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeePassword() {
        return this.employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Employee))
            return false;
        Employee c = (Employee) o;
        if(!(this.employeeId == c.getEmployeeId()))
            return false;
        return true;
    }
}