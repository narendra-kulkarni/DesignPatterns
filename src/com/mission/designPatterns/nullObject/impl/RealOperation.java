package com.mission.designPatterns.nullObject.impl;

import com.mission.designPatterns.nullObject.IOperation;

public class RealOperation implements IOperation {

	@Override
	public void perform() {
		System.out.println("Performing");
	}
}
