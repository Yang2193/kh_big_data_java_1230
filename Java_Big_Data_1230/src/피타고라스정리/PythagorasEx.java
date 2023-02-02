package 피타고라스정리;

import java.util.*;

public class PythagorasEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        List<String> tf = new ArrayList<>();
        int[] arr = new int[3];
        while(true){
            int sum = 0;
            for(int i = 0; i < arr.length; i++){

                arr[i] = sc.nextInt();
                sum += arr[i];
            }
//            arr[0] = sc.nextInt();
//            arr[1] = sc.nextInt();
//            arr[2] = sc.nextInt();
//            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;
            if(sum == 0) break;
            Arrays.sort(arr); // 오름차순 정렬
            if((arr[0]*arr[0]) + (arr[1]*arr[1]) == (arr[2]*arr[2])) {
                tf.add("right"); // 강사님은 결과 바로 출력
                queue.add("right");
            }
            else {
                tf.add("wrong"); // 나는 따로 뽑아서 추출
                queue.add("wrong");
            }
        }
    
      //  for(String e : tf) System.out.println(e);
        for(String q : queue) System.out.println(q);
    }
}
