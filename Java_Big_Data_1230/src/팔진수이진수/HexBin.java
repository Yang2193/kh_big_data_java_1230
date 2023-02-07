package 팔진수이진수;

import java.util.Scanner;

public class HexBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            String oct = sc.next();
        //  if(oct.equals("0000")) break;
            int n1 = Integer.parseInt(oct, 8);
          System.out.println(Integer.toBinaryString(n1));


        String[] heArr = oct.split("");
        String[] hexx = {"0","1","2","3","4","5","6","7"};
        String[] biArr = {"000","001","010","011", "100","101","110","111"};
        String[] biArr2 = {"","1","10","11", "100","101","110","111"};

        String str = "";
        for(int i = 0; i < biArr2.length; i++){
            if(heArr[0].equals(hexx[i])) str+= biArr2[i];
        }
        for(int i = 1; i < heArr.length; i++){
            for(int j = 0; j < hexx.length; j++){
                if(heArr[i].equals(hexx[j])) str += biArr[j];
            }
        }

//        for(int i = 0; i < oct.length(); i++){
//            if(oct.length()==1 && oct.charAt(0) -'0'==0){
//                System.out.println("0");
//                break;
//            }
//            if(i == 0){
//                System.out.print(bin2[oct.charAt(0)]-'0');
//            } else{
//                System.out.print(bin1[oct.charAt(0)]-'0');
//            }
//        } //선생님 풀이

        System.out.println(str);


    }
}
