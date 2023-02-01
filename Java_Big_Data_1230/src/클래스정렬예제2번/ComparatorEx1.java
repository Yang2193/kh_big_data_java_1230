package 클래스정렬예제2번;

import 트리셋.TreeSetBasic;

import java.util.TreeSet;

public class ComparatorEx1 {
    public static void main(String[] args) {
        TreeSet<Fruit> ts = new TreeSet<>(new DescendComp().reversed()); // 이번에는 정렬조건이 다른 클래스에 있기 때문에 조건을 안에 넣어줌.
        ts.add(new Fruit("포도", 3000));
        ts.add(new Fruit("수박", 12000));
        ts.add(new Fruit("딸기", 16000));
        ts.add(new Fruit("키위", 16000));

        for(Fruit f : ts){
            System.out.println("이름 : " + f.name + ", 가격 :  " + f.price);
        }
    }
}
