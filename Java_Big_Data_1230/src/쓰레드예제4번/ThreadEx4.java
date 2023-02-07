package 쓰레드예제4번;
//join() : 다른 쓰레드가 종료될 때까지 기다렸다가 실행해야 하는 경우 사용
public class ThreadEx4 {
    public static void main(String[] args) {
        SumTh sumTh = new SumTh();
        sumTh.start();
        try {
            sumTh.join();// sumTh가 종료될 때까지 main이 대기하고 있음.
            //sumTh.join(100);
            //안에 시간을 넣으면 100ms를 기다리고 실행
            //경우에 따라 변수를 안 넣고 무한대기하거나, 일정시간만 대기시켜야할 경우가 있음.
        } catch (InterruptedException e){}
        System.out.println("합 : " + sumTh.getSum()); // start가 되고 나서 쓰레드 안의 기능이 다 돌아가기도 전에 출력됨.
        // 메인에서 돌아가는 속도가 쓰레드 진입 후 돌아가는 속도보다 빨라 개빨리 찍힘.
    }
}

class SumTh extends Thread{
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
    @Override
    public void run(){
        for(int i = 0; i < 100; i++){
            sum+=1;
            try {
                sleep(1);
            } catch (InterruptedException e) {
            }
        }
    }
}