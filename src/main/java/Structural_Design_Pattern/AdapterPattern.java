package Structural_Design_Pattern;

interface Payment{
    void pay(String orderId, double amount);
}
class UpiPayment implements Payment{

    @Override
    public void pay(String orderId, double amount) {
        System.out.println("Paid : " + amount + " using upi for order : " + orderId);

    }
}
class RazorpayAPI{
    public void makePayment(String orderId, double amount){
        System.out.println("Paid : " + amount + " using Razorpay for order : " + orderId);

    }
}

class RazorpayAdapeter implements Payment{
    private RazorpayAPI razorpayAPI;
    public RazorpayAdapeter(){
        this.razorpayAPI = new RazorpayAPI();
    }
    @Override
    public void pay(String orderId, double amount) {
        razorpayAPI.makePayment(orderId, amount);
    }
}
class CheckOut {
    private Payment payment;
    public CheckOut(Payment payment){
        this.payment = payment;
    }
    public void bill(String orderId, double amount){
        payment.pay(orderId, amount);
    }
}

public class AdapterPattern {
    public static void main(String[] args) {
        CheckOut checkOut = new CheckOut(new UpiPayment());
        checkOut.bill("12",4000);
        CheckOut checkOut2 = new CheckOut(new RazorpayAdapeter());
        checkOut2.bill("13", 4059);
    }
}
