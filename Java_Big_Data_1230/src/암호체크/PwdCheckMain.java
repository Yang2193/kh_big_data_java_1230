package 암호체크;

import java.util.Scanner;

//암호체크
//암호의 길이는 10~30자 사이(10 <= length <= 30)
// 암호에는 숫자, 소문자, 대문자, 특수문자가 포함되어야 함.
//특수문자는 ( !, %, _, #, &, +, -, *, / 9개 중의 하나
// 입력받은 패스워드가 조건을 만족하면 "Good Password" , 만족하지 않으면 "Bad Password"
// 반복문을 사용하고 사용자가 종료 또는 exit를 입력하면 프로그램 종료.
public class PwdCheckMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pwd; // 암호를 입력받는 변수 생성.
        while(true) {
            System.out.print("패스워드 입력 : ");
            pwd = sc.next();
            if(pwd.equalsIgnoreCase("exit") || pwd.equals("종료")) break;

            String check1 = "F";
            String check2 = "F";
            String check3 = "F";
            String check4 = "F";
            char ch;


            if (pwd.length() > 30 || pwd.length() < 10){
                while(true){
                    System.out.print("길이가 너무 짧거나 깁니다. 다시 입력하세요 : ");
                    pwd = sc.next();
                    if(pwd.length() <= 30 && pwd.length() >= 10) break;
                }
            }

            if(pwd.contains("!") || pwd.contains("%") || pwd.contains("_") || pwd.contains("#")
            || pwd.contains("&") || pwd.contains("+") || pwd.contains("-") || pwd.contains("*")||
                    pwd.contains("/"))  check4 = "T";

                for (int i = 0; i < pwd.length(); i++) {
                    ch = pwd.charAt(i);

                    if (ch >= 'A' && ch <= 'Z') {
                        check1 = "T";
                        break;
                    }

                    }


                for (int i = 0; i < pwd.length(); i++) {
                    ch = pwd.charAt(i);
                    if (ch >= 'a' && ch <= 'z') {
                        check2 = "T";
                        break;
                    }

                }

                for (int i = 0; i < pwd.length(); i++) {
                    ch = pwd.charAt(i);
                    if (ch >= '0' && ch <= '9') {
                        check3 = "T";
                        break;
                    }
                }



            if(check1.equals("T") && check2.equals("T") && check3.equals("T") && check4.equals("T")) System.out.println("Good Password");
            else {System.out.println("Bad Password"); System.out.println("체크1" +check1 +"체크2"+ check2 +"체크3"+ check3 +"체크4"+ check4);}

            }




    }
}
