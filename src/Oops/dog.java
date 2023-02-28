package Oops;

public class dog extends Animal{

    private String earShape;
    private String tailShape;

    public dog(String type, double weight){
        this(type, weight, "perly", "curled");
    }
    public dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight<15 ?"small":(weight<35?"medium":"large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Oops.dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public dog() {
        super("Mutt", "big", 50);
    }

    @Override
    public void makeNoise() {
        if(type == "Wolf"){
            System.out.println("Ow Wooooo! ");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);

        if(speed == "slow"){
            walk();
            wagTail();
        }
        else{
            run();
            bark();
        }
        System.out.println();
    }

    public void bark(){
        System.out.println("Woof!...");
    }
    public void run(){
        System.out.println("Oops.Dog Running...");
    }
    public void walk(){
        System.out.println(" Oops.Dog Walking...");
    }
    public void wagTail(){
        System.out.println("Tail Wagging...");
    }
}
