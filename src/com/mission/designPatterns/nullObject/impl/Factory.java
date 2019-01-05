package com.mission.designPatterns.nullObject.impl;

import com.mission.designPatterns.nullObject.IOperation;

public class Factory {

	// Null object pattern is generally used with the factory pattern.
	public static IOperation getOperation(int i) {
		// Some operation is to be performed, if the given number is even
		if (i % 2 == 0)
			return new RealOperation();
		else
			return new NullOperation();
	}
}
