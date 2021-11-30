package Lesson8;

public class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    public void voices() {
        System.out.println(getName() + " - это " + getKlass() + ", а рыбы не говорят");
    }
}
