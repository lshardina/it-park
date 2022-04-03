package lesson19.dto;

import lesson19.DefaultValue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class Car implements Moveable, IVehicle {

    private static final String VALUE = "15";


    private final String mark;
    private final String model;
    private final double width;
    @Setter
    private Double heigth;

    public Car() {
        this("NoName", "NN", -1d);
    }

    @Override
    public void move() {
        System.out.printf("Находится в движении автомобиль %s %s\n", mark, model);
    }

    public String getMarkAndModel(@DefaultValue(VALUE) Integer digit) {
        return String.format("%s %s %d", mark, model, digit);
    }

    @DefaultValue("1.3")
    public Double getHeigth() {
        return heigth;
    }
}
