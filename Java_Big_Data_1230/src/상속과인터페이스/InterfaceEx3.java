package 상속과인터페이스;

import java.util.Scanner;

public class InterfaceEx3 {
    public static void main(String[] args) {

        NetworkAdapter2 adapter;
        Scanner sc = new Scanner(System.in);
        System.out.println("연결한 네트워크 선택 [1]WIFI [2]5G : ");
        int sel = sc.nextInt();
        if(sel == 1){
            WiFi wifi = new WiFi("KT Megapass", "고유림");
            wifi.connect();
            wifi.sendMsg();
            wifi.rcvMsg();
        } else { FiveG fiveG = new FiveG("SK", "나희도");
            fiveG.connect();
            fiveG.sendMsg();
            fiveG.rcvMsg(); // 동작은 되는데 설계가 잘못됨.

        }

    }
}
