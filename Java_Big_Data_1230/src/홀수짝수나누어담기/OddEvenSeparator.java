package 홀수짝수나누어담기;
// 7 개의 정수를 입력 받음(배열 생성 필요)
// 정수 입력 : 1, 2, 3, 4, 5, 6, 7
// 홀수 : 1, 3, 5, 7
// 짝수 : 2, 4, 6
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// List를 사용한 방법.
public class OddEvenSeparator {
    List<Integer> inList = new ArrayList<>();
    List<Integer> oddList = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>();
   /* int[] inputArr = new int[7];
    int[] oddArr = new int[7];
    int[] evenArr = new int[7];
    int o_idx = 0;
    int e_idx = 0;*/

    void inputArr(){
        Scanner sc = new Scanner(System.in);
        int value = 0;
        System.out.print("정수 입력 : ");
        while (true){
            value = sc.nextInt();
            if(value == 999) break;
            inList.add(value); // ArrayList 값을 추가 함
        }
        /*for(int i = 0 ; i < inputArr.length; i++){
            n = sc.nextInt();
            inputArr[i] = n;
        }*/

    }

    void separatorArr(){ // 홀수짝수나누기.

        for(int e : inList){

            if( e % 2 == 0) evenList.add(e);
            else oddList.add(e);

        /*for(int e : inputArr){
            if(e % 2 == 0) evenArr[e_idx++] = e;
            else oddArr[o_idx++] = e;*/

        }
   /*     for(int i = 0; i < inputArr.length; i++){
            if(inputArr[i] % 2 == 0) evenArr[e_idx++] = inputArr[i];
            else oddArr[o_idx++] = inputArr[i];
        }*/

    }

    void printArr(){
        System.out.print("홀수 : ");
        for(int e : oddList) System.out.print(e + " ");
        //for(int i = 0; i < o_idx; i++) System.out.printf("%2d, ", oddArr[i]);
        //System.out.print("\b");
        //System.out.print("\b");
        System.out.println();
        System.out.print("짝수 : ");
        for(int e : evenList) System.out.print(e + " ");

        //for(int i = 0; i < e_idx; i++) System.out.printf("%2d, ", evenArr[i]);
        //System.out.print("\b");
        //System.out.print("\b");



    }
}
