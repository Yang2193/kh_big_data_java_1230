package 열거타입예제;
// 입력받고 싶은 값만 입력받을 수 있음 -> DB관리에 효율적
// 문자열 배열을 따로 만들지 않아도 됨.
// 아래 예제처럼 활용하는 것 아니면 용도가 거의 없다.

public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer("박준하", DevType.BACKEND, Career.JUNIOR, Gender.MALE);
        // 타입체크를 걸어놨기 때문에 다른 임의의 값을 넣으면 에러 발생.
        developer.devInfo();

        Developer developer1 = new Developer("아서 모건", DevType.FRONTEND, Career.SENIOR, Gender.MALE);
        // 타입체크를 걸어놨기 때문에 다른 임의의 값을 넣으면 에러 발생.
        developer1.devInfo();

    }
}
