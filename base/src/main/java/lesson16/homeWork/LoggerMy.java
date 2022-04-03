package lesson16.homeWork;

import java.util.Random;
import java.util.logging.Logger;

public class LoggerMy implements Runnable {
    String name;
    String description;
    Thread t;
    Logger log = Logger.getLogger(LoggerRunner.class.getName());


    LoggerMy(String name, String description) {
        this.name = name;
        this.description = description;
        t = new Thread(this, name);
        t.start();
        System.out.println("Запущен поток ошибок " + t);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                switch (this.name) {
                    case "Warning":
                        log.warning("В потоке: " + this.t + this.description);
                    case "Error":
                        log.warning("В потоке: " + this.t + this.description);
                    case "Info":
                        log.info("В потоке: " + this.t + this.description);
                }
                Thread.sleep(new Random().nextInt(5000));
            }
        } catch (InterruptedException e) {
            System.out.println("Поток " + name + " прерван.");
        }


    }

}
