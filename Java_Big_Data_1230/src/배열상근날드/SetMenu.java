package 배열상근날드;

import java.util.Scanner;

// 상근날드 가게에서는 세트메뉴를 판매한다.
// 햄버거는 3개
// 음료 2개
// 입력은 총 5개의 값을 연속으로 입력 하는데 햄버거 3개의 가격 먼저, 음료수 2개를 연속으로 가격입력
// 햄버거 3가지 중 가장 싼 메뉴 선택, 음료 2개 중 가장 싼 것 선택 세트메뉴이기 때문에 50원 할인.
// 총 세트 메뉴의 금액을 구하는 문제
public class SetMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arySet = new int[5];

        for(int i = 0; i < arySet.length; i++){
            System.out.print("가격을 입력 : ");
            arySet[i] = sc.nextInt();
        }

        int hMin = arySet[0];


        for(int e = 0; e < (arySet.length-2); e++){


            if(arySet[e] < hMin) hMin = arySet[e];
        }


        int bMin = arySet[4];

        for(int e = (arySet.length-2); e < arySet.length; e++){


            if(arySet[e] < bMin) bMin = arySet[e];

        }

        int setPrice = (hMin + bMin) - 50;
        System.out.println(setPrice);

    }

}
