package 성능향상보조스트림;

import java.io.*;

public class AssistStreamEx1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        int data  = -1 ; // 더 이상 읽을 데이터가 없음을 의미함
        long start = 0;
        long end = 0;

        fis = new FileInputStream("Java_Big_Data_1230/clone_jaina.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("Another_Clone_Jaina.jpg");
        start = System.currentTimeMillis(); // 1970년 1월 1일부터 현재까지 경과 시간을 밀리초로 표시
        while((data = bis.read()) != -1){
            fos.write(data);
        }
        fos.flush();
        end = System.currentTimeMillis();
        fos.close();
        bis.close();
        fis.close();
        System.out.println("버퍼 사용을 하지 않은 경우에 대한 시간 : " + (end - start) + "ms");

        fis = new FileInputStream("Java_Big_Data_1230/clone_jaina.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("Another_Clone_Jaina1.jpg");
        bos = new BufferedOutputStream(fos);
        start = System.currentTimeMillis(); // 1970년 1월 1일부터 현재까지 경과 시간을 밀리초로 표시
        while((data = bis.read()) != -1){
            bos.write(data);
        }
        bos.flush();
        end = System.currentTimeMillis();
        bos.close();
        fos.close();
        bis.close();
        fis.close();
        System.out.println("버퍼 사용 한 경우에 대한 시간 : " + (end - start) + "ms");
    }
}
