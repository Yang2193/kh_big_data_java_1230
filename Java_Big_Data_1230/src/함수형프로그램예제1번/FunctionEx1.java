package 함수형프로그램예제1번;
// 함수형 프로그램 : 자바 8에서 도입 된 기능, 수학 공식과 유사, 불변성의 원칙, 조건문, 반복문 사용 금지 등의 특징을 가짐
// 람다(Lambda) : 화살표( -> ) 표현식으로 사용. 생략 가능한 모든 것을 생략하는 것을 기본 원칙으로 한다.
// 함수형 인터페이스 : 자바는 함수가 독립적으로 존재 할 수 없으므로 함수형 인터페이스가 반드시 필요.
//
@FunctionalInterface // 함수형 프로그램을 사용하기 위해 만들었다고 어노테이션 삽입.
    // 함수형 인터페이스에서는 메소드가 하나만 들어옴.
interface  Calculator {
    int sum(int a, int b);
    // int sub(int a, int b); // 하나 더 넣으면 에러가 남. 어노테이션을 안 넣어도 되는데 없으면 에러가 생긴지 모름.
}

@FunctionalInterface
interface MyFuncInterface{
    void method(int x);
}

/*class MyCalculator implements Calculator{

    @Override
    public int sum(int a, int b){
        return a+b;
    }
}*/
@FunctionalInterface
interface  MyFuncInterface2{
    int min(int x, int y); // 반환 타입이 있는 형태
}

public class FunctionEx1 {
    public static void main(String[] args) {



//        Calculator mc = (a, b) -> a+b; // 익명의 함수로 선언만 되어 있는 상태 () 안이 매개변수, -> 다음이 구현부.
//        int rst = mc.sum(3, 4);
//        System.out.println(rst);

      /*  MyCalculator mc = new MyCalculator();
        int rst = mc.sum(3,4);
        System.out.println(rst); // 기존 방식.*/

        MyFuncInterface fi = x -> {
            int result = x * 5;
            System.out.println(result);
        }; // 매개변수 하나일 경우 괄호 생략 가능. 일반적으로 생략함. 한줄 짜리 코드였으면 중괄호 생략 가능.
        fi.method(2); // 선언만 되어있으므로 이렇게 메소드를 호출해야한다.

        MyFuncInterface2 fi2 = (x, y) -> x < y ?  x: y; // 구현부
        // 리액트는 코드를 간단하게 하게 위해 람다식을 쓰고 삼항연산자를 많이 쓴다.
        System.out.println(fi2.min(4,3));
    }

}
