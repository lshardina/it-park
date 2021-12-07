package lesson10.HomeWork;

public class ChangeDollar implements Exchangable {

    public void exchange(int summ) {

        System.out.println(summ + " долларов Вы можете обменять на "
                + (summ * Currencies.DOLLAR.getCourse() / Currencies.EURO.getCourse()) +
                " евро или "
                + (summ * Currencies.DOLLAR.getCourse()) + " рублей.");
    }
}
