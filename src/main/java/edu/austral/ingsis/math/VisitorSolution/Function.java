package edu.austral.ingsis.math.VisitorSolution;

import edu.austral.ingsis.math.VisitorSolution.Visitor.FunctionVisitor;
import edu.austral.ingsis.math.VisitorSolution.Visitor.PrintFunctionVisitor;

import java.util.List;

public interface Function {
    public void accept(FunctionVisitor visitor);

}
