package com.mission.designPatterns.visitor;

import java.util.Arrays;
import java.util.List;

import com.mission.designPatterns.visitor.impl.Food;
import com.mission.designPatterns.visitor.impl.Luxury;
import com.mission.designPatterns.visitor.impl.Smokes;
import com.mission.designPatterns.visitor.impl.TaxCalculator;

public class Client {

	public static void main(String[] args) {
		Food f = new Food(25);
		Smokes s = new Smokes(40);
		Luxury l = new Luxury(100);
		System.out.println("Total cost : " + (f.getCost() + s.getCost() + l.getCost()));
	
		List<Visitable> list = Arrays.asList(f, s, l);
		TaxCalculator tc = new TaxCalculator();
		for (Visitable visitable : list)
			visitable.accept(tc);
		System.out.println("Total cost after tax : " + tc.getTotalCost());
	}
}
