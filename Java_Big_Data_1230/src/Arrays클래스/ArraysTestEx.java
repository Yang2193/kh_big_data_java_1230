package Arrays클래스;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// Arrays : 배열을 다루기 위한 다양한 메소드를 포함하고 있습니다.
// binarySearch() : 이분 검색 알고리즘 제공 // 이 메소드를 사용하기 위해서는 정렬이 되었다는 것이 전제가 되어야 한다.
// ...Big O, log n 시간복잡도 -> 한번 찾아볼것... 면접 때 물어보는 경우도 있음.
// sort() : 오름차순 정렬
// toString() : 배열의 요소를 문자열로 출력
// asList() : 일반 배열을 ArrayList로 변환
// 배열의 개수 입력, 찾을 수 입력,
public class ArraysTestEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 개수 : ");
        int num = sc.nextInt();
        Integer[] arr = new Integer[num];
        System.out.print("찾을 수 입력 : ");
        int key = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * num) + 1; // 배열의 개수 범위 내에서 값으로 난수 발생.
        }

       // Arrays.sort(arr, Collections.reverseOrder()); // int 배열은 Integer 형으로 바꿔서 사용.
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 < o2) return 1; // 내림차순 정렬.
                else return -1;
            }
        });

        for(int e : arr) System.out.print(e + " ");
        System.out.println();
        int rst = Arrays.binarySearch(arr, key); // 바이너리서치는 오름차순에서만 가능.

        if(rst>=0)
        System.out.println("찾은 값 : " + arr[rst] + " 찾은 값의 인덱스 : "+ rst);
        //결과값으로 해당값이 있는 배열의 인덱스가 나옴. 찾는 값이 없으면 음수가 반환 됨.
        else System.out.println(("찾는 값이 없습니다."));

    }
}
