package 배열을향상된for문으로사용;
// 향상된 for문은 배열의 요소를 처음부터 끝까지 자동 순회
// 중간에 어느 시점부터 순회하는 것은 안 됨.
// 배열의 내부값을 변경할 수가 없다.
public class EnhancedFor {
    public static void main(String[] args) {

        int[] score = {50, 50, 50};

        int sum = 0;


       /* for(int i = 0; i < score.length; i++){
            score[i] += 10;
            sum += score[i]; // sum1 = sum1 + score[i];
        }*/
        for(int e : score){
            e += 10;

            sum += e;
        }
        
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n" , (double)sum / score.length);

        sum = 0;

        for(int i = 0; i < score.length; i++){
            score[i] += 10;
            sum += score[i]; // sum1 = sum1 + score[i];
        }
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n" , (double)sum / score.length);
    }
}
