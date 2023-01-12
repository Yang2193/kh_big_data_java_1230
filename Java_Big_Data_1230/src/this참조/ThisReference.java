package this참조;
// this : this 참조 변수는 자기자신의 객체 주소를 참조.
// this() : this 메소드는 생성자에서만 사용이 가능하다.
// 같은 클래스 내에서 여러 개의 생성자가 만들어지는 경우, 중복된 코드가 많이 생기는데 이를 보완하기 위해 사용.
public class ThisReference {
    public static void main(String[] args) {

    }
}

class Car{
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    public Car(String modelName, int modelYear, String color, int maxSpeed){
        this.modelName = modelName; // this는 자기자신의 객체에 있는 modelName을 참조하라는 뜻
        this.modelYear = modelYear; // 외부 인스턴스와 내부 인스턴스의 변수명이 같을 때 사용.
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public Car(String modelName, int modelYear, String color){
        this.modelName = modelName; // this는 자기자신의 객체에 있는 modelName을 참조하라는 뜻
        this.modelYear = modelYear; // 외부 인스턴스와 내부 인스턴스의 변수명이 같을 때 사용.
        this.color = color;

    }

    public Car(){
        this("싼타페", 2022, "Red", 220);
    }
    public Car(String modelName){
        this(modelName, 2012, "Red", 230);
    }
}
