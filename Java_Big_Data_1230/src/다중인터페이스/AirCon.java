package 다중인터페이스;

public interface AirCon {
    int MAX_TEMP = 30; // 내부적으로 컴파일러가 public final static을 앞에 추가함.
    int MIN_TEMP = 0; //
    void airConON();
    void airConOFF();
    void setAirConTemp(int tmp); // 메소드 3개 추가.
}
