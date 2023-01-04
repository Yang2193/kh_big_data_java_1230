package 윤년구하기;

import java.util.Scanner;

// 4로 나누어지면 윤년 : 4로 나눈 나머지가 0
// 100으로 나누어 떨어지는 연도는 윤년이 아니다.
// 400으로 나누어 떨어지면 윤년이다.
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력 하세요 : ");
        int year = sc.nextInt();
        if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0 )){ //나머지 연산자는 생각보다 많이 쓰이고 어렵다.
            System.out.println((year + "년은 윤년입니다."));
            // 조건이 참인 구간
        } else{
            System.out.println((year + "년은 윤년이 아닙니다."));
            // 조건이 거짓인 구간
        }

    }
}
