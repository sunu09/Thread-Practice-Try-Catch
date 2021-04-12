package com.tts;

//when you use (t1.getPriority()) it will shows 5 because priority runs 1-10
//    // there are two threads meand 5,5
//    // you can set priority mannually by number or by using(Thread.MIN_PRIORITY)

public class ThreadPriority {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() ->{
            for (int i=0; i<5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        });
        Thread t2 = new Thread(() ->{
            for (int i=0; i<5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        });

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

   //     t1.setPriority(1);
   //     t2.setPriority(10);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        try{Thread.sleep(50);} catch(Exception e){}
        t2.start();


        t1.join();
        t2.join();
        System.out.println(t2.isAlive());
        System.out.println("Bye");


    }

}
