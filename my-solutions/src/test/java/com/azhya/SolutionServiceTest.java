package com.azhya;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
//import org.junit.Ignore; //used mostly for isolating test while debugging

import com.azhya.main.SolutionService;
import com.azhya.util.Order;

@RunWith(OrderedRunner.class)
public class SolutionServiceTest {
	private static final SolutionService solutionService = new SolutionService();

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	/*******************************************************************
	 * Question 1
	 ******************************************************************/
	@Test
	@Order(order = 1)
	public void findMaxProductBaseCase() {
		List<Integer> list = new ArrayList<>();
		list.add(-10);
		list.add(-10);
		list.add(5);
		list.add(2);
		assertEquals(500, solutionService.findMaxProduct(list));
	}
}
