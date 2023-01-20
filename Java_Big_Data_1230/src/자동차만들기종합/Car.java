package 자동차만들기종합;

public abstract class Car {
    int speed; // 속도
    int fEfficiency; // 연비
    int fuelTank; // 연료탱크
    int seats; // 좌석

    String name; // 이름
    double time; // 시간




    abstract void setMode(int i);

  /*  int getMoveCnt(int peopleNum){
  if(peopleNum % seats == 0)  return (peopleNum/seats);
        return peopleNum/seats + 1;}

       String getName(){
       return name;
       }



  int getTotalCost(int distance, int moveTimes){ 딱 거리에 알맞게 나오는 값
        return (distance /fEfficiency * 2000) *moveTimes;
    }

    int getRefuelCnt(int distance, int moveTimes){
        if((distance*moveTimes) % (tank*fEfficiency) == 0){ // 가는 거리와 갈 수 있는 거리가 딱 일치할 때
            return   (distance*moveTimes) / (tank*fEfficiency);}
        else return  ((distance*moveTimes) / (tank*fEfficiency) +1);
    }*/


    void result(int peopleNum, int distance){ //지금 메소드를 하나에 묶어놨는데, 이러면 이 케이스 아니면 못 쓴다.
        //아까처럼 한번에 하나만 만드는 것이 낫다.
        int refuelCnt; // 주유횟수
        int moveTimes; // 이동횟수

        //이동횟수 구함.
        if(peopleNum % seats == 0) moveTimes = (peopleNum/seats);
        else moveTimes = peopleNum/seats + 1;
        //거리로 시간과 주유횟수 구함.
        time = (double)distance / speed;

        if((distance*moveTimes) % (fuelTank*fEfficiency) == 0){ // 가는 거리와 갈 수 있는 거리가 딱 일치할 때
            refuelCnt =  (distance*moveTimes) / (fuelTank*fEfficiency);}
        else refuelCnt = ((distance*moveTimes) / (fuelTank*fEfficiency) +1);

        System.out.println("차 종류 : " + name);
        System.out.println("이동에 필요한 총 비용은 " + (distance /fEfficiency * 2000) *moveTimes + "원 입니다.");
        //내가 계산한건 연료를 무조건 풀로 채운다는 가정.
        System.out.println("주유 횟수는 " + refuelCnt + "입니다.");
        System.out.printf("총 시간은 %.2f 입니다.", time * moveTimes);

    }
}
