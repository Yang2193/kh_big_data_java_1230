package 주사위게임;
// 주사위 2개 던져서 합이 12이면 탈출하는 게임
public class RandomGame {
    public static void main(String[] args) {
        int rand1, rand2;
        int cnt = 0;

        while(true){

            cnt++;
            rand1 = (int)((Math.random() * 6) + 1); // Math.random은 임의의 숫자를 만들어주는 난수 생성기
            rand2 = (int)((Math.random() * 6) + 1); // 6을 넣으면 0에서 5까지 6개의 숫자가 나와서 +1을 해줌.
            // C, C++과 다르게 랜덤함수가 실수형으로 값이 생성되기 때문에 앞에 int를 넣어서 정수값으로 바꿔줌.
            if((rand1 + rand2) == 12) {
                System.out.println("주사위의 합이 12입니다.");
                System.out.printf("무인도를 %d번만에 탈출합니다.\n", cnt);
                break;
            } else {
                System.out.println("주사위의 합이 " + (rand1 + rand2) + "입니다.");

            }

        }
    }
}
