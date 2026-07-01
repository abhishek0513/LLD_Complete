package SOLID;


class Notification{
    public void sendNotification(){
        System.out.println("Email send");
    }
}
class WhatsappNotification extends Notification{
    @Override
    public void sendNotification() {
        System.out.println("Whatsapp Notification send");
    }
}

public class LSP {
    public static void main(String[] args) {
        Notification notification = new WhatsappNotification();
        notification.sendNotification();

    }
}
