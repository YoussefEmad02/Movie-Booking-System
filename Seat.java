package bmt;

public class Seat {
    private int seatNumber, reservingCustomerId;
    private boolean isReserved;


    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.isReserved = false;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getReservingCustomerId() {
        return this.reservingCustomerId;
    }

    public void setReservingCustomerId(int reservingCustomerId) {
        this.reservingCustomerId = reservingCustomerId;
    }

    public boolean isIsReserved() {
        return this.isReserved;
    }

    public boolean getIsReserved() {
        return this.isReserved;
    }

    public void setIsReserved(boolean isReserved) {
        this.isReserved = isReserved;
    }
  

    public void reserveSeat(int reservingCustomerId){
        this.reservingCustomerId = reservingCustomerId;
        this.isReserved = true;
        Data.updateSeat(this);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Seat)) {
            return false;
        }
        Seat seat = (Seat) o;
        return seatNumber == seat.seatNumber && reservingCustomerId == seat.reservingCustomerId && isReserved == seat.isReserved;
    }

}    

