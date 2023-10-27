package edu.austral.ingsis.math.VisitorSolution.MultiFunctions;

import edu.austral.ingsis.math.VisitorSolution.Function;

public class Multiplication extends MultiFunction {
    public Multiplication(Function left, Function right) {
        super(left, right);
    }

    @Override
    String getOperator() {
        return "*";
    }
}
