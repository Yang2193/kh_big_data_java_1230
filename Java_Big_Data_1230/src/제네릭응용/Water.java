package 제네릭응용;

public class Water {
    public void doPrinting(){
        System.out.println("Water 재료로 출력합니다.");
    }
    @Override // 오브젝트클래스의 toString() 오버라이딩?
    public String toString(){
        return "재료는 Water입니다.";
    }
}
