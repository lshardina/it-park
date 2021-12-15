package lesson12.homeWork;


public class ArraysRunner {

    public static void main(String[] args) {

        Arrays arr1 = new Arrays("1");     //Генерируем матрицу по умолчанию 4*4
        arr1.setArray(1, 1, "5322"); //Заполняем произвольные значения в таблицу
        arr1.setArray(3, 0, "WORD");

        Arrays arr2 = new Arrays("2", 2, 8); // Генерируем матрицу произвольного размера
        arr2.setArray(0, 1, "789");          //Заполняем произвольные значения в таблицу
        arr2.setArray(1, 5, "400");

        Arrays arr3 = new Arrays("3");      //Генерируем матрицу по умолчанию 4*4
        arr3.setArray(3, 0, "204");   //Заполняем произвольные значения в таблицу
        arr3.setArray(1, 2, "777");
        arr3.setArray(0, 3, "1000");
        arr3.setArray(2, 1, "1");


        Arrays[] allArrays = new Arrays[]{arr1, arr2, arr3};
        for (Arrays array : allArrays) {
            array.printArray();
            try {
                array.controlSize();
                array.summArray();
            } catch (MyArraySizeException exception) {
            } catch (MyArrayDataException exception) {
            }
        }
    }
}
