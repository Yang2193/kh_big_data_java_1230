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

    public void sell(int i){ // 반환타입이 다른 경우 메소드 이름이 같으면 안 되는 듯... 오버로딩은 되는듯
        //내일 질문할 것 반환타입이 다르면 메소드 이름이 같아서 안 되고, 추상화가 되어있기 때문에
        //구현할 때 오버라이딩 돼서 중복이어도 상관없고, 매개변수가 다르면 오버로딩이 가능해서 괜찮고. 이해한게 맞는지..

    }


}
