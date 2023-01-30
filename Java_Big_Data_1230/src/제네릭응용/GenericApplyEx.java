package 제네릭응용;

public class GenericApplyEx {
    public static void main(String[] args) {// 이런 형식의 예제보단 객체지향문법의 매개변수의 다형성이 더 우선시 되어야할 문법.
        //다만 컬렉션프레임워크의 자료구조형태가 이러한 형태이기 때문에 이해하라는 측면에서 예제진행.
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder()); // Powder 타입의 객체를 생성해서 매개변수로 전달
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powder);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plastic);

        //GenericPrinter<Water> waterPrinter = new GenericPrinter<>();
    }
}
