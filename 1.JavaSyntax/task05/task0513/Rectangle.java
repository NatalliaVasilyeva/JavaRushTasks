package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {

    int top;
    int left;
    int width;
    int height;

     public void initialize(int top, int left, int height, int width){  // тут всё понятно надеюсь
         this.top = top;
         this.left = left;
         this.height = height;
         this.width = width;
     }

      public void initialize(int top, int left){  // ширина и высота не заданы оба равны нулю
         this.top = top;
         this.left = left;
         this.height = 0;
         this.width = 0;
      }

       public void initialize(int top, int left, int width){   //высота не задана
         this.top = top;
         this.left = left;
         this.height = width ;  // высота равна ширине, так и пишем
         this.width = width; // ширина
       }

        public void initialize(Rectangle re){  // вызываем наш объект по Классу и присваиваем значения из нашего прямоугольника, тем самым создавая копию
         re.top = top;
         re.left = left;
         re.height = height;
         re.width = width;
        }



    public static void main(String[] args) {
        Rectangle re = new Rectangle();  // Я создал объект re класса Rectangle

    }
}
