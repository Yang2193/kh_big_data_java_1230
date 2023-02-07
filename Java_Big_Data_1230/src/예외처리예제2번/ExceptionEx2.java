package 예외처리예제2번;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// FileNotFoundException : 존재하지 않는 파일을 열려고 시도할 때 발생.
public class ExceptionEx2 {
    public static void main(String[] args)  { // 예외 발생하면 밖으로 던진다는 뜻
        //메인 밖으로 던지는거니 받아주는 곳이 없음
        try {
            BufferedReader br = new BufferedReader(new FileReader("없는 파일"));
            br.readLine(); // FileNotFoundException의 부모인 IOException을 던짐
            // 이 경우 예외처리를 안해서 프로그램이 그냥 죽어버림.
        } catch(IOException e){
            System.out.println(e);
            System.out.println("파일이 없습니다."); // 파일이 없어서 예외가 발생하는 경우에는 예외처리를 해주는 것이 맞다.
            //코드가 잘못된 것이 아니라 파일이 없기 때문
        }

    }
}
