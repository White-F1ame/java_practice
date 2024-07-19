package com.whiteflame.thread.planC;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadTest {
    /**
     * 创建线程的第三种方法：利用Callable接口、FutureTask类来实现<p>
     * 1. 创建任务对象<p>
     * 	1. 定义一个类实现Callable接口，重写call方法，封装要做的事，和要返回的数据<p>
     * 	2. 把Callable接口类型的对象封装成FutureTask（线程任务对象）<p>
     * 2. 把线程任务对象交给Thread对象<p>
     * 3. 调用Thread对象的start方法启动线程<p>
     * 4. 线程执行完毕后，通过FutureTask对象的get方法取获取线程任务执行的结果<p>
     */
    public static void main(String[] args) throws Exception {
        Callable<String> callable = new CallableImpl("小龙女");
        FutureTask<String> f = new FutureTask<>(callable);
        new Thread(f).start();

        //如果执行到这里加入上面的线程还没有执行完毕，这里会暂停，
        // 直到上面执行完毕后才继续
        String fReturnValue = f.get();
        System.out.println(fReturnValue);

    }
}
