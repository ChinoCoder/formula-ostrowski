package edu.austral.ingsis.math.VisitorSolution.Visitor;

import edu.austral.ingsis.math.VisitorSolution.Literal;
import edu.austral.ingsis.math.VisitorSolution.Module;
import edu.austral.ingsis.math.VisitorSolution.MultiFunctions.*;
import edu.austral.ingsis.math.VisitorSolution.Variable;

import java.util.ArrayList;
import java.util.List;

public class ListVariablesVisitor implements FunctionVisitor{
    private List<String> result = new ArrayList<>();

    @Override
    public void visitLiteral(Literal literal) {

    }

    @Override
    public void visitVariable(Variable variable) {
        result.add(variable.getName());
    }

    public void visitMulti(MultiFunction multiFunction) {
        multiFunction.getLeft().accept(this);
        multiFunction.getRight().accept(this);
    }

    @Override
    public void visitSum(Sum addition) {
        visitMulti(addition);
    }

    @Override
    public void visitSubtraction(Substraction subtraction) {
        visitMulti(subtraction);
    }

    @Override
    public void visitMultiplication(Multiplication multiplication) {
        visitMulti(multiplication);
    }

    @Override
    public void visitDivision(Division division) {
        visitMulti(division);
    }

    @Override
    public void visitPower(Power power) {
        visitMulti(power);
    }

    @Override
    public void visitModule(Module module) {
        module.getContainedFunction().accept(this);
    }

    public List<String> getResult() {
        return result;
    }
}
