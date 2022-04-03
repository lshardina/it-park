package Lesson9;

public class Truck extends Automobile {

    public Truck(String name) {
        super(name);
    }

    public void move(int distance) {
        if (distance <= 1200) {
            System.out.println("Грузовик " + this.name + " запросто проедет " + distance + " км на одном баке");
        } else {
            System.out.println("Грузовик " + this.name + " не преодолеет дистанцию " + distance + " км без дозаправки");
        }

    }
}
