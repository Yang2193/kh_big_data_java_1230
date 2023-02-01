package HashSet집합;
//합집합 : 두 개의 요소에서 어느 한 쪽에만 존재해도 결과에 반영(동일한 값이 양쪽에 존재하는 경우 중복이 제거되어 한번만 결과에 적용.)
//교집합 : 두 개의 요소에 모두 존재하는 값만 결과에 반영
//차집합 : 앞의 요소에서 뒤의 요소를 제거한 나머지를 결과에 반영

import java.util.Arrays;
import java.util.HashSet;

public class UnionEx {
    public static void main(String[] args) {


        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
      //  s1.addAll(s2); // 합집합
      //  s1.retainAll(s2); // 교집합
        s1.remove(s2); // 차집합
        System.out.println(s1);

    }
}