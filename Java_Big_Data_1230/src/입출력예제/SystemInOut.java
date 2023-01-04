package 입출력예제;

import java.util.Scanner;

public class SystemInOut {
    public static void main(String[] args) {
        String name = "곰돌이사육사"; // 문자열로 움직임.
        String addr = "경기도 성남시";
        char gender = '남'; // 자바에서 char는 '' 안에 문자를 기입. 내부적으로는 정수값으로 움직인다.
        int age = 30;
        int kor = 99;
        int eng = 88;
        int math = 55;
        double aver = 0.0;

        // 자바 스타일 (메소드를 오버로딩하는 방식.) print, println은 오버로드 되어있어서 서식이 필요없음.
        System.out.println("======== Java Style Output ========");
        System.out.print("Name : " + name + "\n"); // println하고 똑같은 효과 = \n
        System.out.println("주소 : " + addr); // + 문자열 연산자, 문자열을 이어붙이는 역할.
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + (kor + eng + math));
        System.out.println("평균 : " + ((double)(kor + eng + math)/3));
        // C언어 스타일(서식지정자를 사용)
        // 서식지정자 : %d(정수), %ld(long타입), %u(부호가 없을 때?), %f(실수)
        // %.2f(소수점 2자리까지), %s(문자열), %c(문자), %%(실제 %를 찍을 때), %b(
        // 이스케이프 시퀀스 : \n(줄바꿈), \r(Carriage Return, 인쇄위치를 맨 앞으로), \t(tab, 간격을 띄어주는 것), \b(backspace, 쓰여진 곳 지점 앞 글자 지우기.), \\
        System.out.printf("======== Java Style Output ========\n");
        System.out.printf("이름 : %s\n주소 : %s\n", name, addr); // %s String 서식지정자.
        System.out.printf("주소 : %s\n", addr); // 데이터형을 정확히 알면 printf 사용 가능. 보통 대부분 println을 쓴다.
        System.out.printf("성별 : %c\n", gender);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("총점 : %d\n", kor + eng + math);
        System.out.printf("평균 : %.2f\n", (double)(kor + eng + math)/3); // 서식에 맞춰 소수점 자리로 자를 수 있다.

        System.out.print("Apple\rBanana\tKiwi\b\n");

        System.out.println("\"Enter\" 키를 입력하시면 종료 됩니다."); // \" \" 하면 따옴표 사이에 따옴표를 넣을 수 있다.
        System.out.println("Hello\\Java");
        System.out.printf("오늘의 습도는 %d%%\n", 25); // %를 쓰고 싶으면 printf에서는 %%를 써야한다.

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n * n; i++){
            System.out.printf("%4d", i); //%3d 오른쪽 기준으로 3칸을 차지 하겠다는 뜻. // 오른쪽 정렬.
            if(i % n == 0) System.out.println();
        }

    }
}
