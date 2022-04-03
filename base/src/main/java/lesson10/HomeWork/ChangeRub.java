package lesson10.HomeWork;

public class ChangeRub implements Exchangable {
    public void exchange(int summ) {

        System.out.println(summ + " рублей Вы можете обменять на "
                + (summ / Currencies.DOLLAR.getCourse()) +
                " доллара(ов) или "
                + (summ / Currencies.EURO.getCourse()) + " евро.");
    }
}
