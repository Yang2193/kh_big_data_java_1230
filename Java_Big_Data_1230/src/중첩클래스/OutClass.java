package 중첩클래스;

public class OutClass {
    private int num = 10; // 인스턴스 변수
    private static int sNum = 20; // 정적 변수
    InClass inClass; // 아직 내부 클래스를 만들지 않아 에러가 남.
    public OutClass(){ // 외부 클래스에 대한 생성자 호출
        inClass = new InClass();
    }



    class InClass {
        int inNum = 100;

        // static int sInNum = 200; // 원래는 외부 클래스에서만 static 사용 가능. 내부 클래스에서는 사용 불가인데
        //jdk16부터 가능해짐. jdk 11버전 기준으로는 불가능.
        // 버전체크가 필요한 경우도 있다.
        void inTest() {
            System.out.println("외부클래스의 인스턴스 변수 : " + num);
            System.out.println("외부클래스의 정적 변수 : " + sNum);
        }
        // static void sTest(){} // jdk 11버전 기준으로는 내부 클래스에 정적 메소드를 사용할 수 없음
    }
        public void usingClass(){
            inClass.inTest();
        }



}
