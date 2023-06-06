package org.example;

public class RabbitRace {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i += 2) {
            RabbitThread rabbitThread = new RabbitThread(i);
            rabbitThread.start();
        }


        for (int i = 2; i <= 10; i += 2) {
            RabbitRunnable rabbitRunnable = new RabbitRunnable(i);
            Thread thread = new Thread(rabbitRunnable);
            thread.start();
        }
    }
}
