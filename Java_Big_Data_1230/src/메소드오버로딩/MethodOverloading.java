package 메소드오버로딩;
// 메소드 오버로딩? 동일한 이름의 메소드를 매개변수의 타입이나 갯수, 순서에 따라 다르게 호출하는 것.
// 반환타입은 보지 않는다, 당연하게도 메소드 이름은 동일해야 함.
public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(100, 200));
        System.out.println(sum(100, 200, 300));
        System.out.println(sum(100, 200, 300, 400));
        System.out.println(sum("100", "200", "300"));

        System.out.println(sum(100, "200", 400));
        System.out.println(sum("테라", "아나톨리아", "비잔티움"));




    }

    static int sum (int x, int y){
        return x + y;
    }
    static int sum (int x, int y, int z){ // 이 경우 매개 변수의 개수가 달라 오버로딩이 가능.
        return x + y + z;
    }

   // static double sum (int x, int y, int z){ // 반환타입이 다르지만 매개변수의 숫자, 타입이 같아서 오버로딩이 안됨.
    //return (double)(x + y + z);
   // }

    static double sum (int x, int y, int z, int aa){ // 이 경우 매개 변수의 개수가 달라 오버로딩이 가능.
        return (double)(x + y + z);
    }

    static String sum(String x, String y, String z){// 매개변수의 타입이 달라서 오버로딩이 가능.
        return x + y + z;
    }

    static String sum(int x, String y, int z){// 매개변수의 타입과 순서가 달라서 오버로딩이 가능.
        return x + y + z;
    }
}
