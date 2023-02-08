package 함수형프로그램예제2번;
//메소드 참조 : 메소드 참조해서 매개변수의 정보 및 반환 타입을 알아내어 불필요한 매개변수 제거.

import java.util.function.IntBinaryOperator;

class Calculator{
    public static int staticMethod(int x, int y){
        return x+y;
    }
    public  int instanceMethod(int x, int y){
        return x+y;
    }
}
public class FunctionEx2 {

    public static void main(String[] args) {
        IntBinaryOperator operator; // 두 개의 int 연산하는 인터페이스
        //정적 메소드 참조
        operator = (x,y) -> Calculator.staticMethod(x, y);
        System.out.println("결과 1 : " + operator.applyAsInt(1, 2)); // 두 개의 int 연산
        //메소드 참조 방식
        operator = Calculator::staticMethod; // 메소드를 참조해 매개변수의 타입확인 후 제거 -> 위랑 아래는 똑같은 거.
        // ::의 의미. 누구 소속인지 알려주는 것. 즉 Calculator 소속의 staticMethod라는 뜻.
        // 메소드 참조해서 알 수 있는 건 다 생략하라는 것. 코드 간결화 이외에는 선생님도 그 이상의 이점을 잘 모르겠다고 하심.
        System.out.println("결과 2 : " + operator.applyAsInt(3,4)); // 두 개의 int 연산
        // 인스턴스 메소드 참조
        Calculator obj = new Calculator();
        operator = (x,y) -> obj.instanceMethod(x, y);
        System.out.println("결과 3 : " + operator.applyAsInt(5, 6)); // 두 개의 int 연산
        //메소드 참조방식
        operator = obj::instanceMethod;
        System.out.println("결과 4 : " + operator.applyAsInt(7, 8)); // 두 개의 int 연산



    }

}
