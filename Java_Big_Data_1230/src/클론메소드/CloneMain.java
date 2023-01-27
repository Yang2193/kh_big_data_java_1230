package 클론메소드;

public class CloneMain {
    public static void main(String[] args) {

        Member mem1 = new Member("1234567", "곰돌이사육사", "sphb8250", 30, true);
       // Member mem2 = mem1; // 참조가 같아짐. 값이 복사가 되긴 했지만 같은 메모리 공간을 바라보고 있음.
        Member mem2 = mem1.getMember();

        mem2.age = 300;  // 참조가 같기 때문에 mem2의 이름을 바꿔도 mem1의 이름이 같이 바뀜.
        mem2.name = "Tiger"; // 내가 참조하고 있는 주소만 복사되는 것이 얕은 복사인데, 이것이 그것에 해당한다.
        //실제값이 복사될 수 있게 메모리 하나를 더 만들어 주는 것이 객체에서는 clone이다.

        System.out.println("name : " + mem1.name);
        System.out.println("age : " + mem1.age);
        System.out.println("name : " + mem2.name);
        System.out.println("age : " + mem2.age);
    }
}
