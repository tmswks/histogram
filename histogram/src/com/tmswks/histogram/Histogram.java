package com.tmswks.histogram;

import java.util.ArrayList;
import java.util.List;

public class Histogram implements IHistogram {

	private List<Integer> numbersList;
	private List<Integer> histogramList;

	public Histogram(List<Integer> n) {
		this.numbersList = n;		
		this.histogramList = new ArrayList<Integer>();
		for(int i = 0; i < SECTORS; i++) this.histogramList.add(0);
	}
	
	public List<Integer> getNumbersList(){
		return this.numbersList;		
	}
	
	public List<Integer> getHistogramList(){
		return this.histogramList;		
	}

	@Override
	public int getIndexOfSector(int number) {
		return (int) Math.round(number/SIZE_OF_SECTOR);
	}

	@Override
	public void createHistogram() {
		for(int i = 0; i < numbersList.size(); i++) { 
			int key = getIndexOfSector(numbersList.get(i));
			histogramList.set(key, histogramList.get(key)+1); 
		}
	}

	@Override
	public void showSectorsAndContent() {
		System.out.println("[index: begin - end -> number list]");
		for(int index=0; index<SECTORS; index++) {
			int begin = index*SIZE_OF_SECTOR;
			int end = index*SIZE_OF_SECTOR+SIZE_OF_SECTOR-1;
			System.out.println(index+": "+begin+" - "+end+" -> "+getNumbersInSectorByIndex(index));
		}		
	}

	@Override
	public List<Integer> getNumbersInSectorByIndex(int index) {
		List<Integer> p = new ArrayList<Integer>();
		for(int i = 0; i < numbersList.size(); i++) { 
			int val = numbersList.get(i);
			if(getIndexOfSector(val) == index) {
				p.add(val);
			} 
		}
		return p;
	}
	
	
	
//	@Override
//	public int getIndexOfSector(int number) { 
//		return (int) Math.round(number/SIZE_OF_SECTOR);
//	}
//	
//	@Override
//	public void showRanges() {
//		for(int index=0; index<SECTORS; index++) {
//			int start = index*SIZE_OF_SECTOR;
//			int end = index*SIZE_OF_SECTOR+SIZE_OF_SECTOR-1;
//			System.out.println(index+": "+start+" - "+end+" -> "+getNumbersInSectorByIndex(index));
//		}
//		
//	}
//	
//	@Override
//	public List<Integer> getNumbersInSectorByIndex(int ind) {
//		List<Integer> p = new ArrayList<Integer>();
//		for(int i = 0; i < numbersList.size(); i++) { 
//			int val = numbersList.get(i);
//			if(getIndexOfSector(val) == ind) {
//				p.add(val);
//			} 
//		}
//		return p;
//		
//	}
//
//	@Override
//	public void createHistogram() {
//		for(int i = 0; i < numbersList.size(); i++) { 
//			int key = getIndexOfSector(numbersList.get(i));
//			histogramList.set(key, histogramList.get(key)+1); 
//		} 
//	}
//
//	@Override
//	public List<Integer> getHistogram() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
