package parts;

public enum CarBodyVariants {
    CB1("Bug",600,50,200),
    CB2("Tank",2600,550,600),
    CB3("volvo",1000,150,200),
    CB4("Bug2",600,50,200),
    CB5("Bug3",600,50,200);

    public final String name;
    public final  int mass;
    public final  int volumeTank;
    public final  int volumeEngine;

    CarBodyVariants(String name,int mass,int volumeTank,int volumeEngine){
        this.name=name;
        this.mass=mass;
        this.volumeEngine=volumeEngine;
        this.volumeTank=volumeTank;
    }
}