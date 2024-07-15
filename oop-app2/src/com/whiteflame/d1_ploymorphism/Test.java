package com.whiteflame.d1_ploymorphism;

public class Test {
    public static void main(String[] args) {
        //对象多态
        People student = new Student();
        People teacher = new Teacher();

        //行为多态
        student.run();
        teacher.run();

        System.out.println(student.name);
        System.out.println(teacher.name);

        //多态下不能调用子类方法
        //student.study();
        //teacher.teach();

        //可以通过转型来调用子类方法
        //转型错误会报ClassCastException异常
        //teacher = (Student)teacher;
        Teacher t = (Teacher)teacher;
        t.teach();
        ((Student)student).study();
    }
}
