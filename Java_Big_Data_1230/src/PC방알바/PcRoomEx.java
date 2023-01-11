package PC방알바;

import java.util.Scanner;

// 피시방에 피시가 100대 있음 ( 배열의 인덱스는 0~99)
// 손님들은 모두 자기가 앉고 싶어하는 자리가 있음.
// 만약 자기가 앉고 싶어하는 자리에 다른 손님이 있으면 거절을 해야하고, 아니면 자리를 사용할 수 있게 허가.
// 손님의 수 입력 : 3
// 손님이 앉고 싶어 하는 자리 번호 : 1 3 5 입력 => 0 -> 거절이 1번도 일어나지 않았기 때문
// 손님의 수 입력 : 5
// 손님이 앉고 싶어 하는 자리 번호 : 1 1 3 3 5 => 2(거절횟수)

// 거절횟수 출력 :
public class PcRoomEx {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        //피씨방 좌석에 대한 100개의 배열이 필요

        int[] pcRoom = new int[100];
        int rejectCnt = 0;
        int seatNum; // 손님이 원하는 좌석번호를 입력받기 위한 변수

        //배열의 초기값은 0이다. 즉, 0이면 비어있는 자리.


        System.out.print("손님 수 입력 : ");
        int n = sc.nextInt(); // 손님의 수를 입력받음

        System.out.print("원하는 자리 입력 : ");
        for(int i = 0; i < n; i++) {

            seatNum = sc.nextInt(); // 좌석번호 입력받음
            if(pcRoom[seatNum-1] == 1) rejectCnt++;  // 해당 배열의 값이 1이라는 것은 이미 예약된 자리이다.
            else pcRoom[seatNum-1] = 1;  // 비어있는 자리를 사용함.
        }

        System.out.println(rejectCnt);





        }




}
