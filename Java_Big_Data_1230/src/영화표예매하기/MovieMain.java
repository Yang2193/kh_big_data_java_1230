package 영화표예매하기;

import java.util.Scanner;

// 영화표 예매하기 클래스를 만들고 객체 생성
// 극장의 좌석은 10개(10개의 좌석 예약 상태를 기록하기 위한 배열 필요)
// 좌석당 가격은 12000원
// 메뉴는 예약하기와 종료로 구성
// 예약하기에서는 현재 좌석의 예약상태를 보여주고 예약을 받음
// 종료 판매된 좌석의 개수를 확인해서 판매금액을 구함.
public class MovieMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MovieTicket movieTicket = new MovieTicket();


        while(true){ // 예약은 종료하기를 누르기 전까지는 계속 진행해야 함.

            System.out.println("[1]예매하기");
            System.out.println("[2]종료하기");
          //  System.out.print("예약하기[1] / 종료하기[2] : ");
            int selMenu = sc.nextInt();
            if(selMenu == 1){

                movieTicket.selectSeat(); // 좌석 예약하기에 대한 메소드 호출

            }

            else {
                System.out.println("총 매출은 " + movieTicket.totalAmount() + "원 입니다."); // 종료하기 선택시 금액 계산 후 출력
                break; // 반복문 탈출
            }


        }

     //   System.out.println("총 매출은 " + movieTicket.totalAmount() + "원 입니다.");
        


    }
}
