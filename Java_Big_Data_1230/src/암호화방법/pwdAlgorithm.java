package 암호화방법;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pwdAlgorithm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("평문 : "); // 평문은 공백있음
        String str = sc.nextLine();
        System.out.print("암호화 키 : ");
        String encrypt = sc.next();

        char[] enc = encrypt.toCharArray();
        char value = 0; // 암호문을 만들기 위한 문자 변수
        List<Character> vig = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ') vig.add(' ');
            else {
                value = (char)(str.charAt(i) - (enc[i % encrypt.length()] - 'a')-1);
                if(value < 'a') value += 26;
                vig.add(value);
            }
        }


        for(Character e : vig) System.out.print(e);
        }



}
