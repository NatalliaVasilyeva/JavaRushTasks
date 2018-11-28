package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            Zerg z = new Zerg();
            z.name="Zerg"+i;
        };
        
        for (int i=0; i<5; i++){
            Protoss p = new Protoss();
            p.name = "Protoss"+i;
        };
         for (int i=0; i<12; i++) {
             Terran t= new Terran();
             t.name = "Terran"+i;
         };
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
