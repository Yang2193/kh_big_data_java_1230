package 입출력스트림연습문제;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputOutputEx {
    public static void main(String[] args) throws IOException {


        FileInputStream fis = null;
        try {
            fis = new FileInputStream("Example1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(fis);

        List<StudentScore> list = new ArrayList<>();

        Stream<StudentScore> studentStream = null;
        while (sc.hasNextLine()) {

            String str = sc.nextLine();
            String[] strArr = str.split(" ");
            String name = strArr[0];

            int kor = Integer.parseInt(strArr[1]);
            int math = Integer.parseInt(strArr[2]);
            int eng = Integer.parseInt(strArr[3]);

            list.add(new StudentScore(name, kor, math, eng));

        }
        fis.close();


      /*ts.stream()
                .sorted((s1, s2) -> s2.getTotal()-s1.getTotal())
                .forEach(e -> System.out.println("이름 : " + e.name + "  총점 : " + e.getTotal()));*/
// 두 가지 이상의 정렬기준으로 쓸 때는 Comparator.comparing 사용해야함
// 내림차순으로 만들 때 comparing 괄호 안에 Comparator.reverseOrder()를 쓰거나 괄호를 닫고 .reversed() 사용

      list.stream()
               .sorted(Comparator.comparing(StudentScore::getTotal, Comparator.reverseOrder())
                       .thenComparing(s -> s.name))
              .forEach(e -> System.out.println("이름 : " + e.name + "  총점 : " + e.getTotal()));

       /* for(StudentScore e : ts){
            System.out.println("이름 : " + e.name + "  총점 : " + e.getTotal());
        }*/
    }
}