package Lesson7;

public class HumanRunner {
    public static void main(String[] args) {
        Human me = new Human();
        me.name = "Liudmila";
        me.surname = "Shardina";
        me.age = 35;
        me.hasQrCode = true;
        me.weight = 65;
        me.height = 171;

        Human nataly = new Human();
        nataly.name = "Natalya";
        nataly.surname = "Ivanova";
        nataly.age = 48;
        nataly.hasQrCode = true;
        nataly.weight = 70;
        nataly.height = 160;
        nataly.hasQrCode = true;

        Human incognito = new Human("Unknown", "Unknown");

        Human vasyaPupkin = new Human("Vasiliy", "Pupkin", 50, -1, -1, null);

        System.out.println(me == vasyaPupkin);
        System.out.println(me == me);

        Human[] humans = new Human[]{nataly, me, incognito, vasyaPupkin};
        for (Human human : humans) {
            if (Integer.valueOf(50).equals(human.age)) {
                System.out.println("Человек с именем " + human.name + " и фамилией " + human.surname + " 50-летний");
            }
        }

        me.beOlder();
        System.out.println("Мне на следюущий год исполнится " + me.getAge());

        vasyaPupkin.vaccinated();
        System.out.println("Наличие кода " + vasyaPupkin.getHasQrCode());

        incognito.setName("Ivan");
        System.out.println("Ингонито раскрыл свое имя - " + incognito.getName());
    }
}
