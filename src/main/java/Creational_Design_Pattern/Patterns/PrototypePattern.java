package Creational_Design_Pattern.Patterns;

interface emailTemplates extends Cloneable {
    emailTemplates Clone(); //deep copy
    void setContent(String content);

    void send(String to);
}

class WelcomeEmail implements emailTemplates{
    private String subject;
    private String content;

    public WelcomeEmail() {
        this.subject = "Offer letter released";
        this.content = "Sign the document and send back it to me";;
    }

    @Override
    public WelcomeEmail Clone() {
        try {
            return (WelcomeEmail) super.clone();
        }
        catch (CloneNotSupportedException e){
            throw new RuntimeException("Clone failed ", e);
        }
    }

    @Override
    public void setContent(String content) {
        this.content = content;

    }

    @Override
    public void send(String to) {
        System.out.println("Sending to " + to + ": [" + subject + "] " + content);
    }
}

public class PrototypePattern {
    public static void main(String[] args) {
        WelcomeEmail welcomeEmail = new WelcomeEmail();
    }
}
