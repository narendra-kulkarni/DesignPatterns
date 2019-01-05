package com.mission.designPatterns.visitor.impl;

import com.mission.designPatterns.visitor.Visitable;
import com.mission.designPatterns.visitor.Visitor;

public class Smokes implements Visitable {

	private int cost;

	public Smokes(int cost) {
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}
	
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
