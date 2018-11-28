package com.javarush.task.task08.task0828;

import java.io.IOException;

/* 
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> months = new ArrayList<String>(Arrays.asList(new String[]{
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "October",
                "September",
                "November",
                "December"}));

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int index = months.indexOf(s);
        if (index < 0)
            return;

       // System.out.printf("%s is %d month\n", months.get(index), index + 1);
        System.out.println(s + " is " + (months.indexOf((s)) + 1 + " month"));
    }
}
