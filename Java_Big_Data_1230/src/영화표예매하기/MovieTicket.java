package 영화표예매하기;

import java.util.Scanner;

// 현재 좌석 상태를 보여주는 메소드가 필요
// 좌석을 예매하는 메소드가 필요
// 판매된 좌석의 개수를 구해 총 판매 금액을 구하는 메소드가 필요
public class MovieTicket {
//극장의 좌석 상태를 표시하는 배열 만들기(총 10개)
    int[] seat = new int[10];
    int seatNum = 0;
    Scanner sc = new Scanner(System.in);

    // 현재 좌석 상태를 보여주는 메소드 작성
    // 0이면 [ ] 1이면 [V] 로 보여주게 구현
    void printSeat(){  // 좌석상태를 보여주는 메소드


//        for(int i = 0; i < seat.length; i++){
//
//            if(seat[i] == 1) { // 강사님은 if(seat[i] == 0) 으로 나랑 반대로 하심
//                System.out.print("[V]");
//            } else System.out.print("[ ]");
//
//        }

        for(int val : seat){
            if(val == 0) System.out.print("[ ]");
            else System.out.print("[V]");
        }

        System.out.println();
        System.out.println("현재 예약된 좌석은 위와 같습니다.");
        System.out.println("======================");
        System.out.println();

    }
    

    void selectSeat(){
        
        printSeat();
        System.out.print("예약할 좌석번호를 입력하세요 : ");
        //위에서 만들어진 printSeat() 메소드를 호출해 현재 좌석상태를 보여줌
        seatNum = sc.nextInt();

        if(seat[seatNum-1] == 1) { // 강사님과 순서를 반대로 함. 강사님은 if(seat[seatNum-1] == 0)
            // 다음에 seatNum[] = 1을 해서 좌석을 판매.

            System.out.println();
            System.out.println("이미 예약된 좌석입니다. 다른 좌석을 예약해주세요.");
            System.out.println("==========================");
        }

        //좌석번호를 입력받아서 예약하는데 이미 예약된 좌석은 에러문구 출력
        else {
            seat[seatNum - 1] = 1; // 좌석판매
            System.out.println(seatNum + "번 좌석 예약되었습니다.");
            printSeat(); // 좌석판매 후 갱신된 정보를 화면에 보여줌.

        }
        //좌석예약이 성공하면 다시 printSeat()를 호출해 좌석 상태를 보여줌

        
         }

    int totalAmount(){

        int cnt = 0; // 예약된 좌석의 수를 누적하는 변수생성.
//        for(int i = 0; i < seat.length; i++){
//
//            if(seat[i] == 1) cnt++;
//
//        }
        for(int val : seat){
            if(val == 1) cnt++;
        }


        // 좌석 예약 정보를 가지고 있는 배열을 순회해 예약된 좌석 개수를 누적
        // 좌석 개수와 좌석당 가격을 곱해서 결과값 반환

        return cnt * 12000;

    }


}
