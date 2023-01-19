package 에어컨만들기;

import java.util.Calendar;
import java.util.Scanner;

// 기능 설계
// - 전원 On/Off 기능
// - 온도 설정 기능(1도 단위로)
// - 현재 온도 표시 기능
// - 냉방기 on/off 기능
// - 난방기 on/off 기능
// - 바람세기 설정 기능(1단계 / 2단계 / 3단계)
// 설정 조건 및 동작
// - 설정 된 온도에 따라 온도 조절 기능(60초/30초/20초) 주기로 온도 변경
// - 에어컨의 동작은 Scanner로 특정 문자를 입력 받아 동작시킴.
// - 현재 온도 표시를 위해 캘린더 API 이용해서 해당 달의 적절한 온도를 가져오도록 구현
// - 현재 온도와 설정 온도가 같아지면 자동 종료.
public class AirCon {
    private boolean isPower; // 전원 ON/OFF
    private  int setTemp; // 온도 설정 기능
    private int currTemp; // 현재 온도 표시 기능.
    private boolean isCooler; // 에어컨 ON/OFF
    private boolean isHeater; // 히터 ON/OFF
    private int windStep; // 1단, 2단, 3단
    public AirCon(){
        final int[] monthTemp = {-5, 3, 8, 14, 22, 27, 31, 30, 22, 18, 7, 2}; // 값을 저장하거나 빼내지 않고 읽기만 하려고 할 때 final을 선언하는 편이심.
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH); // 현재 달을 가져 옴.
        currTemp = monthTemp[month];
        isPower = false;
        setTemp = 18;
        isCooler = false;
        isHeater = false;
        windStep = 1;
    }

    //에어컨의 온도가 변경 될 때 화면 출력.
    public void airConInfo(){

        String onOffStr = (isPower) ? "ON" : "OFF";
        String heaterStr = (isHeater) ? "ON" : "OFF";
        String coolerStr = (isCooler) ? "ON" : "OFF";
        final String[] windStr = {"", "1단계", "2단계", "3단계"};
        System.out.println("======= 에어컨 정보 =======");
        System.out.println("전원 : " + onOffStr);
        System.out.println("현재 온도 : " + currTemp);
        System.out.println("설정 온도 : " + setTemp);
        System.out.println("히터 : " + heaterStr);
        System.out.println("쿨러 : "+ coolerStr);
        System.out.println("바람 세기 : " + windStr[windStep]);
    }
    //에어컨에 대해 온도와 바람세기 설정, 설정 이후 조건에 따라 리터 또는 쿨러를 켬
    public void setAirConState(){
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 온도는 " + currTemp + "도 입니다.");
        System.out.print("온도를 설정 하세요 : ");
        setTemp = sc.nextInt();
        System.out.println("설정 온도는 " + setTemp +"도 입니다.");
        System.out.print("바람세기를 설정하세요. [1단] / [2단] / [3단] : ");
        windStep = sc.nextInt();
        if(currTemp > setTemp) { // 설정 온도보다 현재 온도가 높은 상태. -> 더운 상태
            System.out.println("Cooler가 동작합니다.");
            isCooler = true;
            isHeater = false;

        } else if(currTemp < setTemp) {//설정온도가 현재온도보다 높은상태. -> 추운 상태
            System.out.println("Heater가 동작합니다.");
            isCooler = false;
            isHeater = true;
        }
        else {
            isHeater = false;
            isCooler = false;
        }

    }
    public void setPower(boolean power){
        isPower = power;
    }

    public int getWindStep(){
        return  windStep;
    }

    public boolean isHeater(){ // 정수값엔 getset을 쓰지만, boolean에는 is~를 앞에 붙이는게 관례다.
        return isHeater;
    }

    public boolean isCooler(){
        return isCooler;
    }

    public void setCurrTemp(int n){
        currTemp += n;
    }
    public int getCurrTemp(){
        return currTemp;
    }

    public int getSetTemp(){
        return setTemp;
    }





    
}
