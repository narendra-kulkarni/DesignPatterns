package com.mission.designPatterns.strategy;

public class Human {

	private IBehaviour behaviour;
	
	public Human(IBehaviour h) {
		this.behaviour = h;
	}
	
	public void setBehaviour(IBehaviour h) {
		this.behaviour = h;
	}
	
	public void respond() {
		behaviour.behave();
	}
}
