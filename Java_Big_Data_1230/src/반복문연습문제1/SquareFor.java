package 반복문연습문제1;

import java.util.Scanner;

//양의 정수n을 입력 받아서 n * n 크기의 행렬을 출력하는 프로그램 작성.
//값은 1부터 시작.
//정수값 : 3
// 1 2 3
// 4 5 6
// 7 8 9
public class SquareFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요. : ");
        int number = sc.nextInt();
        for(int i = 1; i <= number * number; i++){
            System.out.printf("%4d" ,i);
            if(i % number == 0) System.out.println(); // for문과 if조건식, 나머지 연산자를 사용.
       }



    }



}
