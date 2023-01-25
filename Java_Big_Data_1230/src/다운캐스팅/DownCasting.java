package 다운캐스팅;

import java.util.ArrayList;

// 다운캐스팅? 상위 클래스 형으로 변환되었던 하위클래스를 다시 원래 자료형으로 변환하는 것을 다운캐스팅이라고 한다.
// instanceof : 형변환 가능 여부를 확인하는 용도.(참조변수가 참조하고 있는 객체의 실제 타입을 알아보기 위해 사용)
public class DownCasting {

    ArrayList<Animal> aniList = new ArrayList<>(); //  ArrayList는 기본적으로 참조타입. // 동적으로 할당된 배열
    // 배열이 몇 개인지 정해지지 않음.
    public static void main(String[] args) {
        DownCasting downCasting = new DownCasting();
        downCasting.addAnimal();
        downCasting.testCasting();
    }

    public void addAnimal(){
        aniList.add(new Human()); // Animal 타입에 대한 객체가 추가 됨.
        // add는 공간을 하나 만들면서 거기에 Animal 또는 상속받은 자식들 중 하나를 집어넣음.
        // ArrayList에 추가되면서 타입이 Animal형으로 변환됨.
        aniList.add(new Tiger()); // 참조변수가 Tiger를 바라보고 있음.
        aniList.add(new Eagle());

        for(Animal e : aniList) e.move();
    }

    public void testCasting(){
        for(int i = 0; i < aniList.size(); i++){
            Animal ani = aniList.get(i); // List의 해당 인덱스의 값을 가져옴.
            if(ani instanceof Human){ // Human 타입으로 형변환 가능 여부를 물어봄.
//부모의 객체를 가지고 자식클래스 중 일치하는 것이 있냐고 물어봄.
                Human h = (Human) ani;
                h.readBook();
            } else if(ani instanceof Tiger){
                Tiger t = (Tiger) ani;
                t.hunting();
            } else if(ani instanceof Eagle){
                Eagle e = (Eagle) ani;
                e.flying();
            } else {
                System.out.println("지원되지 않는 형입니다.");
            }
        }
    }
}
