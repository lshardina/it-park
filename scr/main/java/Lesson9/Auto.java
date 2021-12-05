package Lesson9;

public class Auto {

    public static void main(String[] args) {
        int distance = (int) (Math.random() * 1600);

        Car honda = new Car("Honda");
        Automobile nissan = new Car("Nissan");
        Truck mercedes = new Truck("Mercedes");
        Automobile kamaz = new Truck("Kamaz");

        Automobile[] garage = new Automobile[]{honda, nissan, mercedes, kamaz};

        for (Automobile auto : garage) {
            auto.move(distance);
        }
    }
}
