package Class클래스;

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

class Person {
    private String name;
    private int age;
    Person() {}
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}