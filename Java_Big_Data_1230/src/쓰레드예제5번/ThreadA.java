package 쓰레드예제5번;

public class ThreadA extends Thread{
    private WorkObject workObject;
    public ThreadA(WorkObject workObject) { //ThreadA가 만들어지고 생성자가 만들어질 때 객체를 매개변수로 받음.
        //매개변수를 외부 객체에서 주입 받음 -> 내부의 workObject가 외부에서 만들어진 workObject객체의 주소를 가리킴.
        this.workObject = workObject;

    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            workObject.methodA();
        }
    }
}
