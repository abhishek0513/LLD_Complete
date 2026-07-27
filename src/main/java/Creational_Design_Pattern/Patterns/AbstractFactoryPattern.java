package Creational_Design_Pattern.Patterns;


interface PaymentGateway{
    void processPayment(double amount);
}

class RazorpayGateway implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment Razorpay : " + amount);
    }
}


class PayUGateway implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment through PayU : " + amount);
    }
}

interface Invoice{
    void generateInvoice();
}

class GSTInvoice implements Invoice{
    @Override
    public void generateInvoice() {
        System.out.println("Generating invoice for India");
    }
}


class Checkout{
    private String gatewayType;
    public Checkout(String gatewayType){
        this.gatewayType = gatewayType;
    }
    public void checkout(double amount){
            //useless code;
        //        if(gatewayType == "Razorpay"){
//            PaymentGateway paymentGateway=  new RazorpayGateway();
//            paymentGateway.processPayment(amount);
//        }
//        else{
//            PaymentGateway paymentGateway = new PayUGateway();
//            paymentGateway.processPayment(amount);
//        }


        PaymentGateway paymentGateway = Indiafactory.createPaymentGateway(gatewayType);

        Invoice invoice = Indiafactory.createInvoice();
        invoice.generateInvoice();
    }
}

class Indiafactory{
    public static PaymentGateway createPaymentGateway(String gatewayType){
        switch (gatewayType.toLowerCase()){
            case "razorpay":
                return new RazorpayGateway();
            case "payugateway":
                return new PayUGateway();

            default:
                throw new IllegalArgumentException("Unsupported or wrong selected");
        }
    }
    public static Invoice createInvoice(){
        return new GSTInvoice();
    }
}
public class AbstractFactoryPattern {
    public static void main(String[] args) {

    }
}
