package 구간합구하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sum41 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 배열의 개수
        int x = sc.nextInt(); // 테스트 케이스
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int left = 0, right =0;
        while (x!=0){
            long sum = 0;
            left = sc.nextInt();
            right = sc.nextInt();
            for(int i = left -1; i < right; i++){
                sum += arr[i];
            }
            System.out.println(sum);
            x--;
        }



       /* int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] sum = new int[m];
        // 값이 나오는 횟수는 n-m+1
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] sumT = new int[n+1];
        int sum2 = 0;
        for(int i = 1; i < sumT.length; i++){
            sum2 += arr[i-1];
            sumT[i] =sum2;
        }
        sumT[0] = 0;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sumT));

        for(int e =0; e < m; e++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            sum[e] = sumT[j] - sumT[i-1];
        }

       *//* for(int e =0; e < m; e++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            for(int z = i-1; z < j; z++){
                sum[e] += arr[z];
            }
        }*//*

        for(int e : sum) System.out.println(e);*/
    }
}
