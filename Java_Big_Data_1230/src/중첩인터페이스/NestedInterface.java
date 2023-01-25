package 중첩인터페이스;
//중첩인터페이스란 클래스 내부에 선언한 인터페이스를 뜻함
//주로 UI 프로그래밍에서 이벤트 처리를 위해 사용.
public class NestedInterface {
    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(new CallListener());
        button.touch(); // 버튼 touch() 메소드를 호출 -> 등록 된 리스너의 onClick()을 호출함.
        button.setOnClickListener(new MessageListener());
        button.touch(); // MessageListener의 onClick()을 호출함.
    }
}
