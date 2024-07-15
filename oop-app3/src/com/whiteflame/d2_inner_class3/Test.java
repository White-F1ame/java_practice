package com.whiteflame.d2_inner_class3;

class Test{
    public static void main(String[] args) {

        //创建了Animal类的子类的对象，重写了Animal中的run方法
        new Animal(){
            @Override
            public void run(){
                System.out.println("开跑就完了！");
            }
        };

        //匿名内部类也可以多态
        Animal cat = new Animal(){
            @Override
            public void run(){
                System.out.println("猫在跑");
            }
        };
        cat.run();

        //匿名内部类实现接口
        new A(){
            public void method(){
                System.out.println("实现了接口A");
            }
        };
    }
}
class Animal{
    public void run(){
        System.out.println("GO GO GO!");
    }
}

//接口
interface A{
    void method();
}


//效果等同于下面这个
class Dog extends Animal {
    @Override
    public void run(){
        System.out.println("狗在跑");
    }
}

class AImpl implements A{
    public void method(){
        System.out.println("实现了接口A");
    }
}

