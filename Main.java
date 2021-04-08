package com.tts;

//create class hi and class hello
//to repeat 5 times, use for loop
//to print second line after first line, use try and catch method
//to print hi hello hi hello - two classes need to be parallel. For that we need to extends Thread
//Once you extends thread, the normal class Hi and Class Hello become Threads.(no more normal class)
//the object also becomes thread too.(you can call obj1.start(); and obj2.start();
//when you call start() method, it will always call run method of thread internally. Now we need to replace show with run.
//there is two Hi instead of Hi Hello. When threads go to execution, both threads are reaching to schedule at same time.
// there is no priority and may pick anyone (random order).
//we can have delay option add try{Thread.sleep(50);} catch (Exception e) {} to prioritize.

class Hi extends Thread {
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

class Hello extends Thread{
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

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start();
        try{Thread.sleep(50);} catch(Exception e){}
        obj2.start();

       // obj1.show();
      //  obj2.show();

    }
}
