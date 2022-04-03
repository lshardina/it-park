package lesson10.HomeWork;

import java.util.Scanner;

public class PointExchange {

    public static void main(String[] args) {

        int cod;
        int sum;
        System.out.println("В нашем пункте обмена Вы можете поменять рубли, доллары и евро.");
        System.out.println("Какую валюту нужно обменять? Введите: 1 - если у Вас рубли, 2 - доллары, 3 - евро:");
        Scanner scanner = new Scanner(System.in);
        cod = scanner.nextInt();
        System.out.println("Введите сумму, которую нужно обменять:");
        sum = scanner.nextInt();

        if (cod == 1) {
            Exchangable ex = new ChangeRub();
            ex.exchange(sum);
        } else if (cod == 2) {
            Exchangable ex = new ChangeDollar();
            ex.exchange(sum);
        } else {
            Exchangable ex = new ChangeEuro();
            ex.exchange(sum);
        }
    }


}
