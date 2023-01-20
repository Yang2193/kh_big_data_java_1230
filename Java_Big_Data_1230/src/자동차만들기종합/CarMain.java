package 자동차만들기종합;

public class CarMain {
    public static void main(String[] args) {
        InputInfo ii = new InputInfo();
        int distance = ii.setDistance();
        int peopleNum = ii.setPeopleNum();
        Car car = ii.selCar();
        car.setMode(ii.setAddOn());
        car.result(peopleNum, distance);

        //강사님 풀이
        // final int[] = {0, 400, 150, 200, 300};
        // Car car = null; // 부모의 클래스의 참조변수로 선택된 차량의 객체를 연결하기 위한 참조변수.
        // Scanner sc= new Scanner(System.in);
        // System.out.print("이동지역 선택");
        // int city = sc.nextInt();
        // "승객 수"
        // int passCnt = sc.nextInt();
        // 차량선택
        // int sel = sc.nextInt();
        // 부가기능
        // int option = sc.nextInt();
        // boolean isMode = (option == 1) ? true : false;
        // switch(sel){
        // case 1 : car = new SportsCar("Ferrari"); break;
        // case 2 : car = new Sedan("GV80"); break;
        // case 3 : car = new Bus("관광버스"); break;
        // default : System.out.println("차량 선택이 잘못되었습니다.");
        // }
        // car.setMode(isMode);
        // int moveCnt = car.getMoveCnt(passCnt);
        //
        // System.out.println("====== " + car.getName() +" ======"}
        // System.out.println("총 비용 : " + car.getTotalCost(dist[city], moveCnt) +"원");
        // System.out.println("총 주유횟수 : " + car.getRefuelCnt(dist[city], moveCnt) +"회");
        // System.out.printf("총 소요시간 : %.2f\n", car.getMoveTime(dist[city], moveCnt);
    }
}
