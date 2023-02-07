package 쓰레드예제5번;
// 쓰레드에서 공통으로 사용하는 클래스 생성
// synchronize : 멀티스레드 환경에서 동시 접속 허용이 되지 않돌고 lock을 거는 작업
// 하나의 스레드가 접근하면 다른 스레드가 접근 못하게 하는 것.(mutex- 하나, semaphore - 하나 이상)

public class WorkObject {
    public synchronized void methodA(){
        System.out.println("Thread의 methodA() 작업 실행");
        notify(); // 일시정지 상태에 있는 ThreadB를 실행 대기 상태로 전환
        try {
            wait(); // ThreadA를 일시정지 상태로 만듦
        } catch (InterruptedException e){}
    }
    public synchronized void methodB(){
        System.out.println("Thread의 methodB() 작업 실행");
        notify(); // 일시정지 상태에 있는 ThreadA를 실행 대기 상태로 전환
        try {
            wait(); // ThreadB를 일시정지 상태로 만듦
        } catch (InterruptedException e){}
    }

}
