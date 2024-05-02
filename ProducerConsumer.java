package com.thread.lab_9;

class SharedResource {
    private int count = 0;
    private boolean valueSet = false;

    public synchronized void produce() throws InterruptedException {
        while (valueSet) {
            wait();
        }

        count++;
        System.out.println("Produced: " + count);
        valueSet = true;
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (!valueSet) {
            wait();
        }

        System.out.println("Consumed: " + count);
        valueSet = false;
        notify();
    }
}

class Producer implements Runnable {
    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            sharedResource.produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            sharedResource.consume();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Producer producer = new Producer(sharedResource);
        Consumer consumer = new Consumer(sharedResource);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}
