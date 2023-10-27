package edu.austral.ingsis.math.CompositeSolution.MultiFunctions;

import edu.austral.ingsis.math.CompositeSolution.Function;

import java.util.List;

public abstract class MultiFunction implements Function {
    private final Function left;
    private final Function right;


    public MultiFunction(Function left, Function right){
        this.left = left;
        this.right = right;
    }

    @Override
    public String print() {
        return "( " + left.print() + " " + getOperator() + " " + right.print() + " )";
    }
    @Override
    public List<String> listVariables() {
        List<String> leftList = left.listVariables();
        List<String> rightList = right.listVariables();
        leftList.addAll(rightList);
        return leftList;
    }
    public Function getLeft() {
        return left;
    }

    public Function getRight() {
        return right;
    }

    abstract String getOperator();
}
