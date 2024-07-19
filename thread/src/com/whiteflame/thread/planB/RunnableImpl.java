package com.whiteflame.thread.planB;

/**
 * 创建线程的另一种方法是声明一个实现Runnable接口的类。 该类然后实现run方法。 然后可以分配类的实例，在创建Thread时作为参数传递，然后启动。
 */
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        //线程中会执行的代码
        for (int i = 0; i < 5; i++) {
            System.out.println("--子线程执行第" + i + "次");
        }
    }
}
