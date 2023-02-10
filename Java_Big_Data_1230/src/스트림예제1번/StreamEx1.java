package 스트림예제1번;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//스트림이란? 함수형 프로그램을 이용해 다양한 데이터 소스를 표준화 된 방법으로 다루기 위한 것
// - 자료의 대상과 상관없이 동일한 연산 수행
// - 내부 반복자 이용(반복문 배제)
// - 스트림은 한번 생성 된 후 최종연산을 통해 소모되면 재사용 안 됨.
// - 원본 데이터 변경하지 않음
// - 지연 연산 지원, 병렬 처리 지원
// 스트림은 생성 -> 중개 연산 -> 최종 연산 순서로 진행
// 컬렉션에는 스트림이 포함되어 있다. 때문에 컬렉션을 상속받은 List와 Set에는 스트림 메소드가 있다.
public class StreamEx1 {
    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        // 스트림 생성, 중간 연산, 최종 연산
        // ex) 5 이상의 수만 뽑아내기 -> 원래는 반복문과 조건문 사용
        // 인텔리제이에서는 . 찍고 사용 가능한 메소드가 나오는데, 진한 글씨로 나오는 건 본인이 가지고 있는 메소드.
        //연한 것은 상속받은 메소드.
        //list.stream().filter(s -> s.intValue() >= 5).forEach(e -> System.out.println(e)); // 괄호 안의 s는 임의의 알파벳. 향상된 for문에서 e 쓰는 거랑 똑같음.
        // .filter()가 중개연산 .forEach()가 최종연산
        //list.stream().filter(s -> s.intValue() >= 5).forEach(System.out::println);
        // 위는 메소드 참조방식.
        int sum = list.stream().mapToInt(e->e).sum(); //기존 요소를 순회해줘야하기 때문에 중간연산이 있어야 한다.
        // mapToInt(중간연산) : 값을 꺼내서 새로운 정수형 Map을 만든다고 생각하면 된다.
        //sum(최종연산)
        //중개연산의 종류를 알아야 쓸 수 있다.
        //sum().forEach() 못 쓰는 이유는 둘 다 최종연산이기 때문. 스트림은 최종연산이 끝나면 사라져버린다.
        System.out.println(sum);
        int count = (int)list.stream().count(); //count()의 반환타입은 long이므로 변환 필요.
        System.out.println("횟수 : " + count);


    }
}
