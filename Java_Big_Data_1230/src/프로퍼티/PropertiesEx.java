package 프로퍼티;


import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

//키와 값이 모두 String 타입으로 제한된 Map 컬렉션
//주로 문자열로 이루어진 파일에서 정보르 읽을 때 사용
public class PropertiesEx {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties(); // HashTable에서 상속받음.
        String path = PropertiesEx.class.getResource("../회원정보종합예제/database.properties").getPath(); // ../ 상위 디렉토리로 가는 것.
        //상대경로 불러오기. 클래스를 기준으로 상대적인 경로를 불러옴.
        //불러올 파일의 path를 가져오는 방법.
        //디코딩 -> 암호화를 푸는 과정
        path = URLDecoder.decode(path, "utf-8"); // UTF-8 타입으로 path를 해석해서 가지고 오겠다.
        //한글이 포함되는 것을 해석하기 위해 UTF-8을 넣어서 해석.
        properties.load(new FileReader(path));//파일 자체를 문자열로 간주하고 키와 값을 입력하겠다.
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println("drive : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }
}
