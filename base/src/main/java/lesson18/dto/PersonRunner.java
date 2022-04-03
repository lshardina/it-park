package lesson18.dto;

import lombok.SneakyThrows;

public class PersonRunner {

    @SneakyThrows
    public static void main(String[] args) {
        Person person = new Person("Ivanov Ivan");
        person.setAge(33);
        Person person2 = new Person();
        Person person3 = new Person("Petrov", 35, Sex.MALE, 180);
        person.beOlder();

    }


}
