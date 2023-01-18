package 평균은넘겠지;
//하나의 케이스를 하나의 메소드로 구현

import java.util.Scanner;

public class AboveAverage {
    public static void main(String[] args) {
        Method method = new Method();
        method.setTestCase();


    }
}

class Method {
    int testCnt = 0;

    void setTestCase(){
        Scanner sc = new Scanner(System.in);

        System.out.print("테스트 케이스 개수 입력 : ");
        testCnt = sc.nextInt();
        double[] result = new double[testCnt];
        for(int i = 0; i < result.length; i++){
            result[i] = overRate();
        }
        for(double e : result) System.out.printf("%.3f%%\n", e);
        }


    double overRate(){
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int overCnt = 0;
        System.out.print("학생 수 입력 : ");
        int studentCnt = sc.nextInt();
        int[] score = new int[studentCnt];

        System.out.print("점수 입력 : ");
        for(int i = 0; i < score.length; i++){
            score[i] = sc.nextInt();
            total += score[i];
        }
        double average = (double)total / studentCnt;

        for(int i = 0; i <studentCnt; i++){
            if(score[i] > average) overCnt++;
        }
        double ratio = (double)overCnt/studentCnt;
        return ratio*100;
    }


}
