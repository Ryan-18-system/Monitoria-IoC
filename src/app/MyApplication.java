package app;

public class MyApplication implements Consumer{

    private ServiceMessage serviceMessage;
    public MyApplication(ServiceMessage serviceMessage) {
        this.serviceMessage = serviceMessage;
    }

    @Override
    public void processMessage(String msg, String receiver) {
            this.serviceMessage.sendMessage(msg,receiver);
    }

}

//  3 formas de injetar dependência pelo set, variável de instância e Construtor







