package 저항;

import java.text.DecimalFormat;
import java.util.Scanner;

// 전자 제품에는 저항이 들어간다. 처음 색 2개는 저항의 값, 마지막은 곱해야 하는 값
// 색 : black, brown, red, orange, yellow, green, blue, violet, grey, white
// 값 : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
// 곱 : 1, 10 , 100, 1,000, 10,000, 100,000, 1,000,000, 10,000,000, 100,000,000, 1,000,000,000
// 입력 : yellow violet red
// 결과 : 4,700
// 입력 : orange red blue
// 결과 : 32000000
// 입력 : white white white
// 결과 : 99,000,000,000
public class ResistanceEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] resStrArr = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int[] resArr = {0,1,2,3,4,5,6,7,8,9};
        long[] resMul = {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};
        int[] arr = new int[3];
        String strRes = "";
        long total;

        System.out.print("저항 입력 : ");

        for(int i = 0; i < arr.length; i++){
            String str = sc.next();
            for(int j = 0; j < resStrArr.length; j++){
                if(str.equalsIgnoreCase(resStrArr[j])){
                arr[i] = j;
            }
            }
        }
        strRes += arr[0];
        strRes += arr[1];
        total = Integer.parseInt(strRes);
        total *= resMul[arr[2]];

        DecimalFormat df = new DecimalFormat("###,###");


        System.out.println(df.format(total));
    }
}
