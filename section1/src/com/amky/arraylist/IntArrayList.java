package com.amky.arraylist;

import java.util.ArrayList;
import java.util.List;

public class IntArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbersArray = new ArrayList<>();
		
		numbersArray.add(5);
		numbersArray.add(2);
		for(int i=0;i<2;i++)
			System.out.println(numbersArray.get(i));
		
		if(numbersArray.get(0)>numbersArray.get(1)){
			int temp=numbersArray.get(0);
			numbersArray.set(0, numbersArray.get(1));
			numbersArray.set(1, temp);
		}
		System.out.println("Printing after swap");
		for(int i=0;i<2;i++)
			System.out.println(numbersArray.get(i));
		
	}

}
