package Week10;

public class ProducerConsumer2 {

    private Object resources = new Object();
    private int bytes;

    public ProducerConsumer2(){

        this.bytes = 0;

    }

    public void produce(int data){

        synchronized (resources){

            System.out.println(Thread.currentThread() + " resources produced: " + data);

            bytes += data;

            resources.notifyAll();
        }
    }

    public void consume(int data){

        synchronized (resources){

            System.out.println(Thread.currentThread() + " Consumed resources: " + data);

            if (bytes < data){

                System.out.println(Thread.currentThread() + " waiting to consume, not enough resources available");

                    try{
                        resources.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                System.out.println(Thread.currentThread() + " Initializing wake up sequence");

            }

            System.out.println(Thread.currentThread() + " Data consumed in bytes: " + bytes);

            bytes -= data;
        }
    }
}
