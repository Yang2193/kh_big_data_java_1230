package 인터페이스활용;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    @Override
    public void order() { 
        // 같은 디폴트 메소드가 다중상속이 된 경우
        // 다중상속이 된 경우 무조건 오버라이딩으로 디폴트 메소드를 하나만 남겨야함.
        System.out.println("고객 주문");
    }

    @Override
    public void sell() {
        System.out.println("판매하기");
    }
}
