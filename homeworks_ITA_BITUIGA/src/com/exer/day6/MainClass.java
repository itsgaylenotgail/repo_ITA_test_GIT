package com.exer.day6;

import java.util.ArrayList;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ArrayList<Ball> thisBalls = new ArrayList<Ball>();
		int index = random(1,12);
		for(int i = 0; i < 12; i++) {
			if(i == index) thisBalls.add(new Ball(random(1,3)));
			else thisBalls.add(new Ball(2));
		}
		Scale wScale = new Scale();
//		wScale.
		
	}
	
	static int random(int min, int max)
	{
		boolean ctr = false;
	   int range = (max - min) + 1;     
	   int rand = 0;
	   do {
		   rand = (int)(Math.random() * range) + min;
		   if(rand%2 == 0) ctr = true;
		   else ctr = false;
	   }while(ctr);
	   return rand;
	}
}
