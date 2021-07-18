package by.minsk.itakademy.arturzimin;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public  static  Queue<Integer> queue = new ArrayDeque<>(200);
    public static int count = 0;


    public static void main(String[] args) throws InterruptedException {



        Thread producer = new Thread(new ProducerThread());

        Thread producer1 = new Thread(new ProducerThread());
        Thread producer2 = new Thread(new ProducerThread());

        Thread consumer = new Thread(new ConsumerThread());
        Thread consumer1 = new Thread(new ConsumerThread());
        producer.start();
        producer1.start();
        producer2.start();
        consumer.start();
        consumer1.start();






    }
}
