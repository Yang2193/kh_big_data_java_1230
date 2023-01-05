package 중첩반복문;

import java.util.Scanner;

public class DoubleFor {
    public static void main(String[] args) {

        for(int i = 2; i<10; i++){
            System.out.printf("==== [%d]단 ==== \n", i);
            for(int j = 1; j < 10; j ++){
                System.out.printf("%d x %d = %d \n", i, j, (i*j));
            } //구구단

        }

        /*//반복문 안에 반복문이 있는 것.
        Scanner sc = new Scanner(System.in);
        System.out.print("별의 갯수를 입력하세요. : ");
        int number = sc.nextInt();
        for(int i = 0; i < number; i++){
            System.out.printf("|%d|", i);
            for(int j = 0; j < number; j++){ // j가 먼저 10번 돈다.
                System.out.print("* "); // 가로로 10개 딱 찍고 -> 
            }
            System.out.println(); // 10개 찍은 후 줄바꿈 하고 다시 위로 올라가 i 한바퀴 돌림, number보다 작아질 때까지.
        } //j가 10번 돌고 나서 i 1번, 다시 j 10번 돌고 i 1번
        */
    }
}
