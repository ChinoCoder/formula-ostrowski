package edu.austral.ingsis.math.VisitorSolution.MultiFunctions;

import edu.austral.ingsis.math.VisitorSolution.Function;

import java.util.ArrayList;
import java.util.List;

public abstract class MultiFunction implements Function {
    private final Function left;
    private final Function right;


    public MultiFunction(Function left, Function right){
        this.left = left;
        this.right = right;
    }

    public Function getLeft() {
        return left;
    }

    public Function getRight() {
        return right;
    }

    abstract String getOperator();
}
