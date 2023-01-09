package 배열상근날드풀이;

import java.util.Scanner;

public class SetMenu {
    public static void main(String[] args) {
        int[] menu = new int[5]; // 5개의 정수로 구성된 배열 생성.
        Scanner sc = new Scanner(System.in); // 스캐너 생성
        System.out.print("메뉴 입력 : "); // 햄버거 3개와 음료 2개의 가격을 연속으로 입력받음.
        for(int i = 0; i < menu.length; i++){
            menu[i] = sc.nextInt(); // 배열의 길이만큼 순회하면서 값을 연속으로 입력받음.

        }

        int minBurger = menu[0]; // 0~2 인덱스 사이의 햄버거 중 하나의 값을 기본값으로 설정
        int minDrink = menu[3]; // 3~4 인덱스 사이의 음료 중 하나의 값을 기본값으로 설정.
        //반복문을 순회하면서 가장 싼 햄버거 1개와 음료 1개 선택.
        for(int i = 0; i < menu.length; i++) {
            if(( i < 3) && (minBurger > menu[i])) minBurger = menu[i];
            if((i > 2 ) && (minDrink > menu[i]))  minDrink = menu[i];
        }

        System.out.println(minBurger + minDrink - 50);

    }
}
