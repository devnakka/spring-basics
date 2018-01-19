package com.srikanthnakka.spring.basics.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


// @Qualifier > @Primary > ByName > ByType
@Component
public class BinarySearchImpl {
	
	@Autowired
//	@Qualifier("bubble")
	private SortAlgorithm bubbleSortAlgorithm;
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		System.out.println(bubbleSortAlgorithm);
		// Search the array
		return 3;
	}

}
