package edu.austral.ingsis.math.VisitorSolution.MultiFunctions;

import edu.austral.ingsis.math.VisitorSolution.Function;

public class Division extends MultiFunction {
    public Division(Function left, Function right) {
        super(left, right);
    }

    @Override
    String getOperator() {
        return "/";
    }
}
