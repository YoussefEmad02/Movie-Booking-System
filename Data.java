package bmt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Data {
    private static List<Movie> allMovies = new ArrayList<Movie>();
    private static List<Showtime> allShowtimes = new ArrayList<Showtime>();
    private static List<Employee> allEmployees = new ArrayList<Employee>();
    private static List<Customer> allCustomers = new ArrayList<Customer>();
    private static List<Seat> allSeats = new ArrayList<Seat>();

    public static void addMovie(Movie m){
        int index = allMovies.indexOf(m);
        if(index == -1){
            allMovies.add(m);
            return;
        }
        return;
    }

    public static void addEmployee(Employee m){
        for (Employee e : allEmployees){
            if(e.equals(m))
                return;
        }
        allEmployees.add(m);
    }

    public static void editMovie(String edit, String movieName) {
        for(Movie m1: allMovies){
            if(m1.getMovieName().equals(movieName)){
                m1.editMovie(edit);
            }
        }
    }

    public static void addShowtime(int showTimeId, String movieName, Date date, Showtime show) {
        for(Showtime s : allShowtimes){
            if(s.getShowTimeId() == show.getShowTimeId())
                return;
        }
        Data.allShowtimes.add(show);
    }

    public static void editShowtime(int showTimeId, java.sql.Date time) {
        for(Showtime s : allShowtimes){
            if(s.getShowTimeId() == showTimeId)
            //call function edit(time);
                s.editShowTime(time);
        }
    }

    public static Customer findCustomer(int customerId) {   
         for(Customer c : allCustomers){
            if(c.getCustomerId() == customerId)
            //output all of customer fields
                return c;
        };
        return null;
    }

    public static Employee getEmployee(int employeeId) {
        for(Employee e : allEmployees){
            if(e.getEmployeeId() == employeeId)
                //found --> return employee
                return e;
        }
        //not found --> return null
        return null;
    }

    public static Showtime getShowtime(int showTimeId) {
        for(Showtime s : allShowtimes){
            if(s.getShowTimeId() == showTimeId){
               return s;
            }
        }
        return null;
    }

    public static Seat getSeat(int seatNumber) {
        for(Seat s : allSeats){
            if(s.getSeatNumber() == seatNumber){
                return s;
            }
        }
        return null;
    }

    public static void updateSeat(Seat seat) {
        int index = allSeats.indexOf(seat);
        if(index == -1){
            return;
        }
        else {
            allSeats.remove(index);
            allSeats.add(index, seat);
        }
    }

    public static void updateCustomer(Customer customer) {
        int index = allCustomers.indexOf(customer);
        if(index == -1){
            allCustomers.add(customer);
        }
        else{
            allCustomers.set(index, customer);
        }
    }

    public static void addSeat(Seat seat) {
        int index = allSeats.indexOf(seat);
        if(index == -1){
            allSeats.add(seat);
            return;
        }
        return;
    }


    
}
