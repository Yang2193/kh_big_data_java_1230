package 스트림예제2번;


import java.util.ArrayList;
import java.util.List;

public class StreamEx2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("남해이", 89));
        list.add(new Student("최지열", 99));
        list.add(new Student("남행선", 78));

//        list.stream().forEach(s -> {
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + "-" + score + Thread.currentThread());
//        }); // 작은 괄호 안에 중괄호가 들어가는 문법... 메소드 괄호 안에 구현부{}가 들어간 것.
        list.parallelStream().forEach(s -> { // parallelStream(). 스트림을 병렬처리로
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + "-" + score);
           // System.out.println(name + "-" + score + Thread.currentThread().getName()); // 병렬처리가 되고 있는지 확인하기 위한 구문
        });
        double avg = list.stream().mapToInt(Student::getScore)//Student::getScore는 s -> s.getScore()랑 같은 구문
                .average() // 최종연산
                .getAsDouble(); // double형으로 반환하겠다는 것.
        System.out.println("평균 점수 : " + avg);

        double average = list.stream().mapToInt(Student::getScore).average().getAsDouble();

    }
}

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}