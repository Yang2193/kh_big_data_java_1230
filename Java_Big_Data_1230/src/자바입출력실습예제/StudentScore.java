package 자바입출력실습예제;

public class StudentScore {
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