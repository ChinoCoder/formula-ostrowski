package edu.austral.ingsis.math.VisitorSolution;

import java.util.List;

public class Module implements Function {

    private final Function containedFunction;

    public Module(Function containedFunction) {
        this.containedFunction = containedFunction;
    }

}
