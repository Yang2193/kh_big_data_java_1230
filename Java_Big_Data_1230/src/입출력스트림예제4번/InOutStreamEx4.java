package 입출력스트림예제4번;

import 인터페이스리모컨.RemoteControl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
//Reader는 문자 스트림의 최상위 추상 클래스입니다.
public class InOutStreamEx4 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("test1.txt");
        int readNo;
        char[] cBuf = new char[256]; // 문자를 한번에 256개씩 읽어들임.
        String data = "";
     //   int readData;
        while(true){
//            readData = reader.read(); // 한 개의 문자(2byte)를 읽어 4byte int타입으로 반환.
//            if(readData == -1) break;
//            System.out.print((char)readData);
            readNo = reader.read(cBuf);
            if(readNo == -1)break;
            data += new String(cBuf, 0, readNo); // 문자열에 256개씩 붙여나감.
        }
        System.out.println(data);
        reader.close();
    }
}
