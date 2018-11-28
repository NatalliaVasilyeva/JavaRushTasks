package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat kotik1 = new Cat("Vasia",18,5, 5);
        Cat kotik2 = new Cat("Petia",5,6, 7);
        Cat kotik3 = new Cat("Molodec",1,4, 4);
            }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}