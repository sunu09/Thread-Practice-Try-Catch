package com.tts;
// if you use,
// System.out.println(t1.getName());
// System.out.println(t2.getName()); --- it will give name of thread as thread 0, thread 1.
// you can give name to thread by using (t1.setName("Hi Thread").
// or can write down at the end of code by adding comma before semi-colon.
public class NamingThread {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() ->{
            for (int i=0; i<5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        }, "Hi Thread");
        Thread t2 = new Thread(() ->{
            for (int i=0; i<5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        }, "Hello Thread");

     //   t1.setName("Hi Thread");
     //  t2.setName("Hello Thread");
        System.out.println(t1.getName());
        System.out.println(t2.getName());

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
