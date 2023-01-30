package 제네릭응용;

public class GenericPrinter<T extends Material> { // Material로부터 상속받은 클래스만 타입변수로 전달받겠다는 의미
    private T material; // 재료가 되는 물질을 받을 변수
    public void setMaterial(T material){
        this.material = material;
    }
    public T getMaterial(){
        return  material;
    }
    @Override
    public String toString(){
        return material.toString(); // 매개변수 객체의 toString()을 리턴
    }
}
