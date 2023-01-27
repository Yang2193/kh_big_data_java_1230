package 손익분기점;

import java.util.Scanner;

// A는 고정비용(물건을 몇개를 팔아도 변하지 않는 비용) B 생산비용 C 판매비용
// 어느순간 총 수입이 총 비용보다 많아지는데, 영업이익이 발생하는 지점을 손익분기점이라고 한다.
// 손익분기점 구해라.
// ex ) A = 1000, B = 70, 1대 생산시 총 비용 1070, 10대 생산시 총 비용 1700
// c = 170인 경우 10대 생산시 수입이 같고, 11대가 나와야 함.
public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0; // 생산대수
        int fixCost = sc.nextInt(), varCost = sc.nextInt(), sellPrice = sc.nextInt();
   /*     if (varCost < sellPrice) {
            while (true) {
                cnt++;
                if (fixCost + (varCost*cnt)< sellPrice * cnt) break; // 입력값이 커지면 정수범위를 벗어남.
            }
            System.out.println(cnt);
        }
        else */

        if(varCost >= sellPrice) System.out.println("-1");
        System.out.println((fixCost/(sellPrice -varCost))); // 그래서 공식으로 해결


    }
}
