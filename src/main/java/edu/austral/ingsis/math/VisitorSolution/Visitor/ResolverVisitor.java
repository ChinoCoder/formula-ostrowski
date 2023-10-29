package edu.austral.ingsis.math.VisitorSolution.Visitor;

import edu.austral.ingsis.math.VisitorSolution.Literal;
import edu.austral.ingsis.math.VisitorSolution.Module;
import edu.austral.ingsis.math.VisitorSolution.MultiFunctions.*;
import edu.austral.ingsis.math.VisitorSolution.Variable;

public class ResolverVisitor implements FunctionVisitor{
    private double result = 0;
    @Override
    public void visitLiteral(Literal literal) {
        result = literal.getValue();
    }

    @Override
    public void visitVariable(Variable variable) {
        result = variable.getValue();
    }

    @Override
    public void visitSum(Sum addition) {
        addition.getLeft().accept(this);
        double left = result;
        addition.getRight().accept(this);
        double right = result;
        result = left + right;
    }

    @Override
    public void visitSubtraction(Substraction subtraction) {
        subtraction.getLeft().accept(this);
        double left = result;
        subtraction.getRight().accept(this);
        double right = result;
        result = left - right;
    }

    @Override
    public void visitMultiplication(Multiplication multiplication) {
        multiplication.getLeft().accept(this);
        double left = result;
        multiplication.getRight().accept(this);
        double right = result;
        result = left * right;
    }

    @Override
    public void visitDivision(Division division) {
        division.getLeft().accept(this);
        double left = result;
        division.getRight().accept(this);
        double right = result;
        result = left / right;
    }

    @Override
    public void visitPower(Power power) {
        power.getLeft().accept(this);
        double left = result;
        power.getRight().accept(this);
        double right = result;
        result = Math.pow(left, right);
    }

    @Override
    public void visitModule(Module module) {
        module.getContainedFunction().accept(this);
        result = Math.abs(result);
    }

    public double getResult() {
        return result;
    }
}
