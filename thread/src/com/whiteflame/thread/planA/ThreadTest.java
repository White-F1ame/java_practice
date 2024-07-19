package com.whiteflame.thread.planA;

public class ThreadTest {
    /**
     * 练习线程的创建
     */
    public static void main(String[] args) {
        //一种是将类声明为Thread的子类。
        // 此子类应覆盖类Thread的run方法。
        // 然后可以分配和启动子类的实例
        ForThread f = new ForThread();
        f.start();
        //主线程执行
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行第" + i + "次");
        }
    }
}
