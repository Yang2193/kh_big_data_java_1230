package 문자열반전;

import java.util.Scanner;

// abcdefg => gfedcba
// for문을 이용 -> for문을 반대방향으로 돌리기.

//while 문으로도 가능
public class StringReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch;

        System.out.print("문자열 입력 : ");
        String str = sc.next();
        String result = "";
        String rst = "";

        int index = str.length();

        /*while(true) {

            index--;
            System.out.print(str.charAt(index));

            if(index == 0) break;

        }*/

       for(int i = str.length()-1; i >= 0; i--){


            System.out.print(str.charAt(i));


        }




    }
}
