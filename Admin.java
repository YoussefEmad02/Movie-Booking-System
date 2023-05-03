package bmt;

import java.sql.Date;

public class Admin {
    private String AdminPassword;

    Admin(String AdminPassword){
        this.AdminPassword = AdminPassword;
    }

    public void createEmployeeAccount(String name, String password){
        //make object employee
        Employee employee = new Employee(name, password);
        //save object
        Data.addEmployee(employee);
    }


    public void addMovie(String movieName, String movieDescription){
        //create movie object
        Movie m1 = new Movie(movieName, movieDescription);
        //save movie
        Data.addMovie(m1);
    } 

    public void editMovie(String movieName,String edit){
        //find movie & update
        Data.editMovie(edit, movieName);
    }

    public void addShowtime(int showTimeId, String movieName, java.util.Date date){
        //make new showtime with movie name in it
        Showtime show = new Showtime(showTimeId, movieName ,date);
        //save in file
        Data.addShowtime(showTimeId, movieName, date, show);
        
    }

    public void editShowTimeData(int showTimeId, Date time){
        //find showtime in List
        Data.editShowtime(showTimeId, time);
    }
     
    public String getCustomerDetails(int customerId){
        //find customer in customers file
        Customer customer = Data.findCustomer(customerId);
        //return details if found
        if(customer != null){
            return customer.getCustomerDetails();
        }
        else{
            return "Not Found";
        }
    }

    public String getEmployeeDetails(int employeeId){
        //  find Employee in customers file
        Employee employee = Data.getEmployee(employeeId);
        //return employee details if found
        if(employee != null){
            return employee.getEmployeeDetails();
        }
        return "Not Found";
    }

    @Override
    public String toString() {
        return "{" +
            " AdminPassword='" + AdminPassword + "'" +
            "}";
    }

    
}
