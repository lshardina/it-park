package lesson12.homeWork;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException(String name) {
        System.out.println("Размерность матрицы " + name + " не соответствует нормативу: 4*4, дальнейший расчет невозможен");
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
