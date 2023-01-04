package 상근이알람;

import java.util.Scanner;

// 상근이라는 친구는 매일 학교를 지각합니다.
// 창영이라는 친구가 상근이에게 지각하지 않는 방법을 알려줌.
// 시간을 설정하면 자동으로 45분 일찍 알람이 울리도록 시간이 설정되도록 함.
// 24시간제
//
public class AlarmSet {
    public static void main(String[] args) {
        //시간을 입력받기 위해 스캐너 객체 생성.
        //생성된 객체로 시간과 분을 입력 받음. (24시간 제)
        //변수를 만들어서 입력 받은 시간과 분을 모두 분으로 환산
        //고려사항 : 환산한 시간이 45분보다 적으면 별도의 계산이 필요.
        //창영이가 알려준 방법대로 시간을 45분 이전으로 돌림. ( 45를 빼줌)
        //계산결과를 시간과 분으로 출력하기 위해 다시 변환 후 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력해주세요. : ");
        int hour;
        hour = sc.nextInt();

        if( hour >= 24 ) {
            System.out.println("잘못 입력하셨습니다.");
            return;
        }
        System.out.print("분을 입력해주세요. :");
        int minute;
        minute = sc.nextInt();

        if( minute >= 60 ) {
            System.out.println("잘못 입력하셨습니다.");
            return;
        }
        int sum = (hour * 60) + minute;

  /*      if(sum > 1440){
            System.out.println("잘못 입력하셨습니다.");
            return;
        }*/

        if(sum < 45){
            sum = sum + 1440; // 1440 도 맞지만 24*60으로 가독성이 높게 하는 것도 좋다.
        }

        sum -= 45;
        System.out.println("알람이 " + sum/60 + "시 " + sum%60 +"분으로 설정되었습니다.");

    }
}
