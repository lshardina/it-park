package Lesson4;

public class WhileRunner {

    public static void main(String[] args) {
        int counter = 1;
        while(counter <= 11) {
            System.out.println(counter++);
        }
        System.out.println("--------------");
        do {
            System.out.println(counter + 1);
        } while (counter <= 9);
    }
}
