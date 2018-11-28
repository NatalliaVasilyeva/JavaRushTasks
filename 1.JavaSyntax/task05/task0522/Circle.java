package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    
    public Circle(){}
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle(double x, double radius) {
        this.x = x;
        this.y = x;
        this.radius = radius;
    }
    public Circle(double x) {
        this.x = x;
        this.y = 1;
        this.radius = 0;
    }
    public Circle(Circle copy) {
        this.x = copy.x;
        this.y = copy.y;
        this.radius = copy.radius;
    }
    


    public static void main(String[] args) {

    }
}