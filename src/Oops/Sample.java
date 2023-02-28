package Oops;

abstract class Animal1 {
    public Animal1(String type, String size, int weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    private String type;
    private String size;
    private int weight;
    public abstract void move(String speed);
    abstract void makeNoise();
}

class dog1 extends Animal1{
    public dog1(String type, String size, int weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed == "slow"){
            System.out.println(this.getClass().getName() + " is Walking...");
        }
        else{
            System.out.println(this.getClass().getName() + " is Running...");
        }
    }

    @Override
    void makeNoise() {
        System.out.println(this.getClass().getName() + " is making noise...");
    }
}

class fish extends Animal1{
    public fish(String type, String size, int weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println("Always Moves Faster..");
    }

    @Override
    void makeNoise() {
        System.out.println("Fishes Don't Make Noises..");
    }
}
class Sample{
    public static void main(String[] args) {
        dog1 d = new dog1("Wolf", "big", 100);
        d.makeNoise();
        d.move("slow");
        fish f = new fish("GoldenFish", "Small", 10);
        doAnimalStuff(f);
        doAnimalStuff(d);
    }

    public static void doAnimalStuff(Animal1 animal){
        animal.move("fast");
        animal.makeNoise();
    }

}
