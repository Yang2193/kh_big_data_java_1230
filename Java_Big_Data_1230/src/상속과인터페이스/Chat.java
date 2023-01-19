package 상속과인터페이스;

import 인터페이스네트워크.NetworkAdapter;

public class Chat {
    Chat(){}
    void sendMsg(){
        System.out.println("메시지를 보냅니다.");
    }

    void rcvMsg(){
        System.out.println("메시지를 받습니다.");
    }
}

class WiFi extends Chat implements NetworkAdapter2{ // 인터페이스는 개수에 상관없이 받을 수 있다.

    String company;
    String name;
    public WiFi(String company, String name){
        this.company = company;
        this.name = name;

    }
    @Override
    public void connect() {
        System.out.println(company + "WIFI에 연결되었습니다.");

    }
    @Override
    void sendMsg(){
        System.out.println(name + "에게 메세지를 보냅니다.");
    }
    @Override
    void rcvMsg(){
        System.out.println(name + "으로부터 메시지를 받습니다.");
    }
}

class FiveG extends Chat implements NetworkAdapter2{ // 인터페이스는 개수에 상관없이 받을 수 있다.

    String company;
    String name;
    public FiveG(String company, String name){
        this.company = company;
        this.name = name;

    }
    @Override
    public void connect() {
        System.out.println(company + "5G에 연결되었습니다.");

    }
    @Override
    void sendMsg(){
        System.out.println(name + "에게 메세지를 보냅니다.");
    }
    @Override
    void rcvMsg(){
        System.out.println(name + "으로부터 메시지를 받습니다.");
    }
}
