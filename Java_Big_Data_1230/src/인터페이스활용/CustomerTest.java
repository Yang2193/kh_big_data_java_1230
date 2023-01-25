package 인터페이스활용;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer = new Customer();
        Buy buyer = customer;
        buyer.buy();
        buyer.order(); // 재정의 된 메소드가 호출 됨.

        Sell seller = customer;
        seller.sell();
        seller.order(); // 이 경우에도 똑같이 재정의 된 메소드가 호출.














       /* Customer customer = new Customer();
        Buy buyer = customer; // Customer Type의 customer 참조변수를 Buy 인터페이스형 buyer 참조변수에 대입.(형변환)
        //상속관계가 존재하기 때문에 형변환이 가능.
        buyer.buy(); // buyer는 Buy 인터페이스의 메소드만 호출 가능.

*//*        Buy buyer = new Customer();
        buyer.buy(); // 위의 세 줄과 지금 두 줄은 같은 것.*//*

        Sell sell = customer; // 자동 형변환
        sell.sell();

        Customer customer1 = (Customer) sell; // 다시 역으로 형변환.(다운캐스팅) 형변환이 가능하긴 하지만 명시적으로 바꿔줘야함.
        // 자동으로 형변환 안 됨.
        customer1.buy();
        customer1.sell();*/

    }
}
