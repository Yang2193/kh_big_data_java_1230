package 나머지연산자활용문제;

import java.util.Scanner;

//100의 자리 정수를 입력 받아서 3개의 변수(100자리/10자리/1자리)에 대입하기 256을 입력하면 2와 5와 6을 쪼개보는 것.
// 365
// a = 3
// b = 6
// c = 5
public class ModEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요. : ");
        int num = sc.nextInt();
        int a, b, c;
        a = num / 100; //100의 자리는 몫을 취하면 된다.
        b = (num % 100) / 10 ; // 100의 자리의 나머지를 구하고 몫을 구한다.
        c = num % 10;

        System.out.println("100의 자리는 "+a +" 10의 자리는 "+ b +" 1의 자리는 " + c +"입니다.");



    }
}
