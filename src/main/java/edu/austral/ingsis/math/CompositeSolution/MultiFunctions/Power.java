package edu.austral.ingsis.math.CompositeSolution.MultiFunctions;

import edu.austral.ingsis.math.CompositeSolution.Function;

public class Power extends MultiFunction{
    public Power(Function left, Function right) {
        super(left, right);
    }

    @Override
    public double Resolution() {
        return Math.pow(this.getLeft().Resolution(), this.getRight().Resolution());
    }

    @Override
    String getOperator() {
        return "^";
    }
}
