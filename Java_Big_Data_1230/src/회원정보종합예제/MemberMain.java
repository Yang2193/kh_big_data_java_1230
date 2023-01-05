package 회원정보종합예제;

public class MemberMain {
    public static void main(String[] args) {
        MemberInfo memberInfo = new MemberInfo();// MemberInfo클래스를 객체로 만듦 -> 인스턴스화
        //MemberInfo는 클래스가 memberInfo는 객체 , 객체로 만드는 작업을 인스턴스화 한다고 함.
        //위의 식에서 new MemberInfo(); 를 해주는 게 인스턴스화.
        memberInfo.setName(); // 이름을 저장하는 메소드 호출.
        memberInfo.setAge(); // 나이를 저장하는 메소드 호출
        memberInfo.setGender(); // 성별을 저장하는 메소드 호출
        memberInfo.setJobs(); // 직업을 저장하는 메소드 호출
        memberInfo.viewInfo();
                

    }
}
