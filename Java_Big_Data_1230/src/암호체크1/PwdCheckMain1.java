package 암호체크1;

import java.util.Scanner;

//선생님 풀이
public class PwdCheckMain1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PwdCheckClass pcc = new PwdCheckClass();
        String pwd; // 암호를 입력받는 변수 생성.
        while (true) {
            System.out.print("패스워드 입력 : ");
            pwd = sc.next();
            if (pwd.equalsIgnoreCase("exit") || pwd.equals("종료")) break;

            if(pcc.validLength(pwd) == false){
                System.out.println("Bad Length");
                continue;
            }

            if(!pcc.validNumber(pwd)){
                System.out.println("Bad Number");
                continue;
            }

            if(!pcc.validLowerAlphabet(pwd)){
                System.out.println("Bad Lower Alphabet Password");
                continue;
            }

            if(!pcc.validUpperAlphabet(pwd)) {
                System.out.println("Bad Upper Alphabet Password");
                continue;
            }

            if(!pcc.validRex(pwd)){
                System.out.println(("Bad Special Letter Password"));
                continue;
            }

            System.out.println("Good Password");




        }
    }
}
