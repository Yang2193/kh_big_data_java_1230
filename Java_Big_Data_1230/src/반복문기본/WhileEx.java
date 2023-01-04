package 반복문기본;

public class WhileEx {
    public static void main(String[] args) {
        int treeHit = 0;
        while (true){ // while문의 경우 조건을 넣지않고 탈출문을 넣는 것이 선생님 스타일. 갯수가 정해지지 않으면 while, 정해지면 for문으로 쓰심.
            treeHit++;
            System.out.println("나무를 " + treeHit + "번 찍었습니다.");
            if(treeHit == 10){
                System.out.println("나무가 넘어갑니다.");
                break;

        }/*(treeHit < 10) {
            treeHit++;
            System.out.println("나무를 " + treeHit + "번 찍었습니다.");
            if(treeHit == 10){
                System.out.println("나무가 넘어갑니다.");*/
            //}
        }
    }
}
