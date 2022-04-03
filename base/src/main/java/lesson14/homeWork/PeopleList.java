package lesson14.homeWork;

import java.util.List;
import java.util.Random;


public class PeopleList {

    String family;
    int numberPhone;

    private static final List<String> FAMILII = List.of("Смирнов", "Иванов", "Кузнецов", "Соколов", "Попов", "Петров", "Лебедев",
            "Козлов", "Новиков", "Морозов", "Волков", "Соловьёв", "Васильев", "Зайцев", "Павлов", "Семёнов", "Виноградов", "Богданов",
            "Богданов", "Воробьёв", "Фёдоров", "Михайлов", "Беляев", "Сидоров", "Белов", "Комаров", "Орлов", "Киселёв", "Макаров",
            "Андреев", "Ковалёв", "Ковалёв", "Ильин", "Гусев", "Титов", "Кузьмин", "Кудрявцев", "Баранов", "Куликов", "Алексеев",
            "Степанов", "Яковлев", "Сорокин", "Сергеев", "Романов", "Захаров", "Борисов", "Королёв", "Денисов", "Пономарёв", "Григорьев");

    public PeopleList(int value) {
        int randomIndex1 = new Random().nextInt(FAMILII.size());
        this.family = FAMILII.get(randomIndex1);
        this.numberPhone = value;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    @Override
    public String toString() {
        return "Абонент{" +
                "Фамилия='" + family + '\'' +
                ", абонентский номер = +7-999-" + numberPhone +
                '}';

    }

}
