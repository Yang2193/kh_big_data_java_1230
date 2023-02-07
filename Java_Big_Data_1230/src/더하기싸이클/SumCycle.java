package 더하기싸이클;
// 입력 받은 수가 더하기 사이클의 조건을 수행하고 몇 번만에 입력한 값과 같아지는지.
//입력 26 -> 10의 자리 수(2) , 1의 자리 수 (6)을 분리해서 더함  2 + 6 = 8
//입력 받은 수의 1의 자리 수와 계산된 수의 1의 자리 수로 다시 연산 -> 68
// ---- 1 cycle -----
// 반복 6 + 8 = 14 ; 84; 8 + 4 = 12 42; 4 + 2 = 6 26;
import java.util.Scanner;

public class SumCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //String num = sc.next();
        //String answer = num;
        int cnt = 0;
        int sumNumber = 0; // 입력 받은 수의 10의 자리와 1자리를 분리해서 더함
        int newNumber = 0; // 새롭게 만들어진 수
        int input = sc.nextInt();
        int n = input;
        while(true){ // 이 경우는 문자열보다 정수형으로 푸는게 더 간편...
            cnt++;
            sumNumber = (n/10) + (n%10);
            newNumber = ((n%10)*10) + (sumNumber%10);
            if(newNumber == input) break;
            else n = newNumber;
        }


// 내 풀이
      /*  while(true){
            cnt++;
            if(Integer.parseInt(num) < 10) num = "0" + num;
            String[] arr = num.split("");
            int sum = Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
            String str = "" + sum;
            if(Integer.parseInt(str) <10) str = "0" + str;
            String[] sumArr = str.split("");
            String sum2 = arr[1] + sumArr[1];
            String[] sumArr2 = sum2.split("");
            if(sumArr2[0].equals("0")) num = sumArr2[1];
            else num = sum2;
            if(answer.equals(num)) break;

            }*/

        System.out.println(cnt);
    }
}
