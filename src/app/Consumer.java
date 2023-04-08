package app;

public interface Consumer {

    void processMessage(String msg, String receiver);
}
