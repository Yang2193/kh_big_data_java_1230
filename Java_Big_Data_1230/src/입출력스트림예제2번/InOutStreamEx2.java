package 입출력스트림예제2번;
//InputStream : 바이트 기반의 입력 스트림의 최상위 클래스로 추상 클래스입니다.


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InOutStreamEx2 {
    public static void main(String[] args) throws IOException { // 난 파일이 없어도 아무것도 안할거야 무시할거야 예외처리 안할거야
        InputStream is = new FileInputStream("test.bin");
        byte[] buffer = new byte[100];
        while(true){


//            int data = is.read(); // 1바이트씩 읽기
//            if(data == -1) break; // 파일 입출력에서 디폴트 값은 -1. -1이라는 것은 즉 읽을 것이 없다는 뜻.
//            System.out.print(data + " ");

            int readByteNumber = is.read(buffer, 1, 2); // 매개변수로 전달한 buffer에 값을 담아서 readByteNumber로 넘김
            // 단순히 1바이트씩 읽기로 넘기면 사진 하나 전송하는데 수십만번 돌아야한다.
            // 그래서 buffer에 일정량의 바이트씩 담아서 넘기는 것.
            // read에서 읽을 때 100개씩 읽겠다라는 뜻이된다.
            System.out.print(readByteNumber);
            if(readByteNumber == -1) break;
           /* for(int i = 0; i < readByteNumber; i++){
                System.out.print(buffer[i] + " ");
            }*/
        }
        is.close(); // 읽기 위해 열어 둔 스트림을 닫음.

    }
}
