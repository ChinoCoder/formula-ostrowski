package edu.austral.ingsis.math.VisitorSolution;

import edu.austral.ingsis.math.VisitorSolution.Visitor.FunctionVisitor;
import edu.austral.ingsis.math.VisitorSolution.Visitor.PrintFunctionVisitor;

import java.util.List;

public class Module implements Function {

    private final Function containedFunction;

    public Module(Function containedFunction) {
        this.containedFunction = containedFunction;
    }

    @Override
    public void accept(FunctionVisitor visitor) {
        visitor.visitModule(this);
    }

    public Function getContainedFunction(){
        return containedFunction;
    }
}
