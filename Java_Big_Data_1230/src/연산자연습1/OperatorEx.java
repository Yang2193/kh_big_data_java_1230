package 연산자연습1;

import java.io.IOException;
import java.util.Scanner;

// 이항연산자와 삼항연산자
// 산술연산자 : +, -, *, /, %(나머지)
// 대입연산자 : 값을 변수에 대입할 때 사용. 대입은 항상 뒤에서 앞으로 일어남.
// 복합대입연산자 : 연산 후 대입.
// 증감연산자 : 값을 1 증가하거나 감소 시크는 연산자(단항 연산자), ++, -- 증감연산자는 변수 앞에 오느냐 뒤에 오느냐에 따라 값이 다름.
// 우위와 전위에 따라 상황이 달라짐.
// 비교 연산자 : 값의 크기를 비교하는 연산자 -> 보통 조건문과 많이 연계되어서 쓰인다.
// 논리 연산자 : 참과 거짓을 판단하는 연산자 ( and(&&), or(||) not(!) 현업에서 !를 많이 쓴다.
// 삼항 연산자 : 항이 3개인 연산자, 실제로는 참과 거짓이 있는 조건문과 같음)
// 문자열 결합 연산자 : 문자열을 이어주는 연산자.ㄴ
public class OperatorEx {
    public static void main(String[] args) {

        System.out.println("Java" + (11.03 + 12));

      /*  Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력 하세요 : ");
        int age = sc.nextInt();
        boolean isAdult = (age > 19) ? true : false; // 조건문을 한 줄로 만든 것.

        System.out.println(isAdult);*/

       /* int x = 10, y = 20;
        boolean rst1, rst2, rst3;
        rst1 = (x > y ) && (x > 5); // false. and는 둘 다 참이어야 참. 둘 중 하나라도 거짓이면 false로 출력된다.
        // 컴파일러가 왼쪽 것을 거짓으로 판정했으면 오른쪽꺼는 아예 무시한다.
        rst2 = (x > y ) || (x > 5); // true. or는 둘 중 하나만 참이어도 true. 둘 다 거짓이어야 false로 출력
        // 컴파일러가 왼쪽 것을 참으로 판정했으면 오른쪽꺼는 무시하고 참으로 판정한다.
        rst3 = !((x > y ) || (x > 5)); // false. 내부가 참인 상태에서 부정을 해서 거짓이 된다.

        System.out.println(rst1);
        System.out.println(rst2);
        System.out.println(rst3);*/


/*
        int x = 10, y = 20;
        System.out.println(x > y); // false
        System.out.println(x < y); // true
        System.out.println(x == y); // == 같다라는 의미, = 대입의 의미. false
        System.out.println(x >= y); // x가 y보다 크거나 같냐? false
        System.out.println(x <= y); // true
*/




 /*       int num1 = 10, num2 = 10;
        System.out.println(num1++); // 변수를 먼저 출력한 후 연산.
        System.out.println(++num1); // 변수에 연산을 먼저 한 후 출력.
        System.out.println(num2--);
        System.out.println(--num2);*/




 /*       System.out.println(num1 += 2); // num1 = num1 + 2; 랑 같음. 더 간편하게 쓰기 위해서 복합대입연산자를 사용.
        System.out.println(num1 -= 2); // num1 = num1 - 2;
        System.out.println(num1 *= 2); // num1 = num1 * 2; 복합대입연산자를 쓸 때 보통 +랑 -위주로 사용. 곱셈부터는 풀어서 쓰는 경향이 있음.
        System.out.println(num1 /= 2); // num1 = num1 / 2;
        System.out.println(num1 %= 2); // num1 = num1 % 2;*/





//        int num1 = 10, num2 = 0; // 기본적인 대입 연산 = equal.
//        System.out.println("+ 연산자 : " + (num1 + num2));
//        System.out.println("- 연산자 : " + (num1 - num2));
//        System.out.println("* 연산자 : " + (num1 * num2));
//        System.out.println("/ 연산자 : " + ((double)num1 / num2));
//        // 따로 몫을 구하는 방법은 없지만, 정수형으로 처리되어 소수점은 버림. 즉 몫이 나옴, 정확한 값을 구하려면 실수형으로 바꿔줘야..
//        System.out.println("% 연산자 : " + (num1 % num2));

//        try {
//            System.out.println(num1 / num2); // 값을 0으로 나누면 수학에서는 무한대 값, 자바에서는 에러가 출력된다.
//        } catch(ArithmeticException e){
//            System.out.println("값을 0으로 나누면 안 됩니다.");
//        } // 프로그램 에러 방지를 위해 예외처리.

// 예외처리구문 //
    }
}
