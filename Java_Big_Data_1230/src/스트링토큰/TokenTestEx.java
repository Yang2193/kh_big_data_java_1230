package 스트링토큰;

import java.util.Scanner;
import java.util.StringTokenizer;

//StringTokenizer : 문자열이 특정 구분자로 연결되어 있는 경우, 구분자 기준으로 문자열을 관리할 수 있음.
//countTokens() : 남아 있는 토큰의 수
//hasMoreTokens() : 남아 있는 토큰이 있는지 여부 확인(있으면 true)
//nextToken() : 토큰을 하나씩 꺼내 옴
//String split() : 구분자 기준으로 문자열을 만듦.
public class TokenTestEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 / 기준으로 입력 : ");
        String name = sc.nextLine(); // 문자열을 개행문자를 만날 때까지 입력받음
        String[] nameStr = name.split("/");

//        StringTokenizer st = new StringTokenizer(name, "/"); // 객체 생성. 배열과 구분자를 객체 생성시 넣어줌.
//        String[] nameStr = new String[st.countTokens()]; // 토큰갯수만큼 문자열 배열을 잡음
//        int idx = 0;
//        while(st.hasMoreTokens()){
//            nameStr[idx++] = st.nextToken();  // 배열에 담음.
//        }
//
       for(String e : nameStr)System.out.print(e + " ");

    }
}
