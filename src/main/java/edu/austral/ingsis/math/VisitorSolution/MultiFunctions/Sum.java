package edu.austral.ingsis.math.VisitorSolution.MultiFunctions;

import edu.austral.ingsis.math.VisitorSolution.Function;

public class Sum extends MultiFunction {

    public Sum(Function left, Function right) {
        super(left, right);
    }

    @Override
    String getOperator() {
        return "+";
    }
}
