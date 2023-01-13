package 상속기본;

public class Animal {
    String name;
    void setName(String name){
        this.name = name;
    }
}

// 상속을 받기 위해서는 extends
// Animal 클래스로부터 상속을 받아 Dog Class를 만듦.
// Dog 클래스에서 아무런 기능을 구현하지 않아도 자동으로 부모의 필드와 메소드가 포함되어있음.
class Dog extends Animal{

    void sleep(){
        System.out.println(name +  "잠을 잡니다.");
    }

}

class HouseDog extends Dog{
    @Override // 오버라이딩 되면 관례적으로 @Override를 붙인다 // 어노테이션(주석)을 달아주는 것.
    // 부모가 가진 메소드를 물려받아서 재정의를 하면 오버라이드.
    void sleep() {
        System.out.println(name + "집에서 잠을 잡니다.");
    }

    //오버로딩 관계가 성립.
    void sleep(int time){
        System.out.println(name + "이 " + time + "동안 집에서 잠을 잡니다.");
    }
}