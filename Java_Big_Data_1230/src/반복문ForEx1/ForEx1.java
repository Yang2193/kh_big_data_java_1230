package 반복문ForEx1;

import java.util.Scanner;

// for 반복문 : for(초기식; 조건식; 증감식){ 반복 수행 구간 }
public class ForEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요. : ");
        int number = sc.nextInt();
        int result = recursiveFunc(number);
        System.out.println(result); // 재귀호출
    }

    public static int recursiveFunc(int n){
        if(n == 1) return 1; // n이 1이 되면 리턴.
        return n + recursiveFunc(n -1 ); // 내부의 자신을 계속 불러서 더해주는 식.
        //재귀호출 메소드 생성 후 위에서 사용./
    }
}



//int sum = 0; // sum값을 초기화하지 않으면 에러가 난다.
       /* for(int i = 1; i <= number; i++){
            sum += i; // 범위가 정해져있다면 for문이 더 간결하다.
        } */// 바로 아래에 있는 while문과 같은 결과, 대신 1에서부터 누적되는 스타일
    /*    while(number > 0){
            sum += number; // sum = sum + number; sum 값을 계속 누적. 10에서부터 내려가면서 누적되는 스타일.
            number--;
        }*/
        //System.out.println("정수의 합은 : " + sum); // 값을 누적하는 것.



        /*for(int i = 1; i <= 100; i++ ){
            System.out.printf("%4d", i);
            if(i % 10 == 0) System.out.println();
        }*/
       /* int i = 1;
            for(; ;){
            System.out.printf("%4d", i);
            if(i % 10 == 0) System.out.println();
            if (i == 100) break;
            i++; //while문에 true를 넣은것과 같아짐. 이렇게 될 수 있다는 것만 알고 위의 기본for문으로 사용하는 것이 좋다.
        }*/
      /*  while(true){
            System.out.printf("%4d", i);

            if(i % 10 == 0) {
                System.out.println();
            }

            if(i == 100) break;
            i++;
        }*/
       /* while(i<=100) {
            System.out.printf("%4d", i);

            if(i % 10 == 0)                 System.out.println();
                i++;

        }*/


