public class Multithread  implements  Runnable{
    public static void main(String args[])
    {
        Multithread mt=new Multithread();
        Thread t=new Thread();
        Thread t1=new Thread();
        mt.run();
        t.start();
        t1.start();
        System.out.println("Element 1: " +t.getName());
        System.out.println("Element 2 : " +t1.getName());
        t.setName("Thread");
        System.out.println("Set name1 :" +t.getName());
        t.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("The name for priority1 :"+t.getPriority());
        System.out.println("The name for priority2 :" +t1.getPriority());
    }

    public void run() {
        System.out.println("Thread is running");
    }
}

