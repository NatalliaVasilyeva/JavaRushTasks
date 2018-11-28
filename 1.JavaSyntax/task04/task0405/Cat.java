package com.javarush.task.task04.task0405;

/* 
Реализовать метод setCatsCount
*/

public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        Cat.catsCount = catsCount;
        System.out.println(Cat.catsCount);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setCatsCount(5);
    }
}