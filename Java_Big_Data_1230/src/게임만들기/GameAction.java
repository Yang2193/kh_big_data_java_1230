package 게임만들기;

public interface GameAction {
    double pAttack(); // 구현부가 없고 선언만 있음, 상속받은 클래스가 구현
    double mAttack(); // 마법 공격력
    int ultimate(); // 궁극기로 입히는 피해량
    boolean setDamage(double damage); // 피해받는량
    //반환타입이 boolean인 이유는 캐릭터가 아직 살아있는 지 판별하기 위해
    // 남아 있는 hp보다 damage가 더 크면 true를 반환(사망처리)
}// 실제 기능 구현 없고, 상속 받은 클래스 반드시 해당 메소드를 완성해줘야 함
// 자바는 다중 상속이 불가능 하지만 인터페이스를 이용하여 다중 상속처럼 사용 가능 하도록 해줌
