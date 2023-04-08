package app;




public class EmailService implements ServiceMessage {

    @Override
    public void sendMessage(String msg, String receiver) {
        System.out.println("Enviando mensagem por email para "+ receiver+" "+ msg);
    }

    @Override
    public Consumer getConsumer() {
        return new MyApplication(this);
    }
}
