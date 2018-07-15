package com.woshidaniu.concurrency.threaddemo.DeadLock;

/**
 * Created by kang on 2018/7/3.
 */
public class DeadLock
{
    private final Object left = new Object();
    private final Object right = new Object();

    public void leftRight() throws Exception
    {
        synchronized (left)
        {
            Thread.sleep(2000);
            synchronized (right)
            {
                System.out.println("leftRight end!");
            }
        }
    }

    public void rightLeft() throws Exception
    {
        synchronized (right)
        {
            Thread.sleep(2000);
            synchronized (left)
            {
                System.out.println("rightLeft end!");
            }
        }
    }
}