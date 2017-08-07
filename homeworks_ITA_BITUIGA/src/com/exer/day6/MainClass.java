package com.exer.day6;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	
	
	
	public MainClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		List<Ball> originalBalls = new ArrayList<Ball>();
		List<Ball> baseBalls = new ArrayList<Ball>();
		List<Ball> diffBalls = new ArrayList<Ball>();
		List<Ball> heavyScale = new ArrayList<Ball>();
		Scale wScale = new Scale();
		Ball oddBall = null;
		
		List<Group<Ball>> subgroups = new ArrayList<Group<Ball>>();
		subgroups.add((Group<Ball>)originalBalls.subList(0, 3));
		subgroups.get(0).weight = wScale.calculateWeight(subgroups.get(0));
		subgroups.add((Group<Ball>)originalBalls.subList(4, 7));
		subgroups.add((Group<Ball>)originalBalls.subList(8, 11));
		
		
		
		int index = random(1,12);
		for(int i = 0; i < 12; i++) {
			if(i == index) originalBalls.add(new Ball(random(1,3)));
			else originalBalls.add(new Ball(2));
		}
		
		// Step 1
		heavyScale = wScale.weighScales(subgroups.get(0),subgroups.get(1));
		if(heavyScale == null && wScale.isEqual) {
			diffBalls = subgroups.get(2).subList(0, 2);
			baseBalls = subgroups.get(0).subList(0, 2);
			
			heavyScale = wScale.weighScales(diffBalls,baseBalls);
			
			if(heavyScale == null && wScale.isEqual) {
				oddBall = subgroups.get(2).get(3);
			}
			else {
				diffBalls = diffBalls.subList(0, 1);
				baseBalls = diffBalls.subList(2, 2);
				
				heavyScale = wScale.weighScales(diffBalls,baseBalls);
				
				if(heavyScale == null && wScale.isEqual) {
					oddBall = subgroups.get(2).get(3);
				}
			}
		}
		else {
			
		}
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
