package 클래스기능;
//  클래스이름 참조변수 = new 클래스이름();
public class BasicClass {
    public static void main(String[] args) {
        Car gv80 = new Car("GV80", "Grey", "2023.01",230 ); // 클래스를 가지고 객체 생성
        Car santafe = new Car("Santafe", "White", "2023.01", 210); //
        // 위의 gv80과 산타페는 객체지만 main 안에서는 지역변수가 된다.
        Car kona = new Car("Kona", "Grey", "2023.01",190);

        gv80.setName("GV80 Sports"); // 정해진 메소드를 통해서 필드에 접근.
       // gv80.name = "GV80 No Option"; // 이렇게 써도 되지만 이걸 못하게 막는게 접근제한.
        gv80.viewCar();
        santafe.viewCar();
        kona.viewCar();
    }
}

// 하나의 클래스 안에는 public 클래스가 하나만 있어야한다.
//접근제한자가 default인 클래스 생성 (동일한 패키지 내에서 접근 가능)
class Car{
    static String manufacture = "현대 자동차"; // 클래스 변수(넓은 의미에서 필드)
    //static은 정적변수, 이 클래스가 객체로 만들어질 때 static 뒤의 변수는 하나만 만들어진다.->고정된 값-> 클래스에 붙어다니는 친구.
    //아래에 있는 변수들은 생성자를 호출할 때 만들어진다.
    private String name; // 인스턴스 필드 / 클래스가 객체로 만들어 질 때 객체의 갯수만큼 생성 됨.
    String color; // 인스턴스 변수 (필드)
    String productYear; // 인스턴스 변수(필드)
    int maxSpeed; //
    //생성자 : 클래스 이름과 동일하고 반환 타입이 없음. void 조차 없다.
    //생성자는 주로 개체 생성 시 객체 내부의 필드를 초기화 하는 목적으로 사용
    //필드값은 생성자의 매개변수로 전달 된다.(객체를 생성하는 곳에서 전달)
    Car(String name, String color, String year, int speed){ // 입력을 이쪽을 통해서 받음
        // 여기서 만들어지는건 매개변수로 외부로 전달하는 목적을 갖고 만들어지는 것.
        this.name = name; // 자기 참조 this라는 것을 갖고 있지만, 지금 같은 경우는 누가 외부의 name이고 내부의 name인지 모르기에
        //this를 붙여준다. // 전달받은 매개 변수와 객체 내부의 필드 이름이 같은 경우는 숨겨진 this를 표시해야함.
        this.color = color;
        productYear = year;
        maxSpeed = speed;

    }


    Car(){} // 동일한 이름의 메소드를 같은 클래스 안에 만들 수 있음.
    // Setter 메소드 : 인스턴스의 값을 설정하는 메소드
    void setName(String name){
        this.name = name;
    }

    void setColor(String color){
        String test = "test"; // 지역변수
        this.color = color + test;
    }

    void viewCar(){

        System.out.println("제조사 : " + manufacture);
        System.out.println("이름 : " + name);
        System.out.println("색상 : " + color);
        System.out.println("출고 연도 : " + productYear);
        System.out.println("최고 속도 : " + maxSpeed);
        System.out.println("--------------------");


    }

}
