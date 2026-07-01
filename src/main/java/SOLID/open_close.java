package SOLID;

interface Taxcalulator{
    double amountAfterTax(double amount);
}

class indianTaxSystem implements Taxcalulator{
    public double amountAfterTax(double amount){
        return (amount + 0.18*amount);
    }
}
class usTaxSystem implements Taxcalulator{
    public double amountAfterTax(double amount){
        return (amount + 0.5*amount);
    }
}

class InvoiceGenerator{
    public double calculate(char region){
//        TODO Factory can be implemented
        if(region == 'I'){
            Taxcalulator taxcalulator = new indianTaxSystem();
            return taxcalulator.amountAfterTax(100);
        }
        else if(region == 'U'){
            Taxcalulator taxcalulator = new usTaxSystem();
            return taxcalulator.amountAfterTax(100);
        }
        return 0.0;
    }
}



public class open_close {
    public static void main(String[] args) {
        InvoiceGenerator invoice = new InvoiceGenerator();
        System.out.println(invoice.calculate('l'));
    }
}
