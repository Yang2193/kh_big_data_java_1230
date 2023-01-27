package 제네릭일반;

import java.util.ArrayList;
import java.util.List;

// 컴파일 시 강한 타입체크 / 자바 8 이전 대비 변경사항
// 타입 변환 제거 / 자바 8 이전 대비 변경 사항
public class GenericTestEx {
    public static void main(String[] args) {
//        List list = new ArrayList<>(); // 자바 8 이전 스타일.
//        list.add(0); // 어떤 타입을 넣어도 에러가 안 남. 아직 내가 타입을 지정하지 않았기 때문.
//        String str = (String) list.get(0); // 컴파일 에러가 아닌 런타임 에러가 발생
        // 이 경우 실제 사용자가 사용하다가 프로그램이 동작하는 중에 멈출 수 있음.

        //제네릭 타입
        // List에서 사용할 데이터 타입을 미리 지정함으로 컴파일 시 타입체크가 일어나도록 함.
        List<String> list = new ArrayList<>(); // 여기서 타입을 지정해 이 타입의 값만 받겠다고 설정하면 컴파일 시 강한 타입체크 발생.
        list.add("hello"); // 넣어줘야 되는 값을 String으로 지정했기 때문에 다른 타입이 들어가면 에러가 남.
        //컴파일 할 때 String이외의 값이 들어오는 것을 막겠다고 체크하는 것 -> 컴파일 시 강한 체크 타입.
        String str = list.get(0); // 0번째 값을 읽어옴.
        System.out.println(str);
    }
}
