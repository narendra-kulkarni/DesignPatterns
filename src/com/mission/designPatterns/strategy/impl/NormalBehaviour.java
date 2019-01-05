package com.mission.designPatterns.strategy.impl;

import com.mission.designPatterns.strategy.IBehaviour;

public class NormalBehaviour implements IBehaviour {

	@Override
	public void behave() {
		System.out.println("Behaving normally.");
	}
}
