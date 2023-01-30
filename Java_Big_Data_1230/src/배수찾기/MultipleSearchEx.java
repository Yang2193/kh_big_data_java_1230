package 배수찾기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 문제 : 정수 n과 수의 목록이 주어졌을 때 , 목록에 들어있는 수가 n의 배수인지 아닌지 구하는 프로그램 작성
// 입력 : 첫째줄에 n이 주어짐, 다음 줄에 한 줄의 한 개씩 목록에 들어있는 수가 주어짐. (수의 범위는 0 ~ 10000)
// 출력 : 목록에 있는 수가 n의 배수인지 아닌지를 구한 후 아래처럼 출력
// 입력 예시
// 3 -> 정수 n
// 1
// 7
// 99
// 321
// 777
// 0 -> 반복문에 대한 종료 커맨드 0.
// 출력
// 1 은 3의 배수가 아님.
// 7 은 3의 배수가 아님.
// 99는 3의 배수임.
// 321은 3의 배수임.
// 777은 3의 배수임.
public class MultipleSearchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt(); // 주어진 수
        int val;
        while(true){ // 항상 참인 경우이므로 무한으로 반복하는 반복문, 이 경우는 반드시 탈출 조건이 필요.
            val = sc.nextInt(); // 키보드로부터 값을 입력받음
            if(val == 0) break; // 반복문의 탈출조건
            list.add(new Integer(val)); // 그냥 편의상 선언한 변수인 val 만 넣어도 되지만 객체로 넣는 것이 원래 방법.
        }

        for(Integer e : list){
            if(e % n == 0) System.out.println(e + " is a multiple of " + n);
            else System.out.println(e + " is not a multiple of " + n);
        }

    }
}
