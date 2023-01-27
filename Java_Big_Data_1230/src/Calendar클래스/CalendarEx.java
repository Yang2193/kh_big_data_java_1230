package Calendar클래스;

import java.util.Calendar;

//Calendar 클래스는 추상클래스이므로 객체 생성없이 사용, 날짜와 시간과 달리 캘린더 표기법은 각 나라마다 상이
//정적메소드인 getInstance() 메소드 이용해서 운영체제의 시간 기준의 정보를 가져옴. 포함 된 필드도 전부 클래스 변수.
public class CalendarEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
//        System.out.println(now.get(Calendar.YEAR)); // 개별적으로 연도만 가지고 올 때는 이게 더 편함.
//        System.out.println(now.get(Calendar.MONTH) + 1); // Month의 경우 인덱스가 넘어오기 때문에 +1 해줘야함.
//        // 실제 달을 가져오는 것이 아니고 달에 대한 인덱스값을 반환. 나머지는 다 똑같음
//        System.out.println(now.get(Calendar.DAY_OF_WEEK)); // 주에서 몇번째 날인지
//        System.out.println(now.get(Calendar.DAY_OF_MONTH)); // 달에서 몇번째 날인지
//        System.out.println(now.get(Calendar.AM_PM));
//        System.out.println(now.get(Calendar.HOUR)); // 시간
//        System.out.println(now.get(Calendar.MINUTE)); // 분
//        System.out.println(now.get(Calendar.SECOND)); //초
        // yyyy년 MM월 dd일  HH시 mm분ss초 <- Calendar를 이렇게 찍어보기
        System.out.println(now.get(Calendar.YEAR) + "년 " +(now.get(Calendar.MONTH) + 1)+"월 " +
                now.get(Calendar.DAY_OF_MONTH)+"일 " +now.get(Calendar.HOUR) + "시 "+ now.get(Calendar.MINUTE)+"분 "
        +now.get(Calendar.SECOND) + "초");

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) +1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int isPM = now.get(Calendar.AM_PM);
        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int sec = now.get(Calendar.SECOND);

        System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초\n",year, month,day, hour, minute,sec);
    }


}
