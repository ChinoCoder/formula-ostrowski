package edu.austral.ingsis.math.CompositeSolution.MultiFunctions;

import edu.austral.ingsis.math.CompositeSolution.Function;

public class Power extends MultiFunction{
    public Power(Function left, Function right) {
        super(left, right);
    }

    @Override
    public long Resolution() {
        return getLeft().Resolution() ^ getRight().Resolution();
    }

    @Override
    String getOperator() {
        return "^";
    }
}
