package 자동차만들기종합;

public class SportsCar extends Car {

    SportsCar(String name){
        this.name = name;
        speed = 250;
        fEfficiency = 8;
        fuelTank = 30;
        seats = 2;
    }

    boolean isTurbo = false;
    @Override
    void setMode(int turbo) {
        if(turbo == 1) {isTurbo = true; speed = (int)(speed *1.2);}
        else isTurbo = false;
    }


}
