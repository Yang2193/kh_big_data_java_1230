package 인터페이스네트워크;

import java.util.Scanner;

public class InterfaceMainEx1 {
    public static void main(String[] args) {
        NetworkAdapter adapter = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("연결한 네트워크를 선택하세요. [1]Wi-Fi [2]5G [3]LTE");
        int sel = sc.nextInt();
        switch(sel){
            case 1 : adapter = new WiFi("KT Megapass"); break;
            case 2 : adapter = new FiveG("SK Telecom"); break;
            case 3 : adapter = new LTE("LG U+"); break;
            default : System.out.println("네트워크를 잘못 선택하였습니다.");
        }
        adapter.connect(); // 초기화가 안 되어있으면 nullpointexception이 떠서 에러라고 판단.

    }
}
