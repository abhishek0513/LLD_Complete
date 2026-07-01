package SOLID;

interface RiderInterface{

    void bookRide();
    void payforRide();
}
interface driverInterface{

    void acceptRide();
    void drive();
}
class Rider implements RiderInterface{

    @Override
    public void bookRide() {

    }

    @Override
    public void payforRide() {

    }
}

public class ISP {
    public static void main(String[] args) {

    }
}
