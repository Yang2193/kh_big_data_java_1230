package 저항강사님풀이;

import java.util.Scanner;

public class ResistanceEx {
    public static void main(String[] args) {
//컬러값에 대한 문자열 배열 생성, 문자열을 비교해서 인덱스를 찾기 위해.
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int fstIdx = 0;
        int secIdx = 0;
        int trdIdx = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String fstColor = sc.next();
        String secColor = sc.next();
        String trdColor = sc.next();
        for(int i = 0; i < color.length; i++){
            if(fstColor.equals(color[i])) fstIdx = i; // 첫번째 입력 받은 컬러 문자열과 배열의 컬러 이름이 같으면
            //인덱스를 대입.
            if(secColor.equals(color[i])) secIdx = i;
            if(trdColor.equals(color[i])) trdIdx = i;
        }
//정수값 범위를 벗어날 수 있으므로 long으로 형변환해줌.
        System.out.println((long)((fstIdx*10)+secIdx)*(long)(Math.pow(10, trdIdx)));
    }
}
