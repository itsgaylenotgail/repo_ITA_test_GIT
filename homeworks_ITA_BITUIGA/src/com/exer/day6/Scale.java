package com.exer.day6;

import java.util.ArrayList;

public class Scale {
	
	
	public ArrayList<Ball> heavy = new ArrayList<Ball>();
	public ArrayList<Ball> light = new ArrayList<Ball>();
	public boolean isEqual = false;
	
	public int useScale = 3;
	
	public Scale() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Ball> weighScales(ArrayList<Ball> left, ArrayList<Ball> right){
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
	
	private int calculateWeight(ArrayList<Ball> balls) {
		int sumOfWeights = 0;
		
		for(Ball currBall : balls) {
			sumOfWeights += currBall.weight;
		}
		
		return sumOfWeights;
	}
	
	public void resetScale() {
		this.heavy = null;
		this.light = null;
		this.isEqual = false;
	}

}
