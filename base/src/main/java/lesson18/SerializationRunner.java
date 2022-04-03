package lesson18;

import lesson18.dto.Person;
import lesson18.dto.Sex;
import lombok.SneakyThrows;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationRunner {

    @SneakyThrows
    public static void main(String[] args) {
        Person petrovPetr = new Person("Petrov Petr",48, Sex.MALE, 175);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\test\\person.dat"))) {
            oos.writeObject(petrovPetr);
        }
    }
}
