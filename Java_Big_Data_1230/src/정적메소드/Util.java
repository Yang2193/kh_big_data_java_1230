package 정적메소드;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public static String getCurrentDAte(String fmt){ //객체생성없이 사용하는 법
        //static으로 선언. 불러다 쓰기만 한다.
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
    final static String DOMAIN = "192.168.0.1"; // 한번 정해놓고 여러번 사용해야될 경우.

}
