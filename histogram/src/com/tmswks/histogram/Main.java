package com.tmswks.histogram;

import java.util.List;

public class Main {		

	public static void main(String[] args) {
		RandomList randomList = new RandomList();
		randomList.createRandomList();
		List<Integer> rList = randomList.getRandomList();
		System.out.println("Random numbers list: "+rList);
		Histogram histogram = new Histogram(rList);
		histogram.createHistogram();

		List<Integer> histogramList = histogram.getHistogramList();
		System.out.println("Histogram list: "+histogramList);

		histogram.showSectorsAndContent();
	}

}
