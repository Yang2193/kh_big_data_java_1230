package 어레이리스트객체;

import java.util.ArrayList;
import java.util.List;

public class ArrayListObject {
    public static void main(String[] args) { // 정말 자주 나오는 패턴이기 때문에 반드시 이해하거나 암기해야함.
        List<MenuInfo> menuList = new ArrayList<>(); // 연속된 공간에 배열을 넣기 위한 공간을 잡음.
        //하나하나가 MenuInfo 객체를 가리킴
        menuList.add(new MenuInfo("Americano", 2500,"Coffee", "기본 커피입니다.")); // 인덱스가 가리키는 건 객체의 주소, 0번 인덱스는 참조변수가 됨.
        menuList.add(new MenuInfo("Latte", 4500, "Coffee", "우유가 들어간 커피")); // 객체가 생성되고 이걸 가리키는 객체의 주소를 참조변수로 가짐?
        //다른 방법으로 객체를 넣는 법.
        MenuInfo menuTest = new MenuInfo("Espresso", 2500, "Coffee", "진한 커피");
        menuList.add(menuTest);

        for(MenuInfo e : menuList) {
            e.getMenuInfo();
            System.out.println("---------");
        }

    }
}
