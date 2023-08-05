package assignment_18_05;

public class MutliThreading {
    public static void main(String[] args) {
        Thread1 obj1=new Thread1();
        Thread2 obj2=new Thread2();
        obj1.start();
        try{
            Thread.sleep(10);
        }catch (Exception e){}
 obj2.start();
    }
}

class Thread1 extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){

        try{
            Thread.sleep(5000);
            System.out.println("Hi, Im Thread1");
        }catch (Exception e){}}
    }
}

class Thread2 extends Thread{
    public void run() {
        for(int i=0;i<=5;i++){

        try{
            Thread.sleep(1000);
            System.out.println("Hi, Im Thread2");
        }catch (Exception e){}}
    }

}