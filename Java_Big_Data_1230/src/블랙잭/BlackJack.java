package 블랙잭;
// 5 25 -> 카드 장수, 주어진 값
// 5 6 7 8 9 -> 카드 중 석 장의 카드를 골라서 주어진 값과 같거나 작은 값 중 가장 가까운 값을 찾아야 함.
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 카드 장 수
        int m = sc.nextInt();
        // int sum = 0; // 3장의 카드의 합
        // int rst = 0; // 3장의 카드로의 조합으로 만들어진 결과 값. 선생님이 선언한 변수

        int[] arr = new int[n];
        for(int i = 0; i < n; i++)  arr[i] = sc.nextInt();

        int max = 0; // 내가 결과값으로 선언한 변수
        int sum;

        /*for(int i = 0; i < n; i++){ // 내 풀이
            for(int j = 0; j < n; j++){
                for(int e = 0; e < n; e++){
                    if(arr[i] != arr[j] && arr[i] != arr[e] && arr[j] != arr[e]){
                        sum = arr[i] + arr[j] + arr[e];
                        if(max < sum && sum <= m) max = sum;
                    }
                }
            }
        }*/

        for(int i = 0; i < n; i++){ // 선생님 풀이
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum <= m && max < sum) max = sum;
                }
            }
        }

        System.out.println(max);
    }
}
