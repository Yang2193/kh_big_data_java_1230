package 배열기타문법;

import java.util.Arrays;

public class BasicArrayEtc {
    public static void main(String[] args) {
        // String[] args에 외부에서 값을 가져와 넣어보기.
        if(args.length != 2){
            System.out.println("외부에서 전달한 값이 없어 강제 종료함");
            System.exit(0); // 프로그램을 강제로 종료하는 명령어.
        }

        String val1 = args[0];
        String val2 = args[1];
        int num1 = Integer.parseInt(val1); // 입력받은 문자열을 정수로 변환.
        int num2 = Integer.parseInt(val2);
        System.out.println("외부에서 전달하는 값 : " + (num1 + num2));

       /* String[] city = {"서울", "부산", "대구", "인천", "수원"};
        for(String e : city) System.out.print(e + " ");
        System.out.println();
        System.out.println(city[3]);
*/
 /*   //예외사항이 발생하는 경우    int[] score = new int[5]; // 국어, 영어, 수학, 과학, 미술 01234
        for(int i = 0; i <= score.length; i++){ // score.length가 5인데 5까지 값을 찍어 6번 입력하게 됨.
            score[i] = 100 ;
        }

        System.out.println(Arrays.toString(score));*/

    }
}
