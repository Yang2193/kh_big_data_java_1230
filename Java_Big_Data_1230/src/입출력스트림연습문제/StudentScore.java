package 입출력스트림연습문제;

public class StudentScore{ // TreeSet에 객체를 넣을 때는 정렬조건이 될 기준이 없기 때문에 Comparable을 넣어
    String name;
    int kor;
    int math;
    int eng;

    public StudentScore(String name, int kor, int math, int eng) {
        this.name = name;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }

    public int getTotal(){
        return kor+math+eng;
    }

}