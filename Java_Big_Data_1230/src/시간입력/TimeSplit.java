package 시간입력;

import java.util.Scanner;

// 입력 : 23:5:3 (24시간제로 시간을 콜론(:) 기준으로 입력
// 출력 : 오후 11시 05분 03초
public class TimeSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간 입력 : ");
        String time = sc.next();

        String[] splitTime = time.split(":");
        int[] timeArr = new int[splitTime.length];

        for(int i = 0; i < splitTime.length; i++) {

            timeArr[i] = Integer.parseInt(splitTime[i]);

        }

        if(timeArr[0] > 11) {

            timeArr[0] -= 12;

            System.out.printf("오후 %02d시 %02d분 %02d초", timeArr[0], timeArr[1], timeArr[2]);
        }
        else System.out.printf("오전 %02d시 %02d분 %02d초", timeArr[0], timeArr[1], timeArr[2]);

    }
}
