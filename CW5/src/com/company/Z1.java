package com.company;

public class Z1 {

    public static void main(String[] args) {
        int[] numbers =  new int[10];
        int n = 0;
        for(int i = numbers.length - 1 ; i >= 0 ; i--){
            numbers[n] = i ;
            n++;
        }

        for (int x: numbers){
            System.out.println(x);
        }
    }
}
