package 자동차만들기종합;

import java.util.Scanner;

public class InputInfo {

    int setDistance() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역을 선택하세요. [1] 부산 [2] 대전 [3] 강릉 [4] 광주 : ");
        int region = sc.nextInt();
        switch (region) {
            case 1:
                return 400;
            case 2:
                return 150;
            case 3:
                return 200;
            case 4:
                return 300;
            default:
        }
        return 0;
    }

    int setPeopleNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("이동할 승객 수를 입력하세요.(1~100) : ");
        return sc.nextInt();
    }

    Car selCar(){ // 다양한 정보가 담겨있는 객체를 반환타입으로 선언해서 객체를 반환.
        Scanner sc = new Scanner(System.in);
        Car car = null;
        System.out.print("이동 차량을 선택하세요. [1] 스포츠카 [2] 승용차 [3] 버스 : ");
        int sel = sc.nextInt();
        switch (sel) {
            case 1 : car = new SportsCar("Audi R8"); break;
            case 2 : car = new Sedan("Audi A6"); break;
            case 3 : car = new Bus("버스"); break;
            default :
        }
        return car;
    }

    int setAddOn(){
        Scanner sc = new Scanner(System.in);
        System.out.print("부가 기능의 ON/OFF를 선택하세요. [1] ON / [2] OFF : ");
        return sc.nextInt();
    }
}
