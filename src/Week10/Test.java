package Week10;

import java.util.Random;

public class Test {

    public static void main(String[] args){

        for (int i = 0; i <= 5; ++i){

            System.out.println(i);
        }

        Integer a = 5;
        Integer b = 6;


        System.out.println(a + b);

        Random rand = new Random();
        ProducerConsumer2 pcThread = new ProducerConsumer2();

        Thread producer = new Thread(() -> {

            int data;

            try {

                for (int i = 0; i < 5; i++){

                    data = rand.nextInt(25 - 17) + 17;

                    pcThread.produce(data);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }

        });

        Thread consumer = new Thread(() -> {

            int data;

            try{

                for (int i = 0; i < 5; i++){

                    data = rand.nextInt(55 - 8) + 8;

                    pcThread.consume(data);
                    Thread.sleep(1000);
                }
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }

        });

        producer.start();
        consumer.start();

        try{
            producer.join();
            consumer.join();
        }catch (InterruptedException ex){

            ex.printStackTrace();
        }
    }
}
