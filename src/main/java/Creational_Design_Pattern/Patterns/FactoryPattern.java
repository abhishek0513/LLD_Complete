package Creational_Design_Pattern.Patterns;

import java.util.Objects;

interface Logistics{
    void send();

}
class Road implements Logistics {
    @Override
    public void send() {
        System.out.println("Sent by road !!!");
    }
}
class Air implements Logistics {
    @Override
    public void send() {
        System.out.println("Sent by air !!!");
    }
}

class LogisticsFactory{
    public static Logistics getLogistics(String mode){
        if(Objects.equals(mode, "air")){
            return new Air();
        }
        return new Road();
    }
}




class LogisticsService{
    public void send(String mode) {

        Logistics logistics = LogisticsFactory.getLogistics(mode);
        logistics.send();


        // {
        //violation of SOLID princ..
        //dsa method
//        if (Objects.equals(mode, "air")) {
//            Logistics logistics = new Air();
//            logistics.send();
//        } else if (Objects.equals(mode, "road")) {
//            Logistics logistics = new Road();
//            logistics.send();
//        }
        //}
    }
}

public class FactoryPattern {
    public static void main(String[] args) {

    }
}