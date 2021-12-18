package lesson12.homeWork.myException;

public class MyArrayDataException extends NumberFormatException {
    private int m;
    private int n;
    private String value;

    public MyArrayDataException(int m, int n, String value, String message) {
        super(message);
        this.m = m;
        this.n = n;
        this.value = value;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public String getValue() {
        return value;
    }
}
