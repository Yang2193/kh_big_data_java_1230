package 열거타입;

import java.util.Calendar;

//열거타입(enum) : 한정된 값인 열거 상수 중에서 하나의 상수를 저장하는 타입.
//열거체를 비교할 때 실제 값 뿐만 아니라 타입체크를 합니다.
//문자열 배열 대신에 쓸 수 있음, 물론 사용용도는 조금 다르지만 사용할 수 있다.
public class EnumTypeEx1 {
    public static void main(String[] args) {
        Week today = null; // Week enum 타입의 참조 변수 선언.
        Calendar cal = Calendar.getInstance(); // 추상클래스이므로 객체 생성없이 바로 사용
        int week = cal.get(Calendar.DAY_OF_WEEK); // 해당 주의 몇 번째 요일인지 반환 (일요일부터 1로 시작)
        switch(week) {
            case 1 :
                today = Week.SUNDAY; break;
            case 2 :
                today = Week.MONDAY; break;
            case 3 : today = Week.TUESDAY; break;
            case 4 : today = Week.WEDNESDAY; break;
            case 5 : today = Week.THURSDAY; break;
            case 6 : today = Week.FRIDAY; break;
            case 7 : today = Week.SATURDAY; break;
            default:
        }

        System.out.println("오늘의 요일 : " + today);


    }
}
