package 쓰레드예제2번;

import static java.lang.Thread.sleep;

//스레드 생성 방법 :
// - 상속을 받는 방법(extends Thread) : 구현이 간편, 다른 상속을 받지 못하는 단점이 있음.
// - Runnable 인터페이스로 구현 : 다른 클래스의 상속을 받을 수 있음, 쓰레드 객체 만드는 과정필요.
// - 익명의 객체로 구현 : 클래스 생성이 없어 간편하게 구현할 수 있음
// - 익명의 객체를 람다식으로 구현
public class ThreadEx2 {
    public static void main(String[] args) {
        Thread clsTh1 = new CustomThread();
        clsTh1.start(); // 내부적으로 run() 메소드가 호출 됨.
        Runnable run = new RunThread(); // 수행해야할 작업내용은 포함하고 있지만 실제 쓰레드는 아님.
        Thread runTh = new Thread(run); // 이렇게 쓰레드 객체를 만들어야함
        Thread runTh2 = new Thread(run);
        runTh.start(); // 과정이 하나 더 필요한 것.
        runTh2.start();
        //익명의 객체 생성
        Runnable task = new Runnable() { // 클래스 생성없이 쓰레드 만들어짐. 여기서만 사용하고 끝날거기 때문에 1회성.
            // 클래스의 이름이 없기 때문에 익명의 객체라고 한다.
            // 그러나 아직 동작하지는 않음. 러너블처럼 객체화하는 작업 필요.
            @Override
            public void run() {
                int sum = 0;
                for(int i = 0; i < 10; i++) {
                    sum += i;
                    System.out.println(Thread.currentThread() + " : " + sum);
                }
                System.out.println(Thread.currentThread() + "합계 : " + sum);

            }
        };
        Thread runTh3 = new Thread(task); // 러너블처럼 쓰레드 참조변수에 만들어줌.
        runTh3.start();

        // 익명의 객체를 람다식으로 구현.

        Runnable task2 = () -> { // 생략가능한 모든 문법은 생략하는 것이 람다의 특징
            int sum = 0;
            for(int i = 0; i < 10; i++) {
                sum += i;
                System.out.println(Thread.currentThread() + " : " + sum);
            }
            System.out.println(Thread.currentThread() + "합계 : " + sum);
        };

        Thread runTh4 = new Thread(task2);
        runTh4.start();

        System.out.println("나는 메인입니다.");
        System.out.println("나는 메인입니다.");
        System.out.println("나는 메인입니다.");
        System.out.println("나는 메인입니다."); // 쓰레드가 복잡한 일을 하는 동안 메인은 돌아가는 중
    }
}
