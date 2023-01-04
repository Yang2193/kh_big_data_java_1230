package 입출력예제2;

import java.io.IOException;
import java.util.Scanner; // 두번째로 많이 사용되는 자바 API

// 콘솔 입력에 대해서
// System.in.read() : 키보드의 입력을 ASCII 코드값으로 읽어 들임.

public class ScannerEx {
    public static void main(String[] args) {
        /*while(true){ // 반복문 반복문의 경우 반복을 빠져나갈 탈출문을 만들어야 한다.
            try {
                int ketCode = System.in.read(); // read에 예외사항이 발생할 수 있어 밑에 빨간줄이 그어졌다. 예외처리를 해달라는 것.
                System.out.println("KeyCode : "+ ketCode);
                if(ketCode == 'q') break;
            } catch (IOException e) {
                e.printStackTrace();
            } // 프로그래밍은 스택구조, 먼저 입력된 것이 가장 나중에 출력되고, 나중에 입력된 것이 가장 먼저 입력된다.
        }*/

        // Scanner 입력 : 키보드의 입력 원하는 데이터 타입으로 반환 받음
        Scanner sc = new Scanner(System.in); // 스캐너라는 클래스를 가지고 와서 sc라는 변수이름으로 사용하는데 스캐너를 만들 객체를 가리킨다.
        byte a = sc.nextByte(); // 키보드의 입력을 Byte형으로 반환
        short b = sc.nextShort(); // 키보드의 입력을 short형으로 반환
        int c = sc.nextInt(); // 키보드의 입력을 정수로 반환
        char ch = sc.next().charAt(0); // sc.next() 문자열을 입력하는 키워드, charAT(0)은 입력 받은 것 중에서 0번째에 있는 것을 뽑아라.
        // 문자열에서 첫번째 문자를 추출.
        String s1 = sc.next(); // 문자열을 공백 단위로 입력 받음. ->
        String s2 = sc.nextLine(); // 문자열을 줄바꿈 기준으로 입력 받음.
    }
}
