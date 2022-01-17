package ru.gb.lesson1;

public class SumStrok {
        public static void main(String[] args) {
            checkSumSign();
        }

        public static void checkSumSign(){
            int a=3;
            int b=-4;
            int c=a+b;
            System.out.println(c >= 0? "Сумма положительная" : "Сумма отрицательная");
        }
}
