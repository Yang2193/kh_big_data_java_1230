package 예외처리예제6번;
//예외처리 미루기 : 해당 메소드 내에서 발생한 예외 처리에 대한 책임을 메소드를 호출한 쪽으로 떠넘김
//예외처리 던지기 :

import java.io.IOException;

public class ExceptionEx6 {
    public static void main(String[] args) {
        ThrowEx ex = new ThrowEx();
        ex.printStr(5);


            /*IOSample sample = new IOSample();
            try{
            sample.input(); // 예외처리를 해야하는 구문이라 에러 발생
        }catch (IOException e){
                e.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace(); // 이런식으로 여러가지 예외를 동시에 처리할 수 있다.
            }*/
    }
}

class IOSample {
    private int num;
    public void input() throws IOException {
        num = System.in.read(); // 예외가 발생하는 구문이라 try catch 구문을 메소드 내부에 적어야하는데 적어놓지 않음.
    }

    public void output(){
        System.out.println(num);
    }
}

class ThrowEx{
    String str = null; // null;은 참조하는 주소가 없는 것이고 "";은 참조하고 있는 주소에서 값이 없는 것?
    public void printStr(int cnt){
        if(str == null){
            System.out.println("str이 null입니다.");
            throw new NullPointerException(); // 임의로 NullPointerException을 만들어서 던져서 프로그램을 죽임.
            // 프로그램에 문제가 있을 때 일부러 문제를 발생시켜서 확인
        }

        for(int i = 0; i < cnt; i++){
            System.out.println(str);
        }
    }
}
