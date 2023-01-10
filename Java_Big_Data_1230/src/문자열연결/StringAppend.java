package 문자열연결;
//문자열 추가하기
//첫번째 문자열 입력 : Seoul
//두번째 문자열 입력 : Korea
//정수값 입력 : 2
//첫번째 문자열에서 입력 받은 정수 갯수만큼의 문자를 뒤에서부터 잘라, 두번재 문자열 앞에 추가하기.
//ulKorea
//3 입력시 oulKorea
//substring 이용 문자열의 시작위치부터 끝까지 잘라냄
// substring 메소드를 이용해 문자열을 추출하기 전에 인덱스 계산이 필요함.

import java.util.Scanner;

public class StringAppend {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 문자열을 입력 : ");
        String fstStr = sc.next();
        System.out.print("두번째 문자열을 입력 : ");
        String secStr = sc.next();
        System.out.print("정수를 입력 : ");
        int n = sc.nextInt();

        System.out.println(fstStr.substring(fstStr.length() - n) + secStr); // 내가 푼거

        int position = fstStr.length() - n;
        String sub = fstStr.substring((position));

        System.out.println(sub + secStr);



    }
}
