package com.amky.arraylist;

import java.util.ArrayList;
import java.util.List;

public class SimpleArraySort {

	List<Integer> numbersArray = new ArrayList<>();
	List<Integer> sortedArray=new ArrayList<>();

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleArraySort simplearraysort = new SimpleArraySort();
		simplearraysort.loadArray();
		simplearraysort.sortArray();
		for(int i=0;i<simplearraysort.getNumbersArray().size();i++){
			System.out.println("Array:"+i+" = "+simplearraysort.getArraypositionvalue(i));
		}

	}
	
	public void loadArray(){
		for(int i=0; i<10;i++){
			numbersArray.add((int) (Math.random() *100) +1);
		}
	}
	
	public int getArraypositionvalue(int position){
		return numbersArray.get(position);
	}
	
	public List<Integer> getNumbersArray() {
		return numbersArray;
	}

	public void setNumbersArray(List<Integer> numbersArray) {
		this.numbersArray = numbersArray;
	}
	

	public List<Integer> sortArray(){
		//2,5,6,4,8
		System.out.println(numbersArray);
		for(int i=numbersArray.size()-1; i>=0;i--){
			for(int j=1 ; j<=i; j++){
				if (numbersArray.get(j-1) > numbersArray.get(j))
		         {
					int temp = numbersArray.get(j-1);
					numbersArray.set(j-1, numbersArray.get(j));
					numbersArray.set(j, temp);
		         }
			}
			System.out.println(numbersArray);
		}
		return numbersArray;
	}

}
