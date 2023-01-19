package 에어컨만들기;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException {
        AirCon lgAirCon = new AirCon();
        Scanner sc = new Scanner(System.in); // 에어컨을 켜기 위한 스캐너 입력.
        int elapsedTime = 0; // 경과시간을 계산하기 위한 변수
        boolean isSetTemp = false; // 온도가 변경되어야할 조건 확인. -> 온도가 변경될 시점에 true로 바뀔 것.
        System.out.print("에어컨을 작동하겠습니까?(yes/no)");
        String isOn = sc.next(); // 에어컨을 켜기 위한 문자열을 입력받음
        if(isOn.equalsIgnoreCase("yes")){
            lgAirCon.setPower(true);
            lgAirCon.setAirConState(); // 온도와 바람세기 설정, 설정에 따라 쿨러나 히터값 변경
            while(true){

                sleep(1000); // 내가 돌고 있는 스레드를 잠깐 잠재우는 것. ms 단위.1000분의 1초 단위.
                //sleep이 걸린 순간에 외부에서 interrupt를 걸어서 프로그램을 죽일 수 있다.
                // 그 순간을 InterruptedException이라고 한다.
                // throws interruptedException은 이거 걸리면 그냥 바깥으로 던져서 에러처리 하겠다는 얘기.
                elapsedTime++;
                switch(lgAirCon.getWindStep()){
                    case 1 :
                        if(elapsedTime >= 60 ) isSetTemp = true; break;
                    case 2 :
                        if(elapsedTime >= 30 ) isSetTemp = true; break;
                    case 3 :
                        if(elapsedTime >= 20) isSetTemp = true; break;
                    default :
                }

                if(isSetTemp) {
                    if(lgAirCon.isHeater()) lgAirCon.setCurrTemp(1);
                    if(lgAirCon.isCooler()) lgAirCon.setCurrTemp(-1);
                    lgAirCon.airConInfo();
                    isSetTemp = false;
                    elapsedTime = 0;
                }


                if(lgAirCon.getCurrTemp() == lgAirCon.getSetTemp()) {
                    System.out.println("에어컨을 종료합니다."); break;
                }

            }

        }
    }
}
