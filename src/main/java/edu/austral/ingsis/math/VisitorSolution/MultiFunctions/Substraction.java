package edu.austral.ingsis.math.VisitorSolution.MultiFunctions;

import edu.austral.ingsis.math.VisitorSolution.Function;

public class Substraction extends MultiFunction {

    public Substraction(Function left, Function right) {
        super(left, right);
    }

    @Override
    String getOperator() {
        return "-";
    }
}
