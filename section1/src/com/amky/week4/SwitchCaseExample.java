package com.amky.week4;

public class SwitchCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r1 = (int)(Math.random()*4)+1;
		int serviceSize = 0;
		System.out.println("Random Number :"+r1);
		switch(r1){
		case 1:
			serviceSize=3;
			break;
		case 2:
			serviceSize=8;
			break;
		case 3:
			serviceSize=10;
			break;
		default:
			serviceSize=99;
		} //end of switch
		if(serviceSize==99){
			System.out.println("We only serve Small/Medium/Large");
		}else{
			System.out.println("My random number is: "+r1+" My serving Size:"+serviceSize);

		}
		

	}

}
