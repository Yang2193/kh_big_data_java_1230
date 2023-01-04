package 스위치문기본;

import java.util.Scanner;

//스위치문은 조건문이며, 스위치에는 조건식은 올 수 없고, 조건에 대한 변수만 올 수 있다.
//변수는 정수, 문자, 문자열만 사용 가능.
//스위치의 각 케이스를 끝내기 위해서는 반드시 break 문이 필요.
//해당하는 케이스가 없는 경우를 위해 default문이 필요
public class SwitchSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계절을 입력 하세요 : ");
        String season = sc.next(); // 공백 기준으로 문자열을 입력받음.

        switch(season) {
            case "spring" :  // 세미콜론이 아닌 것에 주의
            case "SPRING" : //
             System.out.println("꽃이 피는 봄이 왔습니다.");
             break;
            case "summer" :
            case "SUMMER" :
                System.out.println("무더운 여름이 왔습니다.");
                break;
            case "FALL" :
            case "fall" :
            case "autumn" :
            case "AUTUMN" :
                System.out.println("낙엽이 지는 가을이 왔습니다.");
                break;
            case "winter" :
            case "WINTER" :
                System.out.println("눈이 내리는 겨울이 왔습니다.");
                break;
            default :
                System.out.println("계절을 잘못 입력하셨습니다.");

        }

    }
}
