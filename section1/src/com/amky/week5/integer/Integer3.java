package com.amky.week5.integer;

public class Integer3
{
    public static void main(String[] arguments)
    {
        int i = 32767;
        System.out.println("i is " + i);
        i = i + 1;

        short s = (short) i;
        System.out.println("i + 1 is " + s);
    }
}
