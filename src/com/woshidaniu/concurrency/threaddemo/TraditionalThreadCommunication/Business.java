package com.woshidaniu.concurrency.threaddemo.TraditionalThreadCommunication;

/**
 * Created by kang on 2018/7/2.
 */
public class Business{
    private boolean bShouldSub = true;

    public synchronized void sub(int i){
        while(!bShouldSub){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for(int j=1;j<=5;j++){
            System.out.println("sub threaddemo count "+j+","+i+"/50");
        }
        bShouldSub = false;
        this.notify();
    }
    public synchronized void main(int i){
        while(bShouldSub){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for(int j=1;j<=10;j++){
            System.out.println("main threaddemo count "+j+","+i+"/50");
        }
        bShouldSub = true;
        this.notify();
    }
}
