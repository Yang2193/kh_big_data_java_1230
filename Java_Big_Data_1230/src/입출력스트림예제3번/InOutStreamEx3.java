package 입출력스트림예제3번;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//바이트 출력 스트림의 최상위 추상 클래스는 OutputStream
//문자출력 스트림의 최상위 추상 클래스는 Write 입니다.
public class InOutStreamEx3 {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("test1.txt"); // 문자를 파일에다 작성하는 것.
       // char[] data = "일타스캔들 재밌음".toCharArray();
        String data = "재벌집 막내아들은 재밌었는데 엔딩이 별로였음";
       /* for(int i = 0; i < data.length; i++){
            writer.write(data[i]);
        }*/
        writer.write(data);
        writer.flush(); // write() 이후에 버퍼를 비움.
        writer.close(); // 스트림의 자원을 반납하고 닫음
    }
}
