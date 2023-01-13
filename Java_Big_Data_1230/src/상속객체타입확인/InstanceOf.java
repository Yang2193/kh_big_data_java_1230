package 상속객체타입확인;
// instanceof : 개체 타입 확인 연산자, 부모와 자식 관계 성립 여부를 확인.
public class InstanceOf {
    public static void main(String[] args) {
        Parent parent = new Parent("부모");
        Child child = new Child("자식");
        System.out.println(parent instanceof Parent); // true
        System.out.println(child instanceof Parent); // true child라는 객체가 상속관계가 존재하느냐라고 묻는 것.
        System.out.println(parent instanceof Child); // false
        System.out.println(child instanceof  Child); // True
        //instanceof 는 참과 거짓만을 판별



    }
}

class Parent{
    String name;

    public Parent(String name) {
        this.name = name;
    }
}

class Child extends Parent {
    public Child(String name){
      super(name); //
        this.name = name; //name을 부모가 갖고 있었기 때문에 초기화하기 위해 super를 씀.
    }
}