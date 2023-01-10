package KMP문제;

// 첫번째 방법 : split
// 두번째 방법 : 대문자만 골라내는 방법
// 세번째 방법 : 0번째 문자 출력, '-' 다음 문자 출력
// 네번째 방법 : 문자 배열로 변경 후 대문자 골라내기 toCharArray

import java.util.Scanner;

public class StringKMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String name = sc.next();
// SPLIT 방법
        String[] splitName = name.split("-"); // split
        for(int i = 0; i < splitName.length; i++) {
            System.out.print(splitName[i].charAt(0));
        }

        System.out.println();

        for(String e : splitName) System.out.print(e.charAt(0));



        System.out.println();
        
// 문자배열로 변경
       char[] ch =  name.toCharArray(); // 문자 배열로 변경

        for(int i = 0; i < ch.length; i++){
            if(ch[i] >= 'A' && ch[i] <='Z') System.out.print(ch[i]);
        }

        System.out.println();

        for(char e : ch) {
            if(e >= 'A' && e <= 'Z') System.out.print(e);
        }
        System.out.println();

        
// 대문자만 골라내는 방법
        for(int i = 0; i < name.length(); i++){ //대문자만 골라내기
            if(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z'){
                System.out.print(name.charAt(i));
            }
        }

        System.out.println();
// 0번째 문자 출력 후 '-' 다음 문자 출력

       for(int i = 0; i < name.length(); i++){
           if(i == 0) System.out.print(name.charAt(i));
           else{
               if(name.charAt(i) == '-') System.out.print(name.charAt(i+1));
           }
       }


    }
}
