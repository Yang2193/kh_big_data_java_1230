package 쓰레드예제3번;
// sleep() : 실행 중인 스레드를 일정 시간동안 대기 상태로 만듦.
//(반복수행에 대한 시간을 늦출 때 사용하거나, 인터럽트 예외처리를 위해서 사용.)

import java.awt.*;

import static java.lang.Thread.sleep;

public class ThreadEx3 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0; i < 10; i++){
            toolkit.beep();// 비프음 울리는 메소드
            try {
                sleep(3000); // 예외처리를 밖으로 던진다 == 예외는 무시하겠따는 말과 거의 동일.
            } catch (InterruptedException e) {

            }
        }

    }
}
