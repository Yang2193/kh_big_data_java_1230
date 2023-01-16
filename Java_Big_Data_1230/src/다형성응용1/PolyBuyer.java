package 다형성응용1;
// 매개변수의 다형성 예제
public class PolyBuyer {
    public static void main(String[] args) {
        Buyer buyer = new Buyer(); // 구매를 하는 객체
        TV tv = new TV();
        Audio audio = new Audio();
        Computer computer = new Computer();
        buyer.buy(tv); // 제품이 추가될 때 내부코드를 건들 필요가 없다. 이런 형태가 느슨한 결합.
        buyer.buy(audio);
        buyer.buy(computer);
        buyer.viewInfo();
    }

}
