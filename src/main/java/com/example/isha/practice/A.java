package com.example.isha.practice;

public class A {


    int[] arr = new int[10];
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.arr);
    }

    public void initialize()
    {
        for (int i = 0; i < 10; i++) {
            arr[i] = i * i;
        }
    }

    public void print()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }

    public void chnageValue(int index, int value)
    {
        arr[index] = value;
    }
}
