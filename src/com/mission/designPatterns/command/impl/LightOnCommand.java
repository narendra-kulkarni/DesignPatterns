package com.mission.designPatterns.command.impl;

import com.mission.designPatterns.command.Command;

// Here receiver class light is bound to the actions to be performed. 
public class LightOnCommand implements Command {

	private Light light;

	public LightOnCommand(Light l) {
		this.light = l;
	}

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}
}
