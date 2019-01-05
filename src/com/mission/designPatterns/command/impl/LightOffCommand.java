package com.mission.designPatterns.command.impl;

import com.mission.designPatterns.command.Command;

public class LightOffCommand implements Command {

	private Light light;
	
	public LightOffCommand(Light l) {
		this.light = l;
	}
	
	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}
}
