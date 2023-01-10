package 간판만들기;

import java.util.Scanner;

// 각 숫자마다는 자리수가 다르다
// 0은 4칸, 1은 2칸, 나머지는 3칸
// 간판의 각 숫자 사이는 1칸의 여백이 필요
// 총 입력한 숫자를 표기하기 위해 몇 칸의 공간이 필요한지 계산하는 문제.
// 120 = 1 + 2 + 1 + 3 + 1 + 4 + 1
// 5611 = 1 + 3 + 1 + 3 + 1 + 2 + 1 + 2 + 1 = 15
// 입력은 0이 들어올 때까지 계속 반복
public class SignBoardMake {
    public static void main(String[] args) {

        int[] numberSize ={4, 2, 3, 3, 3, 3, 3, 3, 3}; // 인덱스에 해당하는 값이 고정되어 있다면 배열을 만들어서 배열인덱스로
        // 값을 구하는 방법.
        Scanner sc = new Scanner(System.in);
        String signNumber; //문자열을 입력받는 변수
        int sum = 0; // 총 몇자리의 공간을 차지하는지 누적하는 변수
        
        while(true){
            signNumber = sc.next();
            if(signNumber.equals("0")) break;

            for(int i = 0; i < signNumber.length(); i++){

                sum += numberSize[signNumber.charAt(i) - '0'] + 1; // Ascii 코드값을 이용 0에서 0을 빼면 0이 되니 0번째 배열 자리가되고
                // 1에서 0을 빼면 1이 되니 1번째 배열 자리가 된다.


            }

            System.out.println(sum + 1);
            sum = 0;

        }

 /*       int n = 1; // 내가 푼 풀이

        int[] numArr = new int[4];

        while(true){

            System.out.print("숫자를 입력 : ");
            int num = sc.nextInt();
            numArr[0] = num / 1000;
            numArr[1] = (num % 1000) /100;
            numArr[2] = (num % 100) / 10;
            numArr[3] = num % 10;

            for(int i = 0; i < numArr.length; i++){
                if(numArr[i] == 0) numArr[i] = 4;
                else if(numArr[i] == 1) numArr[i] = 2;
                else numArr[i] = 3;
            }

            if(num < 0 && num < 10){

                System.out.println( n + numArr[0] + n);

            } else if(num >= 10 && num <= 99){

                System.out.println( n + numArr[0] + n + numArr[1] + n);

            } else if(num >= 100 && num <= 999){

                System.out.println( n + numArr[0] + n + numArr[1] + n + numArr[2] + n);

            } else if(num >= 1000 && num <= 9999){

                System.out.println( n + numArr[0] + n + numArr[1] + n + numArr[2] + n + numArr[3] + n);


            }


            if(num == 0) break; // 종료
        }*/




    }
}
