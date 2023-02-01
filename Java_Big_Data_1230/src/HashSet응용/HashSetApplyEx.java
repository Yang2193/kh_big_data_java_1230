package HashSet응용;

import java.util.*;

//문제 : 알파벳 소문자로 이뤄진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램 작성
// 1. 길이가 짧은 것부터,
// 2. 길이가 같으면 사전 순으로
// 3. 중복 제거
// 입력 : 13 // 13개의 단어를 입력받겠다는 것. but i wont hesitate no more no more it cannot wait im yours
// 출력 : i im it no but more wait wont yours cannot hesitate

public class HashSetApplyEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 단어의 개수 입력
        String[] word = new String[n];
        for(int i = 0; i < n; i++){ // n개의 개수만큼 단어 입력 받기
            word[i] = sc.next();
        }

        HashSet<String> hashSet = new HashSet<>(Arrays.asList(word));
        word = hashSet.toArray(new String[0]);
        //toArray()는 hashSet을 다시 배열에 넘기는 메소드. 배열의 크기를 0으로 지정하면 자동으로 배열 크기가 지정 됨.



        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2); // 결과가 양수면 정렬조건
                }
                else return o1.length() - o2.length();
            }
        });


        System.out.println(Arrays.toString(word));



    }
}
