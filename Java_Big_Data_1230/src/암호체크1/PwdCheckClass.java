package 암호체크1;

public class PwdCheckClass {
    boolean validLength(String pwd) {
        if(pwd.length() >= 10 && pwd.length() <= 30) return true;
        return false;
    }
    //숫자 체크
    boolean validNumber(String pwd){
        for(int i = 0; i < pwd.length(); i++){
            if(pwd.charAt(i) >= '0' && pwd.charAt(i)<='9') return true;

        }
        return false;
    }

    boolean validLowerAlphabet(String pwd){
        for(int i = 0; i < pwd.length(); i++){
            if(pwd.charAt(i) >= 'a' && pwd.charAt(i)<='b') return true;

        }
        return false;
    }

    boolean validUpperAlphabet(String pwd){
        for(int i = 0; i < pwd.length(); i++){
            if(pwd.charAt(i) >= 'A' && pwd.charAt(i)<='B') return true;

        }
        return false;
    }
    //특수문자체크
    boolean validRex(String pwd){
        String specialLetter = "!%_&#+-*/";
        for(int i = 0; i < specialLetter.length(); i++){
            for(int j = 0; j < pwd.length(); j++){
                if(specialLetter.charAt(i) == pwd.charAt(j)) return true;
            }
        }
        return false;

    }

}
