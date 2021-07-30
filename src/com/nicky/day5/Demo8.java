package com.nicky.day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThreadDemo implements Runnable{
    private String message;
    public WorkerThreadDemo(String message){
        this.message = message;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start message -> "+message);
        processMessage(); //sleeps for 2 seconds
        System.out.println(Thread.currentThread().getName()+" End message -> "+message);
    }
    private void processMessage(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class Demo8 {
    public static void main(String[] args) {
        //creates a pool of 5 threads
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i=0;i<10;i++){
            Runnable worker = new WorkerThreadDemo(" "+i);
            executorService.execute(worker);
        }
        executorService.shutdown();
        while(!executorService.isTerminated()){

        }
        System.out.println("finished all threads");
    }
}
