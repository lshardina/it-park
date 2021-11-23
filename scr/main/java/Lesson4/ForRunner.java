package Lesson4;

public class ForRunner {

    public static void main(String[] args) {
        //int globalCounter;
        for (int counter = 1; counter <=100; counter +=10) {
            System.out.println("текущее значение счетчика: " + counter);
            if (counter > 50) {
                break;
            }
        }
        System.out.println("------");
//        for(;;) {
//            System.out.println(globalCounter ++);
//        }
    }
}
