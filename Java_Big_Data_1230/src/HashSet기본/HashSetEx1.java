package HashSet기본;

import java.util.Arrays;
import java.util.HashSet;

//HashSet : 순서를 보장하지 않으며 중복 값을 허용하지 않습니다.
//중복 여부 확인은 hashCode()의 리턴값을 이용(경우에 따라 오버라이딩해서 이용)
public class HashSetEx1 {
    public static void main(String[] args) {
        HashSet<Member> set = new HashSet<>();
        set.add(new Member(1001, "유나"));
        set.add(new Member(1002, "정국"));
        set.add(new Member(1003, "안유진"));
        Member mem4 = new Member(1004, "카리나");
        set.add(mem4);
        set.add(new Member(1003, "카즈하"));
        //객체의 주소가 다르기 때문에 중복이라고 보질 않음. 이 경우에 오버라이딩을 이용해서 중복을 체크해서 제거.
        //hashCode(), equals()를 내부 인스턴스 필드값을 기준으로 오버라이딩해서 중복 체크.

        for(Member e : set){
            e.showMember();
            System.out.println(e.hashCode());
            System.out.println("------------");

        }

    }
}

class Member{
    int id;
    String name;
 @Override// 어노테이션을 붙여 오버라이딩을 해서 문제가 발생할 가능성을 낮춤
 public int hashCode(){
     return id; //hashCode를 오버라이딩해서 키로 바꿔줌.
 }
 @Override
 public boolean equals(Object obj){
     //String의 equals는 이미 오버라이딩 되어있는 것.
     if(obj instanceof Member){
         Member member = (Member) obj; // 다운캐스팅 부모를 다시 자식으로 변환
         if(this.id == member.id) return true;
         else return false;
     }
     return false;
 }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showMember(){
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name);
    }
}
