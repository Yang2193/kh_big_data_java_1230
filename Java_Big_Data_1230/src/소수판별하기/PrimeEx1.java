package 소수판별하기;

import java.util.Scanner;

// 소수란 : 1과 자기 자신 이외에는 나누어 지지 않는 수.
// 소수 판별하기 :
public class PrimeEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        boolean rst = isPrime(num);
        System.out.println("소수 여부 : " + rst);

    }

    // static 키워드로 선언되면 객체 생성시 생성이 안 되고 클래스 생성시 단 한 번 만들어진다.
    // 해당 메소드 수행 후 반환 값이 true/false 이다.
    // 정수값을 입력받아 해당 정수가 소수인지 아닌지 판별 후 결과를 반환함.
    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false; // 전달 받은 수를 1과 자신을 제외하고 나누어 지는 경우를 의미

        }
        if( n == 1) return false;
        return true;
    }

}
