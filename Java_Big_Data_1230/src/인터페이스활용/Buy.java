package 인터페이스활용;
// 디폴트 메소드가 중복되는 경우. : 예외적으로 인터페이스 메소드에 구현부가 있음.
public interface Buy {
    void buy();
    // void sell(); 인터페이스 메소드는 중복되도 어차피 추상화되어있어서 상관없는 듯.

    void sell(int num);
    default void order(){
        System.out.print("구매 주문");
    }
}
