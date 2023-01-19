package 싱글톤;

public class ReferenceTest1 {
    Singleton singleton = Singleton.getSingleton();
    void setInfo(String name, int id){
        singleton.name = name; // 외부의 값을 싱글톤 값에 넣음. 그러다보니 같은 싱글톤을 공유하고 있는 다른 클래스에서도
        // 같은 값이 나옴. 공유하기 편하나, 쓰레드로 만들었다면 값이 깨질 수도 있다.
        singleton.id = id;
    }

    void viewInfo(){

        System.out.println("이름 : " + singleton.name);
        System.out.println("아이디 : " + singleton.id);
    }
}

class ReferenceTest2 {

    Singleton singleton = Singleton.getSingleton();

    void setInfo(String name, int id){
        singleton.name = name;
        singleton.id = id;
    }

    void viewInfo(){
        System.out.println("이름 : " + singleton.name);
        System.out.println("아이디 : " + singleton.id);
    }

}