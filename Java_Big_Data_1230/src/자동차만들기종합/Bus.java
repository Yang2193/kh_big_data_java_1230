package 자동차만들기종합;

public class Bus extends Car {

    Bus(String name){
        this.name = name;
        speed = 150;
        fEfficiency = 5;
        fuelTank = 100;
        seats = 20;
    }
    boolean isTank = false;
    @Override
    void setMode(int i) {
        if(i == 1)  {isTank = true; fuelTank += 30;}
        else isTank = false;
    }
}
