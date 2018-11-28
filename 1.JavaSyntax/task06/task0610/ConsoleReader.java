package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String stroka = reader.readLine();
return stroka;
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader1.readLine());
        return a;
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
 BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        double b = Double.parseDouble(reader2.readLine());
return b;
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        Boolean c = Boolean.parseBoolean(reader3.readLine());
return c;
    }

    public static void main(String[] args) {

    }
}
