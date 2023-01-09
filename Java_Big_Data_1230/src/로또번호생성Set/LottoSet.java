package 로또번호생성Set;

import java.util.HashSet;

// Set을 이용한 중복 제거
// Set이라는 자료구조는 중복값을 받을 수 없다. 따라서 중복체크가 필요없고, 그냥 값을 집어넣으면 끝난다.
public class LottoSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        while(true){
            int tmp = (int)((Math.random()*45)+1);
            set.add(tmp);
            if(set.size() == 6) break;
        }
        System.out.println(set);

    }
}
