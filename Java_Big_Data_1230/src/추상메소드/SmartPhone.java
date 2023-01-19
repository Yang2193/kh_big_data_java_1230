package 추상메소드;

public class SmartPhone extends Phone{
   //자식이라는 객체가 만들어질 때 호출되는게 생성자.
    // 매개변수가 없는 생성자였다면 자동호출인데, phone에 매개변수있는 생성자를 만들었기 때문에 호출해줘야한다.
    SmartPhone(String name) {
        super(name);
    }
    @Override
    void call() {
        System.out.println("부모의 요청으로 통화 기능을 구현합니다.");
    }
    @Override
    public void internet(){
        System.out.println("인터넷 기능을 만듭니다.");
    }
}
