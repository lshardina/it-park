package Lesson8;

public class Animal {

    private String klass; // К какому классу относится
    private String name;  // Название животного
    private String voice; // издаваемый звук

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String voice) {
        this.name = name;
        this.voice = voice;
    }

    public void voices() {
        System.out.println(name + " - это " + klass + ", он(а) " + voice);
    }

    public String getName() {
        return name;
    }

    public String getKlass() {
        return klass;
    }

    public void setKlass() {
        if (this instanceof Birds) {
            this.klass = "Птица";
        } else if (this instanceof Mlekopit) {
            this.klass = "Млекопитающее";
        } else {
            this.klass = "Рыба";
        }
    }

}

