package com.exer.day6;

import java.util.ArrayList;
import java.util.List;

public class Scale {
	
	
	public Group<Ball> heavy ;
	public Group<Ball> light ;
	public boolean isEqual = false;
	
	public int useScale = 3;
	
	public Scale() {
		// TODO Auto-generated constructor stub
	}
	
	public Group<Ball> weighScales(Group<Ball> left, Group<Ball> right){
		if(calculateWeight(left) > calculateWeight(right)) {
			this.heavy = left;
			this.light = right;
		}
		else if(calculateWeight(left) < calculateWeight(right)) {
			this.heavy = right;
			this.light = left;
		}
		else {
			this.heavy = null;
			this.light = null;
			this.isEqual = true;
		}
		return this.heavy;
	}
	
	public int calculateWeight(Group<Ball> balls) {
		int sumOfWeights = 0;
		
		for(Ball currBall : balls) {
			sumOfWeights += currBall.weight;
		}
		
//		for(int i = 0; i < balls.size(); i++) {
//			
//		}
		
		return sumOfWeights;
	}
	
	public void resetScale() {
		this.heavy = null;
		this.light = null;
		this.isEqual = false;
	}

}
