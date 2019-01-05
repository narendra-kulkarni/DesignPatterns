package com.mission.designPatterns.command;

public class Invoker {

	private Command command;

	private Command lastCommand;

	// In invoker instead of setting command, the commands can be stored in a temporary
	// collection like arraylist or queue and method(commands) can be invoked at a later
	// point in time.
	public void setCommand(Command c) {
		this.command = c;
	}

	public void invoke() {
		lastCommand = command;
		command.execute();
	}

	public void undo() {
		if (lastCommand != null)
			lastCommand.undo();
	}
}
