package com.whiteflame.d10_homework.test3;

// 以下代码是否有问题？为什么？如何解决？
interface  A{
   int x = 0;
}
class B{
   int x =1;
}
class C extends B implements A {
   public void pX(){
      //System.out.println(x);
   }
   public static void main(String[] args) {
      new C().pX();
   }
}