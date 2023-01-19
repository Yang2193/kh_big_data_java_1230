package 추상메소드;
//추상클래스 만들기
//인스턴스 필드가 포함, 생성자 포함, 인스턴스 메소드 포함.

public abstract class Phone {
    String name;
    boolean isPower;
    Phone(String name){ // 매개변수가 있는 생성자를 만듦.
        this.name = name;

    }
    void setPower(boolean power){ // 내부구현부가 있는 추상클래스.
        isPower = power;
        if(isPower) {
            System.out.println("Phone Power On");
        } else System.out.println("Phone Power Off");
    }

    abstract  void call(); // 상속을 받는 클래스에서 반드시 오버라이딩해서 구현해야함.
    abstract  void internet();
}
