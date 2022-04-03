package Lesson9;

public class Car extends Automobile {

    public Car(String name) {
        super(name);
    }

    public void move(int distance) {
        if (distance <= 500) {
            System.out.println("Автомобиль " + this.name + " легко проедет расстояние " + distance + " км на одном баке");
        } else {
            System.out.println("Автомобиль " + this.name + " не преодолеет расстояние " + distance + " км без дозаправки");
        }

    }
}
