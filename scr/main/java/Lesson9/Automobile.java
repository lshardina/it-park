package Lesson9;

public abstract class Automobile {

    String name;

    public Automobile(String name) {
        this.name = name;
    }

    abstract void move(int distance) ;
}
