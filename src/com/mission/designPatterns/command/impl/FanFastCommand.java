package com.mission.designPatterns.command.impl;

import com.mission.designPatterns.command.Command;

public class FanFastCommand implements Command {

	private Fan fan;
	
	public FanFastCommand(Fan f) {
		this.fan = f;
	}

	@Override
	public void execute() {
		fan.fast();
	}

	@Override
	public void undo() {
		fan.slow();
	}
}
