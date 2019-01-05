package com.mission.designPatterns.command;

// In command object receiver and action are bound to each other.
public interface Command {

	public void execute();
	
	public void undo();
}
