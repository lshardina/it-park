package Lesson8;

public class Zoo {

    public static void main(String[] args) {
        Mlekopit cat = new Mlekopit("Кошка", "мяукает");
        Fish forel = new Fish("Форель");
        Birds vorona = new Birds("Ворона", "каркает");

        Animal[] zoo = new Animal [] {cat, forel, vorona} ;
        for (Animal animal : zoo) {
            animal.setKlass();
        }

        cat.voices();
        forel.voices();
        vorona.voices();

    }


}
