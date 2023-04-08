package app;



public class SmsService implements ServiceMessage {
    @Override
    public void sendMessage(String msg, String receiver) {
        System.out.println("Enviando mensagem por sms para "+ receiver+" "+ msg);
    }

    @Override
    public Consumer getConsumer() {
        return new MyApplication(this);
    }
}
