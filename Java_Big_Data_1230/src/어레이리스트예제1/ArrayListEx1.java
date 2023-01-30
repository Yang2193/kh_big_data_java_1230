package 어레이리스트예제1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//List 인터페이스란? 배열과 비슷한 구조를 가지면서 하위에 ArrayList, LinkedList, Vector클래스로 구성되어 있음.
//요소의 저장 순서가 유지, 중복 저장 허용, 동적 할당(크기 지정을 안해도 됨.) 다양한 메소드 제공
//ArrayList : 물리적으로 연속된 공간에 저장, 검색을 인덱스로 하기 때문에 빠름, 삽입/삭제는 느림(단, 맨 뒤에 삽입/삭제는 빠름)
//Vector : ArrayList와 동일한 특성을 가짐, 멀티스레드 환경을 위해 동기화 기능을 지원하기 떄문에 안정적이나 ArrayList보다 느림.
//LinkedList : 물리적으로 연속된 공간이 아님, 참조로 다음 저장 위치를 가리킴, 삽입/삭제가 매우 빠름. 검색은 느림.
public class ArrayListEx1 {
    public static void main(String[] args) {
        //List<String> pitches = new ArrayList<>(); // List라는 부모의 인터페이스를 가지고 자식 객체인 ArrayList를 가리킴.
        // ArrayList<String> ... 으로 쓰는 것보다 List로 사용하면 Vector나 LinkedList로 바꾸기 용이하다.
//        pitches.add("138"); // ArrayList 마지막 인덱스에 값 추가(이때 사이즈가 계속 증가함)
//        pitches.add("129");
//        pitches.add("138");
//        pitches.add(1,"155"); // 해당 인덱스에 값 추가. (성능에 영향을 미침)
        //값을 집어넣는 다른 방법
        String[] data = {"138", "145", "122", "155"}; // 이미 만들어진 배열
        List<String> pitches = new ArrayList<>(Arrays.asList(data)); // asList()는 이미 만들어진 배열을 List에 추가
        //정렬
       // pitches.sort(Comparator.naturalOrder()); // 오름차순 정렬
        pitches.sort(Comparator.reverseOrder()); // 내림차순 정렬


        System.out.println(pitches);
//        System.out.println(pitches.get(3));//전달된 인덱스의 값을 반환함.
//        // System.out.println(pitches.get(35)); //없는 인덱스를 출력하면 바로 IndexOutOfBoundsException 예외 발생.
//        // 바로 프로그램이 죽어버림.
//        System.out.println(pitches.size()); // ArrayList의 개수 반환
//        System.out.println(pitches.contains("142")); // false 출력 됨. 해당 값이 포함되어있는지 여부 확인하는 메소드
//        System.out.println(pitches.remove(0)); // 0번 인덱스 제거. 리스트에서 해당 항목을 제거 후 삭제된 요소 반환.
        // 뭐가 지워졌는지 알려주는 것.
     //   System.out.println(pitches.remove("129")); // 리스트에서 해당 항목을 삭제하고 삭제 됐는지 여부를 true / false로 반환
    }
}
