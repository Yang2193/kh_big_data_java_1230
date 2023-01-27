package 단어공부;

import java.util.Arrays;
import java.util.Scanner;

//알파벳 대소문자로 이뤄진 단어가 주어지면 가장 많이 동작한 알파벳을 찾는 문제
//입력은 대소문자를 입력하고 결과는 대소문자를 구분하지 않음.
//만약 가장 많이 등장하는 알파벳이 여러개인 경우 ?로 출력
// 결과 예시 AaaBcdd -> A
// 결과 예시 ddcfgrG -> ?
public class WordStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] strArr = str.split("");
        String[] alp = {"","A", "B", "C", "D","E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P"
        ,"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int[] cnt = new int[27];

        for(int i = 0 ; i < strArr.length; i++){
            for(int j = 1; j < alp.length; j++){
                if(strArr[i].equalsIgnoreCase(alp[j])) cnt[j]++;
            }
        }
        System.out.println(Arrays.toString(cnt));

        int mode = 1;
        int max = cnt[1];

        for(int i = 1; i < cnt.length; i++){
            if(max<cnt[i]){
                max = cnt[i];
                mode = i;
            }
        }
        System.out.println(max +","+ mode);

        for(int i = 0; i < cnt.length; i++){
            if(max == cnt[i] && mode != i) {
                max = 0;
                mode = 0;
            }
        }

        if(mode == 0)   System.out.println("?");
        else System.out.println(alp[mode]);



    }
}
