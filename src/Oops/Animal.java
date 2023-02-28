package Oops;

public class Animal {
    protected String type;
    private String size;
    private double weight;

    @Override
    public String toString() {
        return "Oops.Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public void move(String speed){
        System.out.println(type + " moves " + speed);
    }
    public void makeNoise(){
        System.out.println(type + " makes such type of noise...");
    }
}
