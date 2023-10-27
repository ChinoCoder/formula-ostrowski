package edu.austral.ingsis.math.CompositeSolution.MultiFunctions;

import edu.austral.ingsis.math.CompositeSolution.Function;

public class Multiplication extends MultiFunction{
    public Multiplication(Function left, Function right) {
        super(left, right);
    }

    @Override
    public double Resolution() {
        return getLeft().Resolution() * getRight().Resolution();
    }

    @Override
    String getOperator() {
        return "*";
    }
}
