package 상속실습예제;
// 인간(Person)이라는 클래스 생성
// age : 나이 특성을 가짐(정수값 반환, 게터/세터) - 몇 살인지
// sleep :잠자는 특성(정수 값 사용, 게터/세터) - 몇 시간 잠자는지.
// 인간으로부터 직장인을 만듦
// -work : 몇 시간 일하는지.(정수, 게터/세터)
// 인간으로부터 학생을 생성
// - student : 공부하는 특성 (1로 입력받으면 출력받으면 "열심히", 2 입력 시 "적당히" 3 "놀면서")
public class InheritanceEx1 {
    public static void main(String[] args) {
        Work work = new Work();
        work.setAge(31);
        work.setSleep(5);
        System.out.println("직장인이 " + work.getWorkTime() + "시간 동안 일을 합니다.");
        work.setWorkTime(8);
        System.out.println("직장인이 " + work.getWorkTime() + "시간 동안 일을 합니다.");
        System.out.println("직장인의 나이는 " + work.getAge() + "살 입니다.");
        System.out.println("직장인은 " + work.getSleep() + "시간 동안 잠을 잡니다.");

        Study study = new Study();
        study.setStudy(1); // 1 2 3
        study.setAge(19);
        study.setSleep(6);
        System.out.println("학생은 " + study.getStudy() + " 공부 합니다.");
        System.out.println("학생은 " + study.getAge() + "살 입니다.");
        System.out.println("학생은 " + study.getSleep() + "시간 동안 잠을 잡니다.");
    }
}
