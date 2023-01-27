package 클론메소드;
//Cloneable -> 실제 구현해야할 메소드는 없지만 인터페이스 등록 후 사용, 단지 clone() 메소드 사용 가능하도록 권?한을 부여하는 의미.
//
public class Member implements Cloneable { // 복제기능을 사용할 수 있게 implements Cloneable 등록
    String id;
    String name;
    String pwd;
    int age;
    boolean isAdult;

    public Member(String id, String name, String pwd, int age, boolean isAdult) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.age = age;
        this.isAdult = isAdult;
    }

    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone(); // getMember 호출되면 clone();에 의해 똑같은 객체가 생성되고 이 주소값을 return 함.
        } catch (CloneNotSupportedException e) {
        } // try catch를 써야할 때 안 써야할 때?
        return cloned;
    }
}
