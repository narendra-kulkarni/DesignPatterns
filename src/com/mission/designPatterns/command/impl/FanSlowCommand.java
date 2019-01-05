package com.mission.designPatterns.command.impl;

import com.mission.designPatterns.command.Command;

public class FanSlowCommand implements Command {

	private Fan fan;
	
	public FanSlowCommand(Fan f) {
		this.fan = f;
	}

	@Override
	public void execute() {
		fan.slow();
	}

	@Override
	public void undo() {
		fan.fast();
	}
}
