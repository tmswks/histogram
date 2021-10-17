package com.tmswks.histogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList implements IRandomList {

	private List<Integer> randomList;
	
	public RandomList() {
		this.randomList = new ArrayList<Integer> ();
	}
	
	public List<Integer> getRandomList(){
		return this.randomList;		
	}
	
	@Override
	public int getRandomNumb() {
		Random rand = new Random();
		return rand.nextInt(MAX)+MIN;
	}
	
	@Override
	public void createRandomList() {
		if(this.randomList.size() != 0) {this.randomList.clear();}
			
		for (int i = 0; i < SIZE; i++) this.randomList.add(getRandomNumb());
	 
	}

}
