package edu.austral.ingsis.math.VisitorSolution.MultiFunctions;

import edu.austral.ingsis.math.VisitorSolution.Function;

public class Power extends MultiFunction {
    public Power(Function left, Function right) {
        super(left, right);
    }

    @Override
    String getOperator() {
        return "^";
    }
}
