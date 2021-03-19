public class Multi extends Thread{
            public void run(){
                for(int a=0;a<=4;a++){
                    try{
                        Thread.sleep(1400);
                    }
                    catch(InterruptedException e)
                    {
                        System.out.println(e);
                    }
                    System.out.println(a);
                }
            }
            public static void main(String args[]){
                Multi m=new Multi();

                m.start();

            }
        }
