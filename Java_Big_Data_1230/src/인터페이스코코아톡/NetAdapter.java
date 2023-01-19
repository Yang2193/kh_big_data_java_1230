package 인터페이스코코아톡;

public interface NetAdapter {
    void connect();
    void send(String msg); // send 기능을 반드시 구현해주라고 명시.

}

class WiFi implements NetAdapter{

    @Override
    public void connect() {

    }

    @Override
    public void send(String msg) {
        System.out.println("WiFi >> " + msg);

    }
}
class FiveG implements NetAdapter{

    @Override
    public void connect() {

    }

    @Override
    public void send(String msg) {
        System.out.println("5G >> " + msg);

    }
}
