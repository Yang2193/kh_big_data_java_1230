package 자바입출력실습예제;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class InputOutputEx {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("Example1.txt");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(fis);
        TreeSet<StudentScore> ts = new TreeSet<>();
        List<StudentScore> list = new ArrayList<>();

        while(sc.hasNextLine()){

            String str = sc.nextLine();
            String[] strArr = str.split(" ");
            String name = strArr[0];

            int kor = Integer.parseInt(strArr[1]);
            int math = Integer.parseInt(strArr[2]);
            int eng = Integer.parseInt(strArr[3]);

            ts.add(new StudentScore(name, kor, math, eng));

            list.add(new StudentScore(name, kor, math, eng));

        }

      /*  ts.stream()
                .sorted((s1, s2) -> s2.getTotal()-s1.getTotal())
                .forEach(e -> System.out.println("이름 : " + e.name + "  총점 : " + e.getTotal()));*/
// 두 가지 이상의 정렬기준으로 쓸 때는 Comparator.comparing 사용해야함
// 내림차순으로 만들 때 comparing 괄호 안에 Comparator.reverseOrder()를 쓰거나 괄호를 닫고 .reversed() 사용
        list.stream()
            .sorted(Comparator.comparing(StudentScore::getTotal, Comparator.reverseOrder())
            .thenComparing(s-> s.name))
                .forEach(e -> System.out.println("이름 : " + e.name + "  총점 : " + e.getTotal()));

       /* for(StudentScore e : ts){
            System.out.println("이름 : " + e.name + "  총점 : " + e.getTotal());
        }*/
    }
}