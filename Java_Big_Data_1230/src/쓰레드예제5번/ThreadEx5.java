package 쓰레드예제5번;
//쓰레드간의 협업 : wait(), notify(), notifyAll()
//wait() : 현재의 쓰레드를 대기 상태로 전환
//notify() : 대기 상태에 있는 쓰레드를 실행 대기 상태로 전환
//notifyAll() : 일시정지 된 모든 쓰레드를 실행 대기 상태로 전환
public class ThreadEx5{
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();
        ThreadA thA = new ThreadA(sharedObject);//외부에서 만든 객체를 넣는다 -> 주입
        ThreadB thB = new ThreadB(sharedObject);
        thA.start();
        thB.start();

    }
}
