package Oops;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.describeCar();

        car.setMake("Porche");

        System.out.println(car.getMake());

    }
}