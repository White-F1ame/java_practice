package com.whiteflame.d8_interface_new;

public interface A {
    //抽象
    void test();

    //jdk8后的一些新增方法
    //使用 default 修饰的方法,只能由实现类对象调用
    default void test1(){
        System.out.println();
    }

    //jdk9后开始
    //使用 private 修饰的方法
    private void test2(){
        System.out.println("只支持在本接口内调用");
    }

    //使用 static 修饰的类方法 ,只能使用接口名访问,默认public
    static void test3(){

    }
}
class B implements A{

    @Override
    public void test() {

    }

}
class Test{
    public static void main(String[] args) {
        A.test3();//支持接口名调用
        //A.test1();
        new B().test1();//只能用实现类对象调用
    }
}