package 유효값체크반복문;

import java.util.Scanner;
// 반복문을 이용해서 유효값체크하기 (While 반복문 사용)
// do ~ while() : 먼저 수행 후 조건 확인.
public class ValidCheck {
    public static void main(String[] args) {

        int age;
        boolean isFirst = true;
        Scanner sc = new Scanner(System.in);

        do {
            if(!isFirst) System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); // !isFirst == isFirst = false
            System.out.print("나이를 입력 하세요 : ");
            age = sc.nextInt();
            isFirst = false;

        } while(age <= 0 || age >= 200);



    /*    while(true){
            System.out.print("나이를 입력하세요 : ");
            age = sc.nextInt();
            if(age > 0 && age < 200) break;
            System.out.println("나이를 잘못 입력 하셨습니다.");

        }*/
        System.out.println("입력하신 나이는 " + age + "입니다.");
    }
}
