package com.tts;

//Lambda expression is to make code short and cleaner.
// Now replace unnecessary code and replace with () ->
//Runnable obj1 is used one time. So we can put code inside thread and remove Runnable obj1 and Runnable obj2
//We are using anonymous class

public class LambdaExpression {
    public static void main(String[] args) {



        Runnable obj2 = () ->{
                for (int i=0; i<5; i++) {
                    System.out.println("Hello");
                    try {Thread.sleep(500);} catch (Exception e) {}
                }
        };

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

        // obj1.show();
        //  obj2.show();

    }
}
