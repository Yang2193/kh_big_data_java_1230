package 다형성응용2;

public class Driver {
    String name;
    public Driver(String name){
        this.name = name;
    }
    public void drive(Vehicle vehicle){
        System.out.print(name + "의 ");
        vehicle.run();
    }
}
