package 배열평균점수구하기;

import java.util.Scanner;

// 대 상 현 이 가르치는 학생은 총 5명.(Chovy, Deft, Beryl, Peanut, Doran)
// 기말고사를 치고 난 후 성적이 40점 미만인 경우 보충학습을 듣는 조건으로 40점으로 성적을 조정 해줌.
// 모든 학생이 보충학습을 들음.
// 총 수강생의 평균을 구하는 프로그램 작성.
// 점수는 0점 이상 100점 이하인 5의 배수 ????
public class ArrayExAver {
    public static void main(String[] args) {
        //스캐너 생성
        Scanner sc = new Scanner(System.in);
        // 배열 생성
        int[] arrScore = new int[5];
        // 배열을 순회하면서 5명의 성적을 입력 받으면서 성적이 40점 미만이면 40점으로 고정.


            for(int e = 0; e < arrScore.length; e++){


                arrScore[e] = sc.nextInt();

                if(arrScore[e] < 40){
                    arrScore[e] = 40;

                }





        }
        //평균을 구하기 위해서 성적으로 모두 합산
        int sum = 0 ;
        for(int e = 0 ; e < arrScore.length; e++){
           sum = sum + arrScore[e];
        }
        //합산된 성적으로 인원수를 나누어 평균을 구함
         System.out.println(sum/5);


    }
}
