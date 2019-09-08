package com.amky.week5.integer;

public class Integer4
{
    public static void main(String[] arguments)
    {
    	
        short i = 'A';
        //the short value of 'A' is an integer value of 'A' = 65
        
        System.out.println("i is " + i);
        i += 1;

        char a = (char) i;
        System.out.println("A + 1 is " + a);
    }
}