package 예외처리예제3번;
//NullPointerException : 참조하고 있는 주소를 접근했을 때 값이 없는 경우.
public class ExceptionEx3 {
    public static void main(String[] args) {
        Test test = null;
        try{
            String testStr = test.name;
            System.out.println(test); // NullPointerException은 예외처리를 하는 것이 아니라 잡아야 하는 것.
            //부득이할 경우 아니면 NullPointerException은 예외처리 없이 잡자.
        } catch(NullPointerException e){
            System.out.println("참조하고 있는 주소에 아무것도 없습니다.");
        }

    }
}

class Test{
    String name = "곰돌이사육사";
}
