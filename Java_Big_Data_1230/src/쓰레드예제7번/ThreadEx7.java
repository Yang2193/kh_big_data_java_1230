package 쓰레드예제7번;
//synchronized(동기화) : 멀티쓰레드에서 특정 메소드나 블록{} 에 대해 lock을 설정하는 것.
//동시 접근으로 인해 발생할 수 있는 문제를 해결하기 위해 사용되며, 사용시 급격한 성능 저하가 발생할 수 있음.

import static java.lang.Thread.sleep;

public class ThreadEx7 {
    public static void main(String[] args) {
        SharedValue sharedValue = new SharedValue();
        //Runnable 인터페이스 익명의 쓰레드 생성
        Runnable th1 = new Runnable() {
            @Override
            public void run() {
                sharedValue.setValue(100);
            }
        };
        Thread thread1 = new Thread(th1);
        thread1.setName("쓰레드 1번"); // 쓰레드 이름을 설정하는 메소드.
        thread1.start();
        // Runnable 인터페이스 람다식으로 익명의 쓰레드 생성
        Runnable th2 = () -> {
            sharedValue.setValue(200);
        };
        Thread thread2 = new Thread(th2);
        thread2.setName("쓰레드 2번");
        thread2.start();
    }
}

class SharedValue{
    private int value = 0;

    public int getValue() {
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
        try{
            sleep(2000);
        }catch(InterruptedException e ){} // 오래 머무르다보면 값이 깨질 확률이 높아짐.
        //오래 머무르던 중 다른 값이 들어와 값이 바뀜. 그래서 동기화가 필요.
        //쓰레드가 이 기능을 수행하는 동안 다른 쓰레드는 이 기능을 접근하지 못하기 때문에 성능 저하가 일어남.
        System.out.println(Thread.currentThread().getName() + "의 값 : " + getValue());
    }
}