package 예외처리예제5번;

import java.io.FileWriter;
import java.io.IOException;

//finally : 프로그램 실행 도중 예외가 발생 할 가능성이 있는 코드에 try구문을 걸게 된다
//이 때 예외가 발생하면 catch 구문으로 들어가는데, 그렇지 않으면 아래 코드가 실행 된다.
//이 경우, 예외여부에 상관없이 항상 실행되어야만 하는 구문이 있다면 finally로 처리 할 수 있습니다.
public class ExceptionEx5 {
    public static void main(String[] args) {
        FileWriter f = null;
        try{
            f = new FileWriter("test.txt"); // FileWriter를 쓰는 경우 finally 필요.
            f.write("test");
        }catch (IOException e){
            e.printStackTrace(); // 예외를 추적하기 위해 경로를 알려달라는 것.
            //백엔드에서는 너무 많은 정보가 찍혀서 남발하기 어려움.
            //최종적으로 죽은 위치가 찍히고 어떻게 죽었는지 찍힘.
        }finally {
            if (f != null) {
                try {
                    f.close(); // 파일을 작성하면 무조건 있어야 하는 것. 파일이 열렸으면 무조건 닫혀야 된다.
                    // f != null 이라면 이미 닫혀있거나, 열리지 않았거나.
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



        /*int c;
        try{
            c = 4/1; // 4/0; 예외가 발생하든 안하든 finally 구문은 실행 됨.
        }

        catch (ArithmeticException e){
            System.out.println("여기는 예외가 발생한 구문입니다.");
        } finally {
            shouldBeRun();
        }*/

    }
 /*   static void shouldBeRun(){
        System.out.println("OK, Thanks...");
    }*/
}
