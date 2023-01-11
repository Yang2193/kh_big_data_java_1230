package 생성자기본연습;
//생성자란? 클래스가 객체로 만들어질 때 자동으로 호출되며, 생성자는 인스턴스 필드를 초기화하는 것이 주 목적이다.
//생성자 만드는 규칙.
//1. 생성자는 클래스 이름과 같아야 한다.
//2. 반환타입은 없고 접근제한자는 올 수 있으나 private은 특별한 경우가 아니면 사용 안함.
//3. 하나의 클래스는 여러 개의 생성자를 가질 수 있으나, 단 오버로딩 생성 규칙에 맞아야 함.
public class ConstructorEx {
    public static void main(String[] args) {

        Car ev6 = new Car(); // 아무것도 없는 생성자 호출.
        Car kona = new Car("코나");
        Car sorento = new Car("쏘렌토", "2023");
        Car g90 = new Car("제네시스 G90", "2022", "Black");

        ev6.getCar();
        kona.getCar();
        sorento.getCar();
        g90.getCar();

    }
}

class Car{
    String name;
    String year;
    String color;
    Car(){} // 아무것도 없는 생성자. 매개변수가 똑같으면 중복이기 때문에 에러가 난다. 변수이름은 다르더라도 중복처리.
    // 매개변수의 타입이 같은지 다른지 보는 것.
    Car(String name){
        this.name = name;
    }
    Car(String name, String year){
        this.name = name;
        this.year = year;
    }
    Car(String name, String year, String color){
        this.name = name;
        this.year = year;
        this.color = color;

    }

    void getCar(){ //생성자가 아닌 메소드의 경우 반환타입이 있어야한다.

        System.out.println("이름 : "  + name);
        System.out.println("연식 : " + year);
        System.out.println("색상 : " + color);
        System.out.println("----------------");

    }


}