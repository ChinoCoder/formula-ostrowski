package edu.austral.ingsis.math.VisitorSolution.Visitor;

import edu.austral.ingsis.math.VisitorSolution.Literal;
import edu.austral.ingsis.math.VisitorSolution.Module;
import edu.austral.ingsis.math.VisitorSolution.MultiFunctions.*;
import edu.austral.ingsis.math.VisitorSolution.Variable;

public interface FunctionVisitor {
    void visitLiteral(Literal literal);
    void visitVariable(Variable variable);
    void visitSum(Sum addition);
    void visitSubtraction(Substraction subtraction);
    void visitMultiplication(Multiplication multiplication);
    void visitDivision(Division division);
    void visitPower(Power power);
    void visitModule(Module module);
}
