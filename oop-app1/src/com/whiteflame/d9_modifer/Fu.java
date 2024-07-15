package com.whiteflame.d9_modifer;

public class Fu {
    //private:本类 中可调用
    private void privateMethod(){
        System.out.println("private");
    }
    //缺省default:本类/同包下的其他类 中可调用
    void  defaultMethod(){
        System.out.println("default");
    }
    //protected:本类/同包下的其他类/不同包下的子类 中可调用
    protected void protectedMethod(){
        System.out.println("protected");
    }
    //public:本类/同包下的其他类/不同包下的子类/不同包下的其他类 中可调用
    public void publicMethod(){
        System.out.println("public");
    }

    //本类下调用
    public void test(){
        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }
}
