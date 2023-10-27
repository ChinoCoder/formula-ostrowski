package edu.austral.ingsis.math.CompositeSolution.MultiFunctions;

import edu.austral.ingsis.math.CompositeSolution.Function;

import java.util.List;

public class Sum extends MultiFunction {

    public Sum(Function left, Function right) {
        super(left, right);
    }

    @Override
    public long Resolution() {
        return getLeft().Resolution() + getRight().Resolution();
    }

    @Override
    String getOperator() {
        return "+";
    }
}
