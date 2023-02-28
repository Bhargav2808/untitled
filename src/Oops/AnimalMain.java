package Oops;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Oops.Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");
        dog d = new dog();
        doAnimalStuff(d, "fast");

        dog yorkie = new dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");
        dog retriver = new dog("Labrodar retriver", 65, "floppy", "Swimmer");
        doAnimalStuff(retriver, "slow");

        dog wolf = new dog("Wolf", 65);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");
    }
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
