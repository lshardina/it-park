package lesson12.homeWork;

public class MyArrayDataException extends NumberFormatException {

    public MyArrayDataException(int m, int n, String value) {
        System.out.println("Значение массива в строке " + (m + 1) + " столбца " + (n + 1) + " имеет не корректный формат: \"" + value + "\"");
        System.out.println("Дальнейший расчет невозможен");
        System.out.println("------------------------------------------------------------------------------------");
    }
}
