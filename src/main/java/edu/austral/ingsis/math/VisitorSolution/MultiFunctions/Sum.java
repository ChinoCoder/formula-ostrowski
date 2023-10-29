package edu.austral.ingsis.math.VisitorSolution.MultiFunctions;

import edu.austral.ingsis.math.VisitorSolution.Function;
import edu.austral.ingsis.math.VisitorSolution.Visitor.FunctionVisitor;
import edu.austral.ingsis.math.VisitorSolution.Visitor.PrintFunctionVisitor;

public class Sum extends MultiFunction {

    public Sum(Function left, Function right) {
        super(left, right);
    }

    @Override
    String getOperator() {
        return "+";
    }

    @Override
    public void accept(FunctionVisitor visitor) {
        visitor.visitSum(this);
    }
}
