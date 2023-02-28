package Oops;

public class Fish extends Animal{
    private int fins;
    private int gills;

    public Fish(String type, double weight, int fins, int gills) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscles(){
        System.out.println("Muscle Moving...");
    }

    private void moveBackFins(){
        System.out.println("Backfin Moving...");
    }

    @Override
    public String toString() {
        return "Oops.Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed=="fast"){
            moveBackFins();
        }
        System.out.println();
    }
}
