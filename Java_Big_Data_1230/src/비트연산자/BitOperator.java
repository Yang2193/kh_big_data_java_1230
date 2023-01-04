package 비트연산자;
//비트 연산자 : 비트 단위로 연산을 수행 (1/0)
// &(비트 and) : 2개의 비트가 모두 1이면 1.
// |(비트 or) : 2개의 비트 중 하나의 비트만 1이면 1.
// ^(XOR, exclusive or, 배타적 or) : 2개의 비트의 값이 같으면 0, 다르면 1
// ~(비트의 값을 반전) : 비트가 0이면 1로, 1이면 0으로 반전시켜줌.
// << (Shift 연산자) : 지정된 수만큼 왼쪽으로 비트를 이동 시킴.
// >> (Shift 연산자) : 지정된 수만큼 오른쪽으로 비트를 이동 시킴.

public class BitOperator {
    public static void main(String[] args) {
        int num1 = 10; // 1010
        int num2 = 12; // 1100
        System.out.println(num1 & num2); // 1000 = 8
        System.out.println(num1 | num2); // 1110 = 14
        System.out.println(num1 ^ num2); // 0110 = 6
        System.out.println(~num1); // -11 비트가 뒤집혀서 -11이 나옴.
        System.out.println(num1 << 1); // 00001010 -> 00010100 = 20 1칸 왼쪽으로 옮긴다는 것은 곱하기2를 하는것과 같다.
        System.out.println(num1 >> 1); // 00001010 -> 00000101 = 5 1칸 오른쪽으로 옮기는 것은 나누기 2를 하는 것과 같다.

    }

}
