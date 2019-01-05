package com.mission.designPatterns.strategy;

import com.mission.designPatterns.strategy.impl.AggresiveBehaviour;
import com.mission.designPatterns.strategy.impl.DefensiveBehaviour;

public class Client {

	// Strategy defines family of algorithms. If classes differ due to behavior, then this is an 
	// apt design pattern. This pattern stress on the principle "Favor composition over inheritance"
	public static void main(String[] args) {
		// Creating concrete strategies.
		IBehaviour aggresive = new AggresiveBehaviour();
		IBehaviour defensive = new DefensiveBehaviour();
		
		// Set behavior in the constructor (if required)
		Human h = new Human(aggresive);
		h.respond();
		
		// Behavior can be set dynamically so that to change it.
		h.setBehaviour(defensive);
		h.respond();
	}
}
