package parts;

public class FuelTank {

    private String name;
    private int mass;
    private int fuel;
    private int volume;

    FuelTank(String name, int mass, int fuel,int volume){
        this.fuel = fuel;
        this.mass = mass;
        this.name = name;
        this.volume=volume;
    }
}