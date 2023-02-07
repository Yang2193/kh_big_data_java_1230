package 쓰레드예제6번;

public class InterruptThread extends Thread{
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("쓰레드가 실행 중입니다.");
                sleep(1); // while문 안에 있는 탈출조건, 인터럽트를 걸면 슬립 걸린 0.001초 사이에 탈출
            }
        } catch (InterruptedException e){
            System.out.println("인터럽트 발생...");
        }
        System.out.println("종료를 위해 자원 정리 중...");
        System.out.println("실행 종료");
    }

}
