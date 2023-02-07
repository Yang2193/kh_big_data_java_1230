package 소수단어;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단어 입력 : ");
        String word = sc.next();
        boolean isPrime = true; // 소수인 상태를 기본값을 설정
        //플래그는 코드 하나 정도만 쓰자.
        int sum = 0; // 각 영어문자를 더해서 총 합계를 만드는 변수
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) >= 'a') sum += word.charAt(i) -'a'+ 1;
            else sum += word.charAt(i) -'A'+27;
        }

        System.out.println(sum);

        for(int i = 2; i < sum; i++){
            if(sum % i == 0) { isPrime = false; break;}
            else isPrime = true;
        }
       if(sum == 1) System.out.println("It is not a prime number.");
       else {
            if (isPrime) System.out.println("It is a prime word.");
            else System.out.println("It is not a prime word.");
        }
    }
}
