package 자동차만들기종합;

public class Sedan extends Car {
    Sedan(String name) {
        this.name = name;
        speed = 200;
        fEfficiency = 12;
        fuelTank = 45;
        seats = 4;
    }

    boolean isTrunk = false;

    void setMode(int trunk) {
        if (trunk == 1) {
            isTrunk = true;
            seats += 1;
        } else isTrunk = false;
    }

}



