package com.mission.designPatterns.command;

import com.mission.designPatterns.command.impl.Fan;
import com.mission.designPatterns.command.impl.FanFastCommand;
import com.mission.designPatterns.command.impl.FanSlowCommand;
import com.mission.designPatterns.command.impl.Light;
import com.mission.designPatterns.command.impl.LightOffCommand;
import com.mission.designPatterns.command.impl.LightOnCommand;

public class Client {

	public static void main(String[] args) {
		// Create invoker. Invoker executes command
		Invoker i = new Invoker();
		
		// Create receiver objects. The receiver objects are the one who perform the 
		// actual operation.
		Light l = new Light();
		Fan f = new Fan();
		
		// Create concrete commands. Encapsulation of method invocation. It binds receiver
		// and action (method invocation) together.
		Command lighton = new LightOnCommand(l);
		Command lightoff = new LightOffCommand(l);
		Command fanfast = new FanFastCommand(f);
		Command fanslow = new FanSlowCommand(f);
		
		// Set command on invoker and invoke the action
		i.setCommand(lighton);
		i.invoke();
		
		i.setCommand(lightoff);
		i.invoke();
		
		i.undo();
		
		i.setCommand(fanfast);
		i.invoke();
		
		i.setCommand(fanslow);
		i.invoke();
	}
}
