package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();


for (String s : list) // for (string s = 0 позиции; s позиция < list.size; s позиция ++)
        {
            if (result.get(s) != null) // если строка(ключ) найдена в result.hashmap
            {
                result.put(s, result.get(s) + 1);
// кладем эту строку(ключ)  и добавляем + 1 к значению,
// что по сути перепишет значение ключа с новым значением.
            }
            else
            {
                result.put(s,1); // если не найдена строка(ключ), то дописываем
            }
        }
        return result;
    }

}

