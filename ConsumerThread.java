package by.minsk.itakademy.arturzimin;

import java.io.IOException;
import java.util.Collection;

public class ConsumerThread extends Thread {

    public  void run() {


        while (Main.count<100) {

            synchronized (this){
            while (Main.queue.size() == 0) {
                try {
                    wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            Main.queue.remove();//возвращает элемент из начала очереди ,и удаляет

            Main.count++;

            System.out.println("Consumer " + Thread.currentThread().getName() + " ");
            notify();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

    }
    }
}
