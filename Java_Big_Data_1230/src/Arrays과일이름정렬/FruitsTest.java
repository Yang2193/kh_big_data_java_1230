package Arrays과일이름정렬;

import java.util.Arrays;
import java.util.Comparator;

//임의의 과일이름 10개의 배열 생성 받아서 길이순으로 정렬 (compareTo -> 문자열을 정수값으로 변환해주는 것)
//길이가 같은 과일들은 사전순으로 정렬.
//String length() : 양수, 음수
//String compareTo() 사용하면 해결 가능
// Arrays.sort(배열이름, new Comparator<String>(){compare() 메소드 구현})
public class FruitsTest {
    public static void main(String[] args) {
        String[] fruits = {"apple", "pineapple", "melon", "banana", "tomato", "grapefruits", "grape", "forsaken","imperium",
        "fortheemperor"};

        System.out.println(fruits[0].compareTo(fruits[4]));
        Arrays.sort(fruits, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) return 1; //첫번째가 두번째보다 길이가 길면 정렬 조건
                else {if(o1.length() == o2.length())
                    return o1.compareTo(o2); // 두번째가 사전순서상 앞에 있으면 양수
                }
                return -1;
            }
        });

        System.out.println(Arrays.toString(fruits));

        String test = "abcd";
        System.out.println(test.compareTo("ab")); // 양수
        System.out.println(test.compareTo("abcd")); // 0
        System.out.println(test.compareTo("abcddownfall")); // 음수

    }
}
