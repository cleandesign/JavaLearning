package com.woshidaniu.concurrency.thread.DeadLock;

/**
 * Created by kang on 2018/7/3.
 */
public class Thread1 extends Thread
{
    private DeadLock dl;

    public Thread1(DeadLock dl)
    {
        this.dl = dl;
    }

    public void run()
    {
        try
        {
            dl.rightLeft();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
