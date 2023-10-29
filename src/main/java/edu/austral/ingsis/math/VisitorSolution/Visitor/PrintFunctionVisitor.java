package edu.austral.ingsis.math.VisitorSolution.Visitor;

import edu.austral.ingsis.math.VisitorSolution.Literal;
import edu.austral.ingsis.math.VisitorSolution.Module;
import edu.austral.ingsis.math.VisitorSolution.MultiFunctions.*;
import edu.austral.ingsis.math.VisitorSolution.Variable;

public class PrintFunctionVisitor implements FunctionVisitor{
    private String result;

    @Override
    public void visitLiteral(Literal literal) {
        if (literal.getValue() == (long) literal.getValue())
            result =  Integer.toString((int) literal.getValue());
        else result = Double.toString(literal.getValue());
    }
    @Override
    public void visitVariable(Variable variable) {
        result = variable.getName();
    }

    private void MultiFunctionPrint(String operator, MultiFunction multiFunction){
        multiFunction.getLeft().accept(this);
        String left = result;
        multiFunction.getRight().accept(this);
        String right = result;
        result = "( " + left + " " + operator + " " + right + " )";
    }
    @Override
    public void visitSum(Sum sum) {
        MultiFunctionPrint("+", sum);
    }
    @Override
    public void visitSubtraction(Substraction subtraction) {
        MultiFunctionPrint("-", subtraction);
    }
    @Override
    public void visitMultiplication(Multiplication multiplication) {
        MultiFunctionPrint("*", multiplication);
    }
    @Override
    public void visitDivision(Division division) {
        MultiFunctionPrint("/", division);
    }
    @Override
    public void visitPower(Power power) {
        MultiFunctionPrint("^", power);
    }
    @Override
    public void visitModule(Module module) {
        module.getContainedFunction().accept(this);
        result = "|" + result + "|";
    }

    public String getResult(){
        return result;
    }
}
