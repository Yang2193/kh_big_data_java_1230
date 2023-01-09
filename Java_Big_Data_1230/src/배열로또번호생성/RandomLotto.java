package 배열로또번호생성;

import java.util.Arrays;

// 1 ~ 45 사이의 임의의 수 6개로 구성
// 1. 배열로 로또번호를 생성해 출력하기.
// 2. 생성된 로또번호를 생성해 (중복제거)
// 3. 다른 자료구조를 사용해 로또 번호 만들기(ArrayList, Set)
public class RandomLotto {
    public static void main(String[] args) {
        // 6개의 정수형 배열 생성. (로또번호 저장을 위한 공간)
        int[] lotto = new int[6];
        // 반복문(6번 순회하는 반복문)을 만들어 순회하면서 1 ~ 45 사이의 임의의 숫자를 배열에 대입.
        /*for(int i = 0; i < lotto.length; i++) {
            // v = (int)((Math.random() * 45) + 1) ;
            lotto[i] = (int) (Math.random() * 45 + 1);
        }
        // 배열의 요소를 출력.
        for(int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + ", ");*/

            // 중복 제거를 하려면 반복횟수를 정하면 안되기 때문에 while문 사용
        int tmp; // 생성된 로또 번호를 배열에 넣기 전에 임시로 저장
        boolean isExist = false; // 번호의 중복 여부 확인을 위한 변수.
        int index = 0;
        while(true){
            tmp = (int) (Math.random() * 45 + 1);
            // 중복확인구간.
            for(int i = 0; i < lotto.length; i++){
                if(lotto[i] == tmp) isExist = true; // 배열에 생성된 로또번호가 있으면 true로 바꿈.
            }
            //생성된 번호가 배열 내에 없으면 저장하는데, 인덱스를 계산해줘야한다.
            if(isExist == false) lotto[index++] = tmp;
            // 로또 번호가 5개 만들어졌으면 반복문 탈출.
            if(index == lotto.length) break;
            // 존재 여부 확인하는 변수를 초기화.
            isExist = false;

        
        }
        System.out.println(Arrays.toString(lotto));

       // System.out.println(Arrays.toString(lotto));

/*        int[] lotto = new int[6];

        for(int i = 0; i < lotto.length; i++){

            lotto[i] = (int)(Math.random() * 45 + 1);
            for(int j = i+1; j < lotto.length; j++){
                lotto[j] = (int)(Math.random() * 45 + 1);
                if(lotto[j] == lotto[i]) break;
            }


            System.out.println(lotto[i]);
        }*/


    }
}
