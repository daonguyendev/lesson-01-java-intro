package com.codegym.operator;

public class IncreaseDecrease {
    public static void main(String[] args) {
        // Toán tử a++
//        int a = 3;
//        if (a++ > 2) { //a>2 -> 3>2 -> +1 -> a=4
//            a++; // a=4 -> +1 -> a=5
//            System.out.println(a); //5
//        }
//        System.out.println(a); //5

//        int a = 2;
//        if (a++ > 2) {//a>2 -> 2>2 (false) -> ++ -> a=3
//            a++;
//            System.out.println(a);//không chạy
//        }
//        System.out.println(a);//3

        // Toán tử ++a
        int a = 2;
        if (++a > 2) {//++ -> a=3
            ++a;
            System.out.println(a);//4
        }
        System.out.println(a);//4
    }
}
