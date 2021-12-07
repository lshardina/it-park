package lesson10.HomeWork;

public class ChangeEuro implements Exchangable {

    public void exchange(int summ) {

        System.out.println(summ + " Евро Вы можете обменять на "
                + (summ * Currencies.EURO.getCourse() / Currencies.DOLLAR.getCourse()) +
                " доллара(ов) или "
                + (summ * Currencies.EURO.getCourse()) + " рублей");
    }
}
