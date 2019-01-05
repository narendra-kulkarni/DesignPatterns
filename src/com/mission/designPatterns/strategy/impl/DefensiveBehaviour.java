package com.mission.designPatterns.strategy.impl;

import com.mission.designPatterns.strategy.IBehaviour;

public class DefensiveBehaviour implements IBehaviour {

	@Override
	public void behave() {
		System.out.println("Behaving defensively.");
	}
}
