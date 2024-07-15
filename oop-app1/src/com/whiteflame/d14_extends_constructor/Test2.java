package com.whiteflame.d14_extends_constructor;

public class Test2 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("张三",30,"skate");
        System.out.println(teacher.getName()+teacher.getAge()+ teacher.getSkill());
    }
}
class People{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends People{
    private String skill;

    public Teacher(String name, int age, String skill) {
        super(name, age);//调用父类有参构造
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
