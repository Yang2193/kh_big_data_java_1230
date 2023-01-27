package 열거타입예제;

public class Developer {
    private String name;
    private DevType type; // 개발타입을 열거한 내용 중에서 골라야함
    private Career career; // 범주를 정하고 그 안에서 선택하게 하는 용도.
    private Gender gender;

    public Developer(String name, DevType type, Career career, Gender gender) {
        this.name = name;
        this.type = type;
        this.career = career;
        this.gender = gender;
    }
    public void devInfo(){
        System.out.println("이름 : " + name);
        System.out.println("업무 : " + type);
        System.out.println("경력 : " + career);
        System.out.println("성별 : " + gender);
    }
}
