package 스트림예제5번;
// 중개 연산 : 생성된 스트림은 중개 연산을 통해 또 다른 스트림으로 변환 되고, 중개 연산은 연속해서 연결해 사용 가능.
// filter() : 조건에 맞는 요소만으로 구성된 새로운 스트림 반환
// distinct() : 스트림에서 중복된 요소를 제거하고 새로운 스트림 생성
// 7개의 정수를 입력받아 홀수 짝수 나누어 담기.
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx5 {
    public static void main(String[] args) {

//        IntStream stream1 = IntStream.of(7,5,5,2,1,3,5,4,6);
//        IntStream stream2 = IntStream.of(7,5,5,2,1,3,5,4,6);
//        스트림에서 홀수 값만 골라내기
//        stream1.filter(n -> n % 2 != 0).forEach(e->System.out.print(e + " "));
//        System.out.println();
//
//        stream2.distinct().forEach(e -> System.out.print(e + " "));
        //스트림 변환(map()): 해당 스트림의 요소들에 주어진 함수의 인수로 전달하며, 그 반환 값으로 이루어진 새로운 스트림 생성
        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        stream.map(e -> e.length()).forEach(System.out::println);

        String[] arr = {"I study hard", "You study JAVA", "I am stil hungry"};
        Stream<String> stream3 = Arrays.stream(arr);
        stream3.flatMap(s -> Stream.of(s.split(" "))).forEach(System.out::println);
        // " " 공백기준으로 새로운 스트림을 만들고 forEach();로 출력
        //flatMap()은 Array나 Object로 입력한 원소를 가장 작은 단위의 단일 스트림으로 반환.

        //스트림 제한
        //limit() : 해당 스트림의 첫번째 요소부터 전달 된 개수만큼의 요소로만 이뤄진 새로운 스트림 반환.
        //skip() : 해당 스트림의 첫번째 요소부터 전달 된 개수만큼의 요소를 제외하고 출력

        IntStream stream4 = IntStream.range(0, 10); // 0부터 10미만까지 범위 지정
        IntStream stream5 = IntStream.range(0, 10);
        IntStream stream6 = IntStream.range(0, 10);
        IntStream stream9 = IntStream.range(0, 10);


        stream4.limit(5).forEach(n -> System.out.print(n + " ")); // 처음부터 5개
        System.out.println();
        stream5.skip(5).forEach(n -> System.out.print(n + " "));
        System.out.println();
        stream6.skip(3).limit(5).forEach(n -> System.out.print(n + " "));
        // 맨 앞의 0 1 2 3 4 5 6 7 8 9 중에서 skip(3)으로 0 1 2 제거 후 다음 요소인 3부터 순서대로 5개 출력.
        System.out.println();
        stream9.limit(5).skip(3).forEach(n -> System.out.print(n + " "));
        // 맨 앞의 0 1 2 3 4 5 6 7 8 9 중에서 limit(5)로 0 1 2 3 4를 남기고 skip(3)으로 0 1 2 제거해 3 4만 출력됨.
        System.out.println();


        //스트림 정렬
        Stream<String> stream7 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");

        Stream<String> stream8 = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");


        stream7.sorted().forEach(n -> System.out.print(n + " "));
        System.out.println();
        stream8.sorted(Comparator.reverseOrder()).forEach(s ->System.out.print(s + " "));



    }
}
