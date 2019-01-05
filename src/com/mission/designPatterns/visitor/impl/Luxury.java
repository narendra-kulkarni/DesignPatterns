package com.mission.designPatterns.visitor.impl;

import com.mission.designPatterns.visitor.Visitable;
import com.mission.designPatterns.visitor.Visitor;

public class Luxury implements Visitable {

	private int cost;

	public Luxury(int cost) {
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
