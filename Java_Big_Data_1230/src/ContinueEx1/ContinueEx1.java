package ContinueEx1;

public class ContinueEx1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0) continue;
             //짝수인 경우에 continue를 하면, 홀수만 찍혀나온다. 2로 나눴을 때 나머지가 0인 경우 반복문의 처음으로 돌아가서 수행.
             // continue; 가 있는 시점에서 반복문의 처음으로 돌아가기 때문에 아래 있는 print에 2의 배수가 찍히지 않는다.
            System.out.println(i);
        }
    }
}
