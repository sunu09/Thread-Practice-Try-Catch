package com.tts;
//the next method is to implement Runnable instead of "extends Thread" but it gives error message to implement start();
//To solve the problem, now create Thread and call Ojb1 inside Thread and call t1.start():

class Hi implements Runnable {
    //    public void show()
    public void run()
    {
        for (int i=0; i<5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }

}

class Hello implements Runnable {
    //    public void show()
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

public class UseRunnable {
    public static void main(String[] args) {
        // write your code here
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

       t1.start();
        try{Thread.sleep(50);} catch(Exception e){}
        t2.start();

        // obj1.show();
        //  obj2.show();

    }
}

