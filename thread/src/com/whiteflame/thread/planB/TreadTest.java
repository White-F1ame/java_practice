package com.whiteflame.thread.planB;

/**
 * 创建线程的另一种方法是声明一个实现Runnable接口的类。 该类然后实现run方法。 然后可以分配类的实例，在创建Thread时作为参数传递，然后启动。
 */
public class TreadTest {
    public static void main(String[] args) {
        //Runnable r = new RunnableImpl();
        //new Thread(r).start();
        //匿名内部类的写法
        new Thread(() -> {
            //线程中会执行的代码
            for (int i = 0; i < 5; i++)
                System.out.println("--子线程执行第" + i + "次");
        }).start();

        //主线程执行
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行第" + i + "次");
        }
    }
}


//if(use instanceof Mouse){
//    //如果类型对就强转
//}
//类型不对就进下一个，不用赋null给创建的对象，用null调方法会报空指针异常
//if(use instanceof Keyboard){
//    //如果类型对就强转
//}
