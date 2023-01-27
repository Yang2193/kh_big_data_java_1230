package 제네릭연습;
// 제네릭 타입 : 타입 변수를 사용해 다형성 구?현
public class GenericTestEx2 {
    public static void main(String[] args) {
        Person<String> p1 = new Person<>("곰돌이사육사");
        System.out.println(p1.info);
        Person<Integer> p2 = new Person<>(21);
        System.out.println(p2.info);

    }
}
// 'T' 타입 변수라고 하며, 임의의 참조형 타입을 의미. 'T' 변수명을 의미하며 아무 문자로 이름을 지어도 상관없음.(일반적으로 대문자 T 사용)
class Person<T> {
    public T info; // 아직 정해지지 않은 T 타입 변수 info 선언. 들어오는 타입에 따라 문법이 변경 됨.
    Person(T info){
        this.info = info;
    }

}
