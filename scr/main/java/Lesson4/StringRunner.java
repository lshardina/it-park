package Lesson4;

public class StringRunner {
    public static void main(String[] args) {
        String text = "Война и мир. Начало \n и конец";
        text = text + " Еще фраза";
        text += " Еще \tчто-то"; // text = text + "Еще фраза"
        String str = "Hello, World \\";
        System.out.println(str);
        System.out.println(text);

        short value = 120;
        value +=4575757;

        System.out.println("Значение переменной = " + value);


    }
}
