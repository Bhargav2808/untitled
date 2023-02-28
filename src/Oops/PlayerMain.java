package Oops;

public class PlayerMain {
    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Tim";
        player.health=20;
        player.weapon="Sword";

        player.loseHealth(45);
        System.out.println("Remaining health is " + player.healthRemaining());
    }
}
