package lesson12.homeWork;


import lesson12.homeWork.myException.MyArrayDataException;
import lesson12.homeWork.myException.MyArraySizeException;

public class ArraysRunner {

    public static void main(String[] args) {

        Arrays arr1 = new Arrays("1");     //Генерируем матрицу по умолчанию 4*4
        arr1.setArray(0, 0, "5322"); //Заполняем произвольные значения в таблицу
        arr1.setArray(0, 1, "231");
        arr1.setArray(0, 2, "90");
        arr1.setArray(0, 3, "4");
        arr1.setArray(1, 0, "53223");
        arr1.setArray(1, 1, "56");
        arr1.setArray(1, 2, "100");
        arr1.setArray(2, 0, "0");
        arr1.setArray(2, 1, "0");
        arr1.setArray(2, 2, "&^*");
        arr1.setArray(2, 3, "979");
        arr1.setArray(3, 0, "1");

        Arrays arr2 = new Arrays("2", 2, 5); // Генерируем матрицу произвольного размера
        arr2.setArray(0, 0, "9");          //Заполняем произвольные значения в таблицу
        arr2.setArray(0, 1, "4");
        arr2.setArray(0, 2, "6");
        arr2.setArray(1, 0, "2");
        arr2.setArray(1, 1, "1");
        arr2.setArray(1, 2, "5");
        arr2.setArray(1, 3, "2");
        arr2.setArray(1, 4, "2");

        Arrays arr3 = new Arrays("3");      //Генерируем матрицу по умолчанию 4*4
        arr3.setArray(0, 0, "204");   //Заполняем произвольные значения в таблицу
        arr3.setArray(0, 1, "77");
        arr3.setArray(0, 2, "100");
        arr3.setArray(0, 3, "1");
        arr3.setArray(1, 0, "1");
        arr3.setArray(1, 1, "0");
        arr3.setArray(1, 2, "1");
        arr3.setArray(2, 0, "5");
        arr3.setArray(2, 1, "1");
        arr3.setArray(2, 2, "39");
        arr3.setArray(2, 3, "86");
        arr3.setArray(3, 0, "33");
        arr3.setArray(3, 1, "22");
        arr3.setArray(3, 2, "18");
        arr3.setArray(3, 3, "61");

        Arrays[] allArrays = new Arrays[]{arr1, arr2, arr3};
        for (Arrays array : allArrays) {
            array.printArray();
            try {
                array.controlSize();
                array.summArray();
            } catch (MyArraySizeException exception1) {
                System.out.println("Размерность матрицы " + array.getName() + " не соответствует нормативу: 4*4, дальнейший расчет невозможен");
                System.out.println("-----------------------------------------------------------------------------------------");
            } catch (MyArrayDataException exception2) {
                System.out.println("Значение массива в строке " + (exception2.getM() + 1) + " столбца " + (exception2.getN() + 1) + " имеет не корректный формат: \""
                        + exception2.getValue() + "\"");
                System.out.println("Дальнейший расчет невозможен");
                System.out.println("------------------------------------------------------------------------------------");
            }
        }
    }
}
