package edu.austral.ingsis.math.CompositeSolution;

import java.util.List;

public class Module implements Function{

    private final Function containedFunction;

    public Module(Function containedFunction) {
        this.containedFunction = containedFunction;
    }

    @Override
    public long Resolution() {
        return Math.abs(containedFunction.Resolution());
    }

    @Override
    public String print() {
        return "| " + containedFunction.print() + " |";
    }

    @Override
    public List<String> listVariables() {
        return containedFunction.listVariables();
    }
}
