package 십진수이진수바꾸기;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int binary = 0;
        int decimal = 0;
        int cnt = 1;
        int val = sc.nextInt();


        while(true){
            if(num % 2 == 1) binary += cnt;
            cnt *= 10;
            num /= 2;
            if(num == 0) break;
        }

        System.out.println(binary);

        cnt = 1;
        while(true){
            if(binary % 10 == 0) decimal += 0;
            else decimal += cnt;
            binary /= 10;
            cnt *= 2;
            if(binary == 0) break;
        }

        System.out.println(decimal);


       /* while(true) {
            String num = sc.next();
            if(num.equals("0000")) break;
            System.out.println("초기 입력 십진수 : " + num);
            int dec = Integer.parseInt(num);
            String bin = Integer.toBinaryString(dec);
            int bin2 = Integer.parseInt(bin, 2);
            System.out.println("이진법 : " + bin);
            String dec2 = Integer.toString(bin2);
            System.out.println("다시 십진수 : " + dec2);
        }*/
    }

    static int decToBin(int dec){//10진수를 입력받아 2진수 반환
        int calc; // 계산으로 만들어지는 숫자
        int bin = 0;
        int pos = 1;
        while(dec != 0){
            calc = dec % 2; // 2로 나눈 나머지를 구함
            bin = bin + calc * pos;
            pos *= 10;
        }

        return bin;
         }


    static int binToDec(int bin){
        int dec = 0; // 최종 결과
        int i = 0; // 인덱스 계산용 변수
        int tmp; // 계산을 위한 임시 값 저장용.
        while( bin!=0){
            tmp = bin % 10;
            bin = bin /10;
            dec += tmp * Math.pow(2, i++);
        }
        return dec;
         }
}
