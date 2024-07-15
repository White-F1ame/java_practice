package com.whiteflame.d7_gemerics_method;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //定义一个方法，这个方法要求是泛型方法限定类型
        //Car car = new Car();
        //System.out.println(car.go("车"));

        //ArrayList<Car> list = new ArrayList<>();
        ArrayList<Audi> audis = new ArrayList<>();
        ArrayList<Plane> planes = new ArrayList<>();

        Audi audi = new Audi();
        Plane plane = new Plane();
        audis.add(audi);
        run(audis);
        planes.add(plane);
        //run(planes);//错误，planes不是Car子类集合或Car类的集合

        Vehicle vehicle = new Vehicle();
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        ArrayList<Car> cars = new ArrayList<>();
        Car car = new Car();
        vehicles.add(vehicle);
        cars.add(car);
        fly(vehicles);
        fly(cars);
    }
    //泛型上限：只能接收一个存Car的集合或Car子类的集合
    public static void run(ArrayList<? extends Car> cars){
        System.out.println("run!");
    }

    //泛型下限：只能接收一个存Car的集合或者其父类的集合。
    public static void fly(ArrayList<? super Car> cars){
        System.out.println("起飞！");
    }

}

class Audi extends Car{

}
class Plane extends Vehicle {
}
class Vehicle {}