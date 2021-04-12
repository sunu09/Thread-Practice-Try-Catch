package com.tts;

//if you want to print "Bye" at the end, you can add  System.out.println("Bye").
//but it will print bye after 1st Hi. Because there is a defaul main thread and
// while pausing for 2nd thread to work, it will push Bye.
// to stop it, we need to use .join
//add "throws Exception in main method.

//isAlive method is to detect if the thread is in running state or not.
//if it is used before join, it shows true in the print.
//if it is used after join, it shows false.


public class JoinAndAlive {
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

        t1.start();
        try{Thread.sleep(50);} catch(Exception e){}
        t2.start();

       // System.out.println(t1.isAlive());
        t1.join();
        t2.join();
        System.out.println(t2.isAlive());
        System.out.println("Bye");


    }

}
