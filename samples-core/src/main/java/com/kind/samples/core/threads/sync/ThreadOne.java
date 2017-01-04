/**
 * Project Name:java-core
 * Package Name:com.kind.core.thread.sync
 * Created on:2016年9月19日下午3:36:29
 * Copyright (c) 2016, http://www.mcake.com All Rights Reserved.
 */

package com.kind.samples.core.threads.sync;

/**
 * Function: TODO ADD FUNCTION. <br/>
 *
 * @author weiguo.liu
 * @see
 * @since JDK 1.7
 */
public class ThreadOne implements Runnable {
    private InvokedObject object;

    public ThreadOne(InvokedObject object) {
        this.object = object;
    }

    public void run() {
        object.sync1();
    }
}
