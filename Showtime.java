package bmt;

import java.util.Date;

public class Showtime {
    private int showTimeId;
    private Date movieTime;
    private String movieName;

    public Showtime(int showTimeId2, String movieName2, Date time) {
        this.showTimeId = showTimeId2;
        this.movieName = movieName2;
        this.movieTime = time;
    }

    public void reserveSeat(int seatNumber, int reservingCustomerId){
        Seat seat = Data.getSeat(seatNumber);
        if(seat != null){
            seat.reserveSeat(reservingCustomerId);
        }
        else{
            return;
        }
    }

    public int getShowTimeId() {
        return this.showTimeId;
    }

    public void setShowTimeId(int showTimeId) {
        this.showTimeId = showTimeId;
    }

    public Date getMovieTime() {
        return this.movieTime;
    }

    public void setMovieTime(Date movieTime) {
        this.movieTime = movieTime;
    }

    public String getMovieName() {
        return this.movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void editShowTime(Date time){
        this.movieTime = time;
    }
}