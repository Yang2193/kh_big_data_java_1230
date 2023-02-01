package 클래스정렬예제2번;

import java.util.Comparator;

public class DescendComp implements Comparator<Fruit> {

    @Override
    public int compare(Fruit o1, Fruit o2) {
        if(o1.price == o2.price)
            return o1.name.compareTo(o2.name); // 가격이 같을 경우는 사전순 정렬
        else return o2.price - o1.price; // 가격이 비싼 것부터 정렬하는 내림차순 정렬
    }

    @Override
    public Comparator<Fruit> reversed() {
        return Comparator.super.reversed();
    }
}
