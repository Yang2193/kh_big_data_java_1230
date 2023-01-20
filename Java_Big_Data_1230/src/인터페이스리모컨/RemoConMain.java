package 인터페이스리모컨;

import java.util.Scanner;

public class RemoConMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("제품을 선택하세요. [1] TV [2] Audio : ");
        int sel = sc.nextInt();
        RemoteControl rc;
        if(sel == 1){
            rc = new Television();
            rc.turnOn();
            rc.setVolume(120);
            rc.getInfo();
            rc.setMute(false); // 디폴트 메소드이며 오버라이딩 되어있는 메소드 사용.

        } else {
            rc = new Audio();
            rc.turnOn();
            rc.setVolume(20);
            rc.getInfo();
            rc.setMute(false); // 디폴트 메소드이며 오버라이딩 되어있지않은 부모의 메소드 사용.
        }
        RemoteControl.changeBattery(); // 인터페이스 소속의 메소드
        RemoteControl remoteControl = new RemoteControl() { //설계도면 가지고 찍어야 하지만, 한번쓰고 버릴거 같으면
            //이렇게 대충 만들고 버림.

            int volume;
            @Override
            public void turnOn() {
                System.out.println("Play Station 5 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("플스5 끕니다.");
            }

            @Override
            public void setVolume(int volume) {

                if(volume > RemoteControl.MAX_VOLUME) {
                this.volume = RemoteControl.MAX_VOLUME;
            } else if(volume < RemoteControl.MIN_VOLUME){
                this.volume = RemoteControl.MIN_VOLUME;
            } else {
                this.volume = volume;
            }

                System.out.println("현재 Audio 볼륨 : " + this.volume);

            }

            @Override
            public void getInfo() {
                System.out.println("TV 입니다.");
                System.out.println("현재 볼륨은 " + volume + "입니다.");
            }
        };
    }
}
