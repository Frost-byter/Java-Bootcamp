package Week8;

//public class threads {

    //threads exist to do some job
    //they do some job as a background process
    //every thread needs an implementation of the run method
    //threads run seperately from the main thread, the main thread does not wait
    //for threads to finish before it continues running
    // threads don't start until you tell it to start using the start() method
    public static void main(String[] args){
//
//        threads();
//
    }
//   // public static void threads() {
////
////        Thread t1 = new Thread(() -> System.out.println("this is a thread1"));
////        Thread t2 = new Thread(() -> System.out.println("this is a thread2"));
////
////        //try {
////        //the parent class of a thread is an interface called runnable
////        //the join method tells the main thread to wait until these finish running before continuing
////        t1.start();
////        t2.start();
////        //}catch(InterruptedException ex){
////        //  ex.printStackTrace();
////        //}
//////can hand a thread a runnable
//////        Thread t3 = new Thread(new Runnable() {
//////            @Override
//////            public void run() {
//////                System.out.println("Threads through a runnable");
//////            }
//////        });
//////        }
//////    }
////
////    }