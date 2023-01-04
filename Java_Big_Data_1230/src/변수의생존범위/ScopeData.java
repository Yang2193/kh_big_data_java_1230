package 변수의생존범위;

import java.util.Scanner; // java 패키지에 있는 것을 쓰겠다는 것.

public class ScopeData {
 /*   public static void main(String[] args) {
        int value = 20; // 지역 변수
        int m = 10;

       if(value > 10){
           m = m + (value - 10);

       } // m이라는 변수는 중괄호 안에서 끝났기 때문에 바깥에서는 적용이 안됨.
        System.out.println(m);*/
    //상수란? 변수와 마찬가지로 데이터를 저장할 수 있는 메모리 공간을 의미
    //변수와 다른 점은 프로그램이 실행되는 동안 값이 변동이 안 됨
    //자바에서 상수는 final 키워드로 정의하고 단, 한번만 값을 설정할 수 있다.->자바만의 특징. 시점은 선언한 이후에는 자유.
    public static void main(String[] args) {
        /*final int AGE; //final(이 값이 최종이라는 것을 의미, 더 이상 변경이 일어나면 안 된다는 뜻. = 상수.
        // 불변의 값이라는 것을 강조하기 위해 대문자로 작성하기도.
        AGE = 30; // 자바의 경우 선언하고나서 원하는 시점에 한번 값을 넣어줄 수 있다.
        System.out.println("당신의 나이는 " + AGE + "입니다."); //변수기 때문에 처음엔 20으로 초기화 했더라도 바뀔 수 있다.*/
        final double taxRate = 0.10; // taxRate를 고정시키겠다는 의미로 final 사용
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 수입을 입력하세요 : ");
        int income = sc.nextInt();
       // taxRate = 0.09; final을 넣었기 때문에 에러발생.
        System.out.println("당신이 내야할 세금은 " + income * taxRate);
    }
}

