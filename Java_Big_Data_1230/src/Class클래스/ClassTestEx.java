package Class클래스;

import 상속실습예제.Person;

// Class : 클래스의 패키지 이름이나 클래스 이름 등의 정보를 가져 옴.
public class ClassTestEx {
    public static void main(String[] args) {

// 클래스 정보를 확인해야 될 경우가 가끔 있는데 그 경우에 쓴다.
        String s = new String();
        Class c = s.getClass();
        System.out.println(c);

        Person person = new Person();
        Class pCls = person.getClass();
        System.out.println(pCls.getSimpleName());
        System.out.println(pCls.getClass());
    }
}
