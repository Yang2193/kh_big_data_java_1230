package 추상클래스기본;

import java.util.Scanner;

// 추상클래스란? 실체가 없는(객체가 안 됨) 부모가 상속을 주는 것.
// 추상클래스에는 반드시 추상메소드가 포함되어야 하고, 해당 메소드는 상속받는 자식클래스에서 구현해줘야 함.(오버라이딩)
// 추상클래스의 키워드는 abstract.
// 추상클래스는 일반 메소드, 추상 메소드, 일반 필드(인스턴스 필드) 등을 모두 포함 할 수 있음.
public class AbstractMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal = null;
        System.out.print("동물을 선택하세요 : [1] 고양이 [2] 강아지 [3] 오리 : ");
        int sel = sc.nextInt();
        switch (sel){
            case 1 : animal = new Cat(); break;
            case 2 : animal = new Dog(); break;
            case 3 : animal = new Duck(); break;
            default :

        }
        animal.cry();

    }
}

abstract class Animal { //추상클래스 생성
    abstract void cry(); // 추상메소드는 abstract 키워드를 사용하고 반드시 ;으로 끝나야 함.
    // 선언만 한 것이지 메소드가 아니기 때문에 ;을 찍어준다.
    // 상속받은 클래스에게 이 기능을 반드시 구현해야한다고 명시적으로 선언한 것이다.
    //void cry1(){} // 일반 메소드도 포함할 수 있다.
}

class Cat extends Animal{
    @Override
    void cry() {
        System.out.println("야옹 야옹");
    }

}

class Dog extends  Animal{

    @Override
    void cry() {
        System.out.println("멍 멍 멍");
    }
}

class Duck extends Animal{

    @Override
    void cry() {
        System.out.println("꿱 꿱 꿱");
    }
}
