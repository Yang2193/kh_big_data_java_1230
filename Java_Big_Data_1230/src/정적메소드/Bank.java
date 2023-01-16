package 정적메소드;

public class Bank {
    private static int count = 0; // 해당 클래스가 객체로 몇 번 생성됐는지 확인하는 변수
    private int account; // 계좌
    private String bank; // 은행의 이름
    public Bank(String name, int account){//생성자는 클랫가 객체로 만들어질 때 호출 됨
        count++;
        this.bank = name;
        this.account = account;
        System.out.println(name + "은행에 계좌 개설을 합니다. 잔액은 " + account + " 입니다.");
         }
    public static int getCount(){ // 정적 필드값을 읽기 위한 정적 메소드(클래스 소속)
        return count;

    }

    //예금을 위한 메소드 작성. 값을 셋해서 덮어씌우는게 아니라 예금은 돈을 넣는 것이기 때문에 방법을 달리함.
    // 예금의 경우 절대 금액이 바뀌면 안되기 때문에 final을 걸어 더 이상 변경불가하게 만듦.
    public void setDeposit(final int dep){ // 입금된 고객의 금액을 더 이상 변경 불가 상태로 만들어 안전하게 보관
        this.account += dep;
        System.out.println(dep + "을 예금했습니다.");
    }

    public void setWithdraw(final int with) {
        if (with > account) {
            System.out.println("잔액이 부족합니다.");
        } else {
            this.account -= with;
            System.out.println((with + "을 출금했습니다."));
        }
    }

    public void viewAccount(){
        System.out.println("현재 잔액은 : " + account + "입니다.");
    }

}
