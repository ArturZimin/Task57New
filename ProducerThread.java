package by.minsk.itakademy.arturzimin;

import java.util.Random;

public class ProducerThread extends Thread {

    Random random = new Random();

    public  void run() {


        while (Main.count<100) {

            synchronized (this){
            if (Main.queue.size() >= 100) {
                try {
                    System.out.println("Производитель сейчас заснет ");
                    wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            while (Main.queue.size() <= 80) {


                Main.queue.offer(random.nextInt(100));
                Main.count++;
            }




            System.out.println(" Producer " + Thread.currentThread().getName());
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




