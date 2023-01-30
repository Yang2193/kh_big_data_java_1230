package 벡터예제;

import java.util.List;
import java.util.Vector;

// Vector는 ArrayList 내부적으로 동일한 구조입니다. 메소드의 사용 방법도 완전히 동일합니다. 멀티 스레드에 안전 합니다.
public class VectorEx1 {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>(); // List 를 Vector로 바꾸면 Vector만 쓸 수 있는 메소드가 있기 때문에
        //나중에 다른 타입으로 바꿀 때 호환성에 문제가 생길 수 있다.
        //삽입이 빈번하다면 LinkedList를 사용.
        list.add(new NameCard("박준하", "010-1234-5678","@naver.com", "개발자","서울시 강남구 역삼동"));
        list.add(new NameCard("로부테 길리먼", "0800594949", "robouteG@gmail.com", "Imperial Regent", "Ultramar Macragge"));

        for(NameCard e : list) {
            System.out.println("이름 : " + e.name);
            System.out.println("전화번호 : " + e.phone);
            System.out.println("메일 : " + e.mail);
            System.out.println("직업 : " + e.position);
            System.out.println("====================");
        }
    }
}

class NameCard { // 내부값만 이용하는 용도로 이용해 게터 세터없이 사용.

    String name;
    String phone;
    String mail;
    String position;
    String address;

    public NameCard(String name, String phone, String mail, String position, String address) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.position = position;
        this.address = address;
    }
}