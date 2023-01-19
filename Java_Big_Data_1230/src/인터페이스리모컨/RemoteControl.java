package 인터페이스리모컨;
//인터페이스란?
//모든 필드는 자동으로 상수(final static)으로 변환됨.
//모든 메소드는 자동으로 추상메소드가 됨.
//디폴트 메소드 : 예외적으로 구현부를 가질 수 있으며, 상속받은 클래스에서 재정의 가능.
//정적 메소드를 포함할 수 있습니다.(정적메소드는 객체와 상관없고 인터페이스 타입으로 사용 됨.)
public interface RemoteControl {
    int MAX_VOLUME = 100; // 인터페이스는 인스턴스 필드가 없다. 인스턴스 필드가 아니라, 인터페이스에 포함된 어떤
    //기준값이라고 인식해야한다.
    //상수로 정의하지 않았지만 정적인 상수이다.(인터페이스 생성 시 만들어지고 객체는 안 됨.
    int MIN_VOLUME = 0; // 자동으로 final static이 붙는다.
    void turnOn(); // 자동으로 public abstract가 앞에 붙음.(왜냐하면 인터페이스는 기본적으로 모든 메소드가 추상메소드이다.
    void turnOff(); //
    void setVolume(int volume);
    static void changeBattery(){
        System.out.println("건전지를 교환합니다.");
    } // remoteControl이 만들어질 때 한번만 만들어지기 때문에 상속관계랑 무관하다.
    //인터페이스 이름으로 접근해야되고 상속과는 무관.
    void getInfo();
    default void setMute(boolean mute){
        //자바버전 1.8 이후에 추가되었으며 예외적으로 메소드의 구현부를 가질 수 있다.
        if(mute) System.out.println("무음 처리를 합니다.");
        else System.out.println("무음 해제 합니다.");
    } // 디폴트로 만들어서 만들고 싶은 놈만 만들게 함.
    // 인터페이스에 새로운 기능 넣을 때마다 상속받은 모든 클래스가 기능을 수정해야 돼서 이런 기능을 만듦.
    // 예외적인 경우.
}
