package com.azhya.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SolutionService {
	
	/**
	 * DCP - 08/01/2023
	 * <br/>
	 * Topic of Focus: Dymanic Programming
	 * <br/>
	 * <p>
	 * Prompt: <br/>
	 * This problem was asked by Facebook.<br/>
	 * Given a list of integers, return the largest product that can be made by multiplying any three integers.<br/>
	 * For example, if the list is [-10, -10, 5, 2], we should return 500, since that's -10 * -10 * 5.<br/>
	 * You can assume the list has at least three integers.
	 * </p><br/>
	 * 
	 * Returns the largest product given an array of integers. The array must be at least of size of 3. Assume any integer can be of positive or negative value.
	 * 
	 * @author Azhya Knox
	 * @param list  the grouping of integer values
	 * @return      the single integer value that represents the maximum product of the list
	 * @see List
	 **/
	public int findMaxProduct(List<Integer> list) {
		int product = 1;
		//1. make sure list is sorted from least to greatest
		List<Integer> copy = new ArrayList<>(list);
		for(int i = 0; i < list.size(); i++) {
			copy.set(i, Math.abs(list.get(i)));
		}
		
		Collections.sort(list);
		Collections.sort(copy);
		
		//2. find the three largest values in the array (now regardless of +/- signs)
		List<Integer> maxFactors = copy.subList(copy.size() - 3, copy.size());
		for(int num : maxFactors) {
			//3. calculate the max product
			product *= num;
		}
		
		return product;
	}
}
