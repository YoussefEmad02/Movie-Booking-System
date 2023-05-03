package bmt;

public class Receipt {
    private int seatCount;
    private int customerId, showTimeId;
    private double amount;

    Receipt(int customerId, int showTimeId){
        this.customerId = customerId;
        this.showTimeId = showTimeId;
    }

    public void printReciept(){
        Customer customer = Data.findCustomer(customerId);
        if(customer != null){
            seatCount = customer.getSeatCount();
            CalcAmount();
            System.out.println("Your Total is:" + amount);
        }
        else 
            return;
    }

    private void CalcAmount(){
        amount = seatCount * 19.99;
    }
}
