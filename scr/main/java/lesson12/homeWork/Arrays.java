package lesson12.homeWork;


public class Arrays {

    private final int m;
    private final int n;
    private String name;
    private String[][] array;

    public Arrays(String name) {
        this(name,4, 4);
    }

    public Arrays(String name, int m, int n) {
        this.m = m;
        this.n = n;
        this.name = name;
        this.array = new String[m][n];
    }

    public void setArray(int m, int n, String value) {
        this.array[m][n] = value;
    }

    public void printArray() {
        System.out.println("Матрица " + this.name + " имеет вид:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.print(" \n");
        }
    }

    public void summArray() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == null) {
                    sum += 0;
                } else {
                    try {
                        sum += Integer.parseInt(this.array[i][j].trim());
                    } catch (NumberFormatException exception) {
                    throw new MyArrayDataException(i,j,this.array[i][j]);
                }
                }
            }
        }
        System.out.println("Сумма членов матрицы " + this.name + " равна: " + sum);
        System.out.println("---------------------------------------------------------");
    }

//    public String getName() {
//        return name;
//    }

    public void controlSize() {
         if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException(this.name);
        }
    }
}
