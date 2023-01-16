package 다형성응용2;

public class Vehicle {
    public void run(){
        System.out.println("자동차가 달립니다.");
    }
}

class SportsCar extends Vehicle{
    @Override // 접근제한자, 반환타입 모든게 동일해야 오버라이딩이 된다.
    public void run(){ // 오버라이딩 된 상속된 자식의 메소드를 부모 클래스가 참조 가능.
        System.out.println("스포츠카가 달립니다.");
    }
}

class Bus extends Vehicle{
    @Override
    public void run(){
        System.out.println("버스가 달립니다.");
    }
}

class Truck extends Vehicle{
    @Override
    public void run() {
        System.out.println("트럭이 달립니다.");
    }
}