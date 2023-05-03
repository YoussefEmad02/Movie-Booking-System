package bmt;

public class Customer {
    private int customerId;
    private String customerName, customerPassword;
    private int seatCount;

    public Customer(int customerId, String customerName, String customerPassword) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerPassword = customerPassword;
        this.save();
    }


   
    public String getCustomerDetails(){
        return "{" +
        " customerId='" + customerId + "'" +
        ", customerName='" + customerName + "'" +
        ", customerPassword='" + 
        "*********" + "'" +
        "}";
    }
    public void reserveSeat(int showTimeId, int customerId, int seatNumber){
         //find showtime
         Showtime s =  Data.getShowtime(showTimeId);
         if(s != null){
            s.reserveSeat(seatNumber, customerId);
            seatCount++;
            this.save();
         }
         else{
             return;
         }
    }

    private void save(){
        Data.updateCustomer(this);
    }

    @Override
    public String toString() {
        return "{" +
            " customerId='" + getCustomerId() + "'" +
            ", customerName='" + getCustomerName() + "'" +
            ", customerPassword='" + getCustomerPassword() + "'" +
            "}";
    }


    public int getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPassword() {
        return this.customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }
    public int getSeatCount() {
        return seatCount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Customer)) {
            return false;
        }
        Customer customer = (Customer) o;
        return (customerId == customer.customerId);
    }

}
