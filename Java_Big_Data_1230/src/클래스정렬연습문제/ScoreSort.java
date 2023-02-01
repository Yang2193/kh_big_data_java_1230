package 클래스정렬연습문제;

import java.util.Comparator;

public class ScoreSort implements Comparator<StudentInfo> {
    @Override
    public int compare(StudentInfo o1, StudentInfo o2) {
        if(o1.score == o2.score) { o1.cnt = o2.cnt;
            return o1.studentId - o2.studentId;}
       else{
           if(o2.score - o1.score > 0) o1.cnt++;
           else o2.cnt++;
           return o2.score - o1.score;
        }
    }
}
