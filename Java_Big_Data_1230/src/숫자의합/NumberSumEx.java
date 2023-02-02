package 숫자의합;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//문제 : N개의 숫자가 공백없이 쓰여있음. 이 숫자를 모두 합해서 출력하는 문제
//입력 : 54321
//출력 : 15
//입력 : 70000000
//출력 : 7
public class NumberSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("입력 : ");
            String num = sc.next();
            if(num.equals("0000")) {
                System.out.println("프로그램 종료");
                break;
            }
            String[] arr = num.split("");

            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                sum += (Integer.parseInt(arr[i]));
                //sum += num.charAt(i) - '0';
            }

            System.out.println(sum);


        }



    }
}
