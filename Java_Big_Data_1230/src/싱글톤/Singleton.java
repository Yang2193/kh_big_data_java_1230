package 싱글톤;

public class Singleton {
    String name;
    int id;
    private static Singleton singleton = new Singleton(); // singleton이라는 스태틱 참조변수
    private Singleton() { // 생성자에 private을 붙이는 경우는 singleton에 붙일 때만 쓴다.
        // 외부에서 생성자를 못 만들게 private으로 만드는 것.
        // -> 생성자를 통해서 객체가 생성되지 않도록 접근제한을 설정
        name = "test";
        id = 100;

    }
//getSingleton() 메소드를 호출 시 반환값으로 이미 만들어져있는 싱글톤 객체의 참조변수를 반환한다.
    static Singleton getSingleton(){ // 클래스 메소드인데 반환타입이 singleton이다.
        return singleton; // 주소를 가지고 있는 참조변수를 반환. 외부에서 싱글턴 객체를 만들 순 없지만
        // 싱글턴 참조변수의 주소를 호출해서 다른 곳에서 사용.
        // getSingleton만 하면 어디서든 호출할 수 있다.
    }
}
