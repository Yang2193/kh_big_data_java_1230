package 조건문연습문제1;

import java.util.Scanner;

// 성적을 입력 받음
// 입력 받은 값이 0~100 사이가 아니면 "잘못 입력하였습니다" 출력
// 90점 이상이면 A 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 나머지는 F
public class ScoreGrade {
    public static void main(String[] args) {
//스캐너 객체 생성
// 생성된 객체에서 정수값을 입력 받음
// 조건문에서 값이 0과 100 사이인 경우 점수와 등급 출력,
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력해주세요. :");
        int score = sc.nextInt();
        if (score < 0 || score > 100) return; // return은 이 메소드를 끝내는 의미가 있다. 이 경우에 맨 뒤의 else 구문을 뺀다.
        // 이런 구문의 형태는 잘 안 쓰이긴 하지만, 현업에서 호출에서 사용.

        //  if(score >= 0 && score <= 100) { // 코드가 한 줄이면 중괄호 생략이 가능하다.


        if (score >= 90) System.out.println("A");
        else if (score >= 80) System.out.println("B");
        else if (score >= 70) System.out.println("C");
        else if (score >= 60) System.out.println("D");
        else System.out.println("F");
    } /*else {
            System.out.println("잘못 입력하셨습니다.");
        }*/


        /*if (score > 100){
            System.out.println("잘못 입력하셨습니다.");
        } else if (score < 0) {
            System.out.println("잘못 입력하셨습니다.");
        }
         else if( score >= 90){
            System.out.println("귀하의 점수는 " + score +"이며, 학점은 A입니다.");
        } else if( score >= 80){
            System.out.println("귀하의 점수는 " + score +"이며, 학점은 B입니다.");

        } else if (score >= 70) {
            System.out.println("귀하의 점수는 " + score +"이며, 학점은 C입니다.");
        } else if (score >= 60){
            System.out.println("귀하의 점수는 " + score +"이며, 학점은 D입니다.");
        } else {
            System.out.println("귀하의 점수는 " + score +"이며, 학점은 F입니다.");}*/



    }

