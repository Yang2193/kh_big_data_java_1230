package 최소값최대값구하기;

import java.util.Scanner;

// 임의의 정수값을 입력받고
// 입력된 정수 범위의 임의의 값을 입력해서 배열 생성.
// 해당 배열에서 제일 작은 값과 제일 큰 값을 찾기.
// 정수값 입력 : 10
// 1 3 5 7 2 4 10 10 20 15
// Min : 1
// Max : 20
public class MinMaxArray {
    public static void main(String[] args) {
        //스캐너 생성
        Scanner sc = new Scanner(System.in);
        //정수값 입력을 받는다.
        System.out.print("배열 갯수 입력 : ");
        int arrNum = sc.nextInt();
        //입력받은 정수로 배열을 형성.
        int[] arry = new int[arrNum];
        //생성된 배열 크기만큼 순회하면서 정수값을 입력받음.
        for(int i = 0; i < arry.length; i++){
            System.out.print("범위 내의 정수를 입력 : ");
            int num1 = sc.nextInt();
            arry[i] = num1;



        }

        //배열에서 제일 작은 값과 제일 큰 값을 찾음
        //값을 비교하기 위해 기준값 필요, 배열 0번째 값을 기준값으로


        int min = arry[0];
        int max = arry[0];

        for(int e :arry) {
            if (min > e) {
                min = e;
            }
            if (max < e) {
                max = e;
            }
        }

       /* for(int j = 0; j < num; j++){
            if(arry[j] > max){
                max = arry[j];
            }

            if(arry[j] < min){
                min = arry[j];
            }

        }*/


        // 출력
        System.out.println("최소값 : " + min + " 최대값 : " + max );
    }
}
