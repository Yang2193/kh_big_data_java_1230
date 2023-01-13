package 상속오버라이딩제약;

public class Vehicle {
    //protected 상속관계와 동일 패키지 내에서 접근 가능.(자바가 약간 다른 부분. 원래는 상속관계에서만 정보를 공유하나, 자바에서는
    // 같은 패키지 내면 접근이 가능하다.)
    protected int speed; // private은 같은 클래스 내부만을 의미. 상속관계에서도 정보 공유 안함. 부모 자식간에도 비밀이 있다는 것...
    protected String color; // protected는 패키지 외부에서는 이 값은 접근 못함. 상속 관계에서는 내부정보를 공유하는 것.
    protected String name;

    //final은 최종 상태를 의미하며, 메소드에서 사용 시 오버라이딩이 불가함을 의미.
    final void accelerator(){ // final이 붙어 더 이상 이 메소드는 변경이 불가능하다.
        System.out.println("차의 속도를 증가시킵니다.");
    }


    final void breakPanel(){
        System.out.println("차의 속도를 감소시킵니다.");
    }

}

class SportsCar extends Vehicle{ // 상속받는 입장에서 private이 걸려있으면 접근못함.
    private boolean isTurbo;
    SportsCar(String name){
        isTurbo = false; // 터보모드가 켜지면 차의 최고 속도를 증가시키는 기능, 상속받은 기능이 아님.
        speed = 280; // Vehicle 클래스로부터 상속받은 것.
        this.name = name; // 생성자로부터 이름을 입력받아 인스턴스 필드의 초기값으로 사용.
        color = "Red";
    }



    int getSpeed(){ // getter, 게터라고 부른다.
        if(isTurbo) return speed *= 1.2 ;
        return speed;
    }
    boolean getTurbo(){ // 게터는 일반적으로 리턴 타입이 있음.
        return isTurbo;

    }
    void setTurbo(boolean turbo){ // setter는 외부에서 내부의 필드값을 변경하기 위해 사용하는 것. 값을 세팅.
        isTurbo = turbo;

    }

    void infoCar(){
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + getSpeed());
        System.out.println("색상 : " + color);
        System.out.println("터보모드 : " + isTurbo);

    }
}

class ElectricCar extends Vehicle{
    boolean isAutoDrv;
    ElectricCar(String name){
        isAutoDrv = false;
        speed = 200;
        this.name = name;
        color = "White";
    }

    void setAutoDrv(boolean autoDrv){
        isAutoDrv = autoDrv;
    }

    void infoCar(){
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("자율주행 : " + isAutoDrv);

    }


        }