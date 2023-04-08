import app.Consumer;
import app.EmailService;
import app.ServiceMessage;
import app.SmsService;

public class Main {
    public static void main(String[] args) {
        ServiceMessage injector = null;
        Consumer app = null;


        injector = new EmailService();
        app = injector.getConsumer(); // return new MyApplication(this) referencia para o injector

        app.processMessage("Olá maria rita", "MARIA RITA CHATONA FI");


        injector = new SmsService();
        app = injector.getConsumer();
        app.processMessage("Olá maria rita", "MARIA RITA CHATONA FI");
    }
}