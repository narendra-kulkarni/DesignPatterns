package com.mission.designPatterns.visitor;

import com.mission.designPatterns.visitor.impl.Food;
import com.mission.designPatterns.visitor.impl.Luxury;
import com.mission.designPatterns.visitor.impl.Smokes;

public interface Visitor {

	void visit(Food food);

	void visit(Smokes smokes);

	void visit(Luxury luxury);

}
