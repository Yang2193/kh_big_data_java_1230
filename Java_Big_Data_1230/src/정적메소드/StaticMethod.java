package 정적메소드;

import static 정적메소드.Util.DOMAIN;

public class StaticMethod {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오", 1000);
        Bank shinHan = new Bank("신한", 1000);
        Bank nh = new Bank("농협", 0);
        kakao.setDeposit(2000);
        kakao.setWithdraw(1580);
        kakao.viewAccount();

        System.out.println(Bank.getCount()); // getCount()메소드는 정적 메소드이며, 클래스 소속.

        System.out.println("현재 시간을 출력합니다.");
        System.out.println(Util.getCurrentDAte("yyyy년MM월dd일-hh:mm:ss")); // 객체를 생성하지 않고 바로 사용.
        System.out.println("도메인 주소 : " + DOMAIN); // 고정된 값을 상수로 정해서 프로그램 내부 여러곳에 써야할 떄
        // final static 으로 쓴다.

    }
}
