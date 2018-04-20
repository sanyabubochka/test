public class Human {
    private String name;
    private int age;
    private int weight;

    Human(String name,int age,int weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    public void getInfo(){
        System.out.println(" name: "+name+" age: "+age+" weight: "+weight);
    }
    private void addAge(int a){
        age+=a;
    }
}

