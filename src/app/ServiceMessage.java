package app;

public interface ServiceMessage {

    void sendMessage(String msg, String receiver);

    Consumer getConsumer();
}
