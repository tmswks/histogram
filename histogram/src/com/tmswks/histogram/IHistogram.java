package com.tmswks.histogram;

import java.util.List;

public interface IHistogram {
	final int SIZE_OF_SECTOR = 10;
	final int SECTORS = 10;

	int getIndexOfSector(int number);  
	void showSectorsAndContent();
	List<Integer> getNumbersInSectorByIndex(int index);
	void createHistogram();
}
