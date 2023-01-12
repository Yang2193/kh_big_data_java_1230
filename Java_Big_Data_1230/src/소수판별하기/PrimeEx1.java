package 소수판별하기;

import java.util.Scanner;

// 소수란 : 1과 자기 자신 이외에는 나누어 지지 않는 수.
// 소수 판별하기 :
// 소수의 합 구하기 : 정수값을 입력받아 입력받은 정수값 미만의 소수의 합을 구하는 문제
// 정수 입력 : 12
// 결과 : 2 + 3 + 5 + 7 + 11 = 28
// 문제를 푸는 방법 : 메소드를 호출 시 정수 값을 입력해서 해당 정수가 소수이면 그 값을 반환
public class PrimeEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        int sum = 0; // 입력받은 정수 미만의 소수의 합을 누적
        //반복문 수행 : 입력받은 정수미만의 값을 호출(12 => 2 ~ 11)


        for(int i = 2; i < num; i++){
            sum += primeSum(i);

        }

        System.out.println("소수의 합 : " + sum);
     
  

    }

    static int primeSum(int n) {
        boolean isPrime = true; // 기본값을 소수로 정함
        for (int i = 2; i < n; i++) {
            if (n % i == 0) isPrime = false;
        }
        if(isPrime) return n;
        else return 0;
     
    }


    // static 키워드로 선언되면 객체 생성시 생성이 안 되고 클래스 생성시 단 한 번 만들어진다.
    // 해당 메소드 수행 후 반환 값이 true/false 이다.
    // 정수값을 입력받아 해당 정수가 소수인지 아닌지 판별 후 결과를 반환함.
/*
    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false; // 전달 받은 수를 1과 자신을 제외하고 나누어 지는 경우를 의미

        }
        if( n == 1) return false;
        return true;
    }
*/

}
