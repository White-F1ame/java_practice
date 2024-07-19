package com.whiteflame.thread.planA;

/**
 * 一种是将类声明为Thread的子类。 此子类应覆盖类Thread的run方法。 然后可以分配和启动子类的实例
 */
public class ForThread extends Thread {
    @Override
    public void run() {
        //线程中会执行的代码
        for (int i = 0; i < 5; i++) {
            System.out.println("--子线程执行第" + i + "次");
        }
    }
}
