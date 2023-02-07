package 게임만들기;

public class GameThA extends Thread{
    //Thread로 상속받아 쓰레드 구현
    //GameThA : 전사캐릭터로 간주
    private Character warrior; // 외부제에서 접근 허용을 막기 위한 private 선언
    private Character wizard; // Character 클래스로 참조변수 생성
    public GameThA(Character warrior, Character wizard){ // 외부에서 만드는 생성자 주입
        this.warrior = warrior; //매개변수로 넘겨받은 객체를 인스턴스 필드 변수에 넘겨 줌.
        this.wizard = wizard;
    }

    @Override
    public void run(){
        int normal; // 일반공격에 대한 확률 구하기
        int special; // 특수 공격에 대한 확률 구하기
        boolean endGame = false; // 게임의 진행여부 판독
        while(true){// 해당 스레드를 무한 반복하도록 함.
            try{
                sleep(3000);
                normal = (int)(Math.random() *2); // 50% 확률을 구한다
                special = (int)(Math.random() * 20); // 5% 확률을 구함
                if(normal == 1){ // normal은 0/1만 나옴
                    System.out.println("물리 공격 : " + wizard.name + "에게"
                    + warrior.pAttack() + "데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.pAttack());
                     }
                else{ System.out.println("마법 공격 : " + wizard.name + "에게" +
                        warrior.mAttack() + "데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.mAttack());
                }
                if(special == 10) {//10이라는 값이 나올 확률은 1/20
                    System.out.println(warrior.name + " 궁극기 발동 !!!," +
                            wizard.name + "에게" + warrior.ultimate() + "데미지를 입혔습니다.");
                    endGame = wizard.setDamage((warrior.ultimate()));
                }
                if(endGame){
                    System.exit(0);
                }


            } catch(InterruptedException e){
            }
        }
    }
}
