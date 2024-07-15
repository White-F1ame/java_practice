package com.whiteflame.d10_homework.test4;

// 以下代码是否有问题？为什么？如何解决？
public class Something {
   public static void main(String[] args) {
       Other o = new Other();//指定了o的地址值
       new Something().addOne(o);
       //System.out.println(o.i);
   }
   public void addOne(final Other o) {//用final修饰o，此时o的地址值无法被二次修改
       o.i++;//o的实例变量i可以改变，i=1
   }
}
class Other {
   public int i;
} 